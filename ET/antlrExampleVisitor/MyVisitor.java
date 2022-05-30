import gen.Example2BaseVisitor;
import gen.Example2Parser;
import java.util.*;
import java.util.stream.LongStream;


public class MyVisitor extends Example2BaseVisitor<Variable>
{
    private final Map<String, Variable> variables = new HashMap<>();
    private final Map<String, Variable> local_variables = new HashMap<>();
    private final Map<String, Example2Parser.Function_definitionContext> functions = new HashMap<>();

    private String out = "";

    public String getOut() {
        return out;
    }

    @Override
    public Variable visitAssignment(Example2Parser.AssignmentContext ctx) {
        String id = ctx.VALUE().getText();
        Variable value = null;
        if (ctx.children.get(1).getText().equals("+=")) {
            Variable old = local_variables.get(id);
            if (old == null)
                old = variables.get(id);
            if (old == null) {
                new TypeMismatchException("There is no variable with name: " + id).printStackTrace();
            } else {
                try {
                    Variable result = new Variable();
                    result.concatVariables(this.visit(ctx.expression()), old);
                    value = result;
                } catch (TypeMismatchException e) {
                    e.printStackTrace();
                }
            }
        } else if (ctx.children.get(1).getText().equals("-=")) {
            Variable old = local_variables.get(id);
            if (old == null)
                old = variables.get(id);
            if (old == null) {
                new TypeMismatchException("There is no variable with name: " + id).printStackTrace();
            } else {
                value = new Variable(old.getNumber() - this.visit(ctx.expression()).getNumber());
            }
        } else if (ctx.children.stream().anyMatch(e -> e.getText().equals("="))) {
            value = this.visit(ctx.expression());
        }
        if (local_variables.get(id) != null)
            return local_variables.put(id, value);
        return variables.put(id, value);
    }

    @Override
    public Variable visitPrint(Example2Parser.PrintContext ctx) {
        var variable = this.visit(ctx.expression());

        out += (!out.equals("") ? "\n" : "") + variable.getValue();
        System.out.println(variable.getValue());
        return variable;
    }

    @Override
    public Variable visitValueExpression(Example2Parser.ValueExpressionContext ctx) {
        // Retrieve value of variable from memory.
        String name = ctx.getText();
        Variable value = local_variables.get(name);
        if (value == null)
            value = variables.get(name);

        if (value == null) {
            new TypeMismatchException("There is no variable with name: " + name).printStackTrace();
        }

        return value;
    }

    @Override
    public Variable visitNumberExpression(Example2Parser.NumberExpressionContext ctx) {
        return new Variable(Integer.parseInt(ctx.getText()));
    }

    @Override
    public Variable visitStringExpression(Example2Parser.StringExpressionContext ctx) {
        return new Variable(ctx.getText().substring(1, ctx.getText().length() - 1));
    }

    @Override
    public Variable visitBooleanExpression(Example2Parser.BooleanExpressionContext ctx) {
        return new Variable(ctx.getText().equals("true"));
    }

    @Override
    public Variable visitPowerExpression(Example2Parser.PowerExpressionContext ctx) {
        var left = this.visit(ctx.expression(0)).getNumber();
        var right = this.visit(ctx.expression(1)).getNumber();
        return new Variable((int) Math.pow(left, right));
    }

    @Override
    public Variable visitModulusExpression(Example2Parser.ModulusExpressionContext ctx) {
        var left = this.visit(ctx.expression(0)).getNumber();
        var right = this.visit(ctx.expression(1)).getNumber();
        return new Variable(left % right);
    }

    @Override
    public Variable visitMultiplicationExpression(Example2Parser.MultiplicationExpressionContext ctx) {
        var left = this.visit(ctx.expression(0)).getNumber();
        var right = this.visit(ctx.expression(1)).getNumber();

        // Operation
        if (ctx.getChild(1).getText().equals("*")) {
            return new Variable(left * right);
        } else {
            return new Variable(left / right);
        }
    }

    @Override
    public Variable visitAdditionExpression(Example2Parser.AdditionExpressionContext ctx) {
        Variable left = this.visit(ctx.expression(0));
        Variable right = this.visit(ctx.expression(1));
        var result = new Variable();

        // Operation
        if (ctx.getChild(1).getText().equals("+")) {
            try {
                result.concatVariables(left, right);
            } catch (TypeMismatchException e) {
                e.printStackTrace();
            }
        } else {
            Integer subtract = left.getNumber() - right.getNumber();
            result.setNumber(subtract);
        }

        return result;
    }

