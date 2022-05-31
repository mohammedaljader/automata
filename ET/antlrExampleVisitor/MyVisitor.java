import gen.Example2BaseVisitor;
import gen.Example2Parser;
import java.util.*;
import java.util.stream.LongStream;


public class MyVisitor extends Example2BaseVisitor<Value>
{
    private final Map<String, Value> variables = new HashMap<>();
    private final Map<String, Value> local_variables = new HashMap<>();
    private final Map<String, Example2Parser.Function_definitionContext> functions = new HashMap<>();

    private String out = "";

    public String getOut() {
        return out;
    }

    @Override
    public Value visitAssignment(Example2Parser.AssignmentContext ctx) {
        String id = ctx.VALUE().getText();
        Value value = null;
        if (ctx.children.get(1).getText().equals("+=")) {
            Value old = local_variables.get(id);
            if (old == null)
                old = variables.get(id);
            if (old == null) {
                new TypeMismatchException("There is no variable with name: " + id).printStackTrace();
            } else {
                try {
                    Value result = new Value();
                    result.concatVariables(this.visit(ctx.expression()), old);
                    value = result;
                } catch (TypeMismatchException e) {
                    e.printStackTrace();
                }
            }
        } else if (ctx.children.get(1).getText().equals("-=")) {
            Value old = local_variables.get(id);
            if (old == null)
                old = variables.get(id);
            if (old == null) {
                new TypeMismatchException("There is no variable with name: " + id).printStackTrace();
            } else {
                value = new Value(old.getNumber() - this.visit(ctx.expression()).getNumber());
            }
        } else if (ctx.children.stream().anyMatch(e -> e.getText().equals("="))) {
            value = this.visit(ctx.expression());
        }else if (ctx.children.stream().anyMatch(e -> e.getText().equals("++"))) {
            Value old = local_variables.get(id);
            if (old == null)
                old = variables.get(id);
            if (old == null) {
                new TypeMismatchException("There is no variable with name: " + id).printStackTrace();
            } else {
                Value result = new Value();
                result.setNumber(old.getNumber() + 1);
                value = result;
            }
        }else if (ctx.children.stream().anyMatch(e -> e.getText().equals("--"))) {
            Value old = local_variables.get(id);
            if (old == null)
                old = variables.get(id);
            if (old == null) {
                new TypeMismatchException("There is no variable with name: " + id).printStackTrace();
            } else {
                Value result = new Value();
                result.setNumber(old.getNumber() - 1);
                value = result;
            }
        }
        if (local_variables.get(id) != null)
            return local_variables.put(id, value);
        return variables.put(id, value);
    }

    @Override
    public Value visitPrint(Example2Parser.PrintContext ctx) {
        var variable = this.visit(ctx.expression());

        out += (!out.equals("") ? "\n" : "") + variable.getValue();
        System.out.println(variable.getValue());
        return variable;
    }

    @Override
    public Value visitValueExpression(Example2Parser.ValueExpressionContext ctx) {
        // Retrieve value of variable from memory.
        String name = ctx.getText();
        Value value = local_variables.get(name);
        if (value == null)
            value = variables.get(name);

        if (value == null) {
            new TypeMismatchException("There is no variable with name: " + name).printStackTrace();
        }

        return value;
    }

    @Override
    public Value visitNumberExpression(Example2Parser.NumberExpressionContext ctx) {
        return new Value(Integer.parseInt(ctx.getText()));
    }

    @Override
    public Value visitStringExpression(Example2Parser.StringExpressionContext ctx) {
        return new Value(ctx.getText().substring(1, ctx.getText().length() - 1));
    }

    @Override
    public Value visitBooleanExpression(Example2Parser.BooleanExpressionContext ctx) {
        return new Value(ctx.getText().equals("true"));
    }

    @Override
    public Value visitPowerExpression(Example2Parser.PowerExpressionContext ctx) {
        var left = this.visit(ctx.expression(0)).getNumber();
        var right = this.visit(ctx.expression(1)).getNumber();
        return new Value((int) Math.pow(left, right));
    }

    @Override
    public Value visitModulusExpression(Example2Parser.ModulusExpressionContext ctx) {
        var left = this.visit(ctx.expression(0)).getNumber();
        var right = this.visit(ctx.expression(1)).getNumber();
        return new Value(left % right);
    }

    @Override
    public Value visitMultiplicationExpression(Example2Parser.MultiplicationExpressionContext ctx) {
        var left = this.visit(ctx.expression(0)).getNumber();
        var right = this.visit(ctx.expression(1)).getNumber();

        // Operation
        if (ctx.getChild(1).getText().equals("*")) {
            return new Value(left * right);
        } else {
            return new Value(left / right);
        }
    }

    @Override
    public Value visitAdditionExpression(Example2Parser.AdditionExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));
        var result = new Value();

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
    public Value visitFactorialExpression(Example2Parser.FactorialExpressionContext ctx) {
        Value number = this.visit(ctx.expression());
        number.setNumber((int) LongStream.rangeClosed(1, number.getNumber())
                .reduce(1, (long x, long y) -> x * y));
        return number;
    }

    @Override
    public Value visitComparisonExpression(Example2Parser.ComparisonExpressionContext ctx) {
        var left = this.visit(ctx.expression(0)).getNumber();
        var right = this.visit(ctx.expression(1)).getNumber();

        switch (ctx.getChild(1).getText()) {
            case ">":
                return new Value(left > right);
            case "<":
                return new Value(left < right);
            case "<=":
                return new Value(left <= right);
            case ">=":
                return new Value(left >= right);
            case "==":
                return new Value(left.equals(right));
            case "!=":
                return new Value(!left.equals(right));
            default:
                return new Value();
        }
    }

    @Override
    public Value visitAndExpression(Example2Parser.AndExpressionContext ctx) {
        return new Value(this.visit(ctx.expression(0)).getBool() && this.visit(ctx.expression(1)).getBool());
    }

    @Override
    public Value visitOrExpression(Example2Parser.OrExpressionContext ctx) {
        return new Value(this.visit(ctx.expression(0)).getBool() || this.visit(ctx.expression(1)).getBool());
    }

    @Override
    public Value visitParenthesisExpression(Example2Parser.ParenthesisExpressionContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Value visitIf_statement(Example2Parser.If_statementContext ctx) {
        List<Example2Parser.Condition_blockContext> conditions = ctx.condition_block();

        var evaluatedBlock = false;

        for (Example2Parser.Condition_blockContext condition : conditions) {

            Value evaluated = this.visit(condition.expression());

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

        return new Value();
    }

    @Override
    public Value visitWhile_statement(Example2Parser.While_statementContext ctx) {
        Example2Parser.Condition_blockContext condition = ctx.condition_block();

        Value value = this.visit(condition.expression());

        while (Boolean.TRUE.equals(value.getBool())) {
            // Visit code block
            this.visit(condition.code_block());

            // Evaluate expression
            value = this.visit(condition.expression());
        }
        return new Value();
    }

    @Override
    public Value visitFunction_definition(Example2Parser.Function_definitionContext ctx) {
        functions.put(ctx.VALUE().getText(), ctx);
        return new Value();
    }

    @Override
    public Value visitFunction_call(Example2Parser.Function_callContext ctx) {
        // Get the function from memory (functions map).
        var function = functions.get(ctx.VALUE().getText());
        // Get all the statements from the function.
        List<Example2Parser.StatementContext> statements = function.code_block().statement();

        Map<String, Value> local = new HashMap<>();

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

        var result = new Value();

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
    public Value visitReturn_statement(Example2Parser.Return_statementContext ctx) {
        return this.visit(ctx.expression());
    }

}