    @Override
    public Variable visitFactorialExpression(Example2Parser.FactorialExpressionContext ctx) {
        Variable number = this.visit(ctx.expression());
        number.setNumber((int) LongStream.rangeClosed(1, number.getNumber())
                .reduce(1, (long x, long y) -> x * y));
        return number;
    }

    @Override
    public Variable visitComparisonExpression(Example2Parser.ComparisonExpressionContext ctx) {
        var left = this.visit(ctx.expression(0)).getNumber();
        var right = this.visit(ctx.expression(1)).getNumber();

        switch (ctx.getChild(1).getText()) {
            case ">":
                return new Variable(left > right);
            case "<":
                return new Variable(left < right);
            case "<=":
                return new Variable(left <= right);
            case ">=":
                return new Variable(left >= right);
            case "==":
                return new Variable(left.equals(right));
            case "!=":
                return new Variable(!left.equals(right));
            default:
                return new Variable();
        }
    }

    @Override
    public Variable visitAndExpression(Example2Parser.AndExpressionContext ctx) {
        return new Variable(this.visit(ctx.expression(0)).getBool() && this.visit(ctx.expression(1)).getBool());
    }

    @Override
    public Variable visitOrExpression(Example2Parser.OrExpressionContext ctx) {
        return new Variable(this.visit(ctx.expression(0)).getBool() || this.visit(ctx.expression(1)).getBool());
    }

    @Override
    public Variable visitParenthesisExpression(Example2Parser.ParenthesisExpressionContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Variable visitIf_statement(Example2Parser.If_statementContext ctx) {
        List<Example2Parser.Condition_blockContext> conditions = ctx.condition_block();

        var evaluatedBlock = false;

        for (Example2Parser.Condition_blockContext condition : conditions) {

            Variable evaluated = this.visit(condition.expression());

            if (Boolean.TRUE.equals(evaluated.getBool())) {
                evaluatedBlock = true;

                this.visit(condition.code_block());
                break;
            }
        }

        if (!evaluatedBlock && ctx.code_block() != null) {
            // Evaluate the else code block if it is present
            this.visit(ctx.code_block());
        }

        return new Variable();
    }

    @Override
    public Variable visitWhile_statement(Example2Parser.While_statementContext ctx) {
        Example2Parser.Condition_blockContext condition = ctx.condition_block();

        Variable value = this.visit(condition.expression());

        while (Boolean.TRUE.equals(value.getBool())) {
            // Visit code block
            this.visit(condition.code_block());

            // Evaluate expression
            value = this.visit(condition.expression());
        }
        return new Variable();
    }

    @Override
    public Variable visitFunction_definition(Example2Parser.Function_definitionContext ctx) {
        functions.put(ctx.VALUE().getText(), ctx);
        return new Variable();
    }

    @Override
    public Variable visitFunction_call(Example2Parser.Function_callContext ctx) {
        // Get the function from memory (functions map).
        var function = functions.get(ctx.VALUE().getText());
        // Get all the statements from the function.
        List<Example2Parser.StatementContext> statements = function.code_block().statement();

        Map<String, Variable> local = new HashMap<>();

        // Check if the call is correct in number of arguments / parameters.
        if (function.arguments().getChildCount() != ctx.arguments().getChildCount()) {
            new ArgumentMismatchException("Number of parameters does not match.").printStackTrace();
        }

        // Go through all arguments and add them to memory.
        for (var i = 0; i < function.arguments().getChildCount(); i++) {
            var variable = this.visit(ctx.arguments().getChild(i));
            // Insert variable at start of list
            local.put(function.arguments().getChild(i).getText(), variable);
        }

        local_variables.putAll(local);

        var result = new Variable();

        // Visit all statements in the code block.
        for (Example2Parser.StatementContext statement : statements) {
            var s = this.visit(statement);
            // If the statement is a return statement, set result to statement result, and break the function
            if (statement.return_statement() != null) {
                result = s;
                break;
            }
        }

        local_variables.clear();

        return result;
    }

    @Override
    public Variable visitReturn_statement(Example2Parser.Return_statementContext ctx) {
        return this.visit(ctx.expression());
    }

}