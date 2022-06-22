import gen.Example2BaseVisitor;
import gen.Example2Lexer;
import gen.Example2Parser;
import gen.Example2Visitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class Value {

    public static Value VOID = new Value(new Object());

    final Object value;

    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Integer asInteger() {
        return (Integer)value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}


class MyVisitor extends Example2BaseVisitor<Value> {
    private final Map<String, Value> valuesHashMap = new HashMap<>();
//    private final Map<String, Value> recordsHashMap = new HashMap<>();

    @Override
    public Value visitTerminal(TerminalNode node) {
        return (new Value(node.getText()));
    }

    @Override
    public Value visitPrint_statement(Example2Parser.Print_statementContext ctx) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < ctx.expression().size(); i++) {
            Value value = this.visit(ctx.expression(i));
            if(i == 0){
                output.append(value.asString());
            }else {
                output.append(", ").append(value.asString());
            }
        }
        System.err.println(output);
        return Value.VOID;
    }

    @Override
    public Value visitIntegerValue(Example2Parser.IntegerValueContext ctx) {
        return this.visit(ctx.INT());
    }

    @Override
    public Value visitParentheses(Example2Parser.ParenthesesContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Value visitAssign_variables(Example2Parser.Assign_variablesContext ctx) {
        // a temporary hashmap to update the variables that already exist in the original hashmap
        Map<String, Value> temp = new HashMap<>();
        if (ctx.ID().size() == ctx.expression().size()){
            for (int i = 0; i < ctx.ID().size(); i++) {
                String id =  ctx.ID(i).getText();
                Value rtnval = this.visit(ctx.expression(i));
                // If the variable does not exist, then add it to the original hashmap
                if (!valuesHashMap.containsKey(id)){
                    valuesHashMap.put(id,rtnval);
                }

                System.err.println(id+ " = " + rtnval.toString());
                //Otherwise, add it to the temp hashmap
                temp.put(id, rtnval);
            }
            // update the original hashmap with the updated values
            valuesHashMap.putAll(temp);
        }
        else {
            System.err.println("Error: the variables of left side do not match the right side");
        }
        return Value.VOID;
    }

    @Override
    public Value visitVariableValue(Example2Parser.VariableValueContext ctx) {
        String id = ctx.ID().getText();
        Value value = valuesHashMap.get(id);
        return value;
    }

    private int sumRecordSize(List<Value> temp){
        int sum = 0;
        for (Value value : temp) {
            sum += Integer.parseInt(value.asString());
        }
        return sum;
    }

    @Override
    public Value visitRecords(Example2Parser.RecordsContext ctx) {
        List<Value> temp = new ArrayList<>();
        String id = ctx.ID().getText();
        for (int i = 0; i < ctx.recordsBlock().size() ; i++) {

            if(ctx.recordsBlock(i).integer() != null)
            {
                Value value = this.visit(ctx.recordsBlock(i).integer());
                temp.add(value);
            }
            else if (ctx.recordsBlock(i).char_() != null)
            {
                Value value = this.visit(ctx.recordsBlock(i).char_());
                temp.add(value);
            } else if (ctx.recordsBlock(i).records() != null) {
                Value value = this.visit(ctx.recordsBlock(i).records());
                temp.add(value);
            }
        }
        System.out.println("The size of " + id + " is " + sumRecordSize(temp));
//        recordsHashMap.put(id, new Value(sumRecordSize(temp)));
        return new Value(sumRecordSize(temp));
    }

//    @Override
//    public Value visitRecords(Example2Parser.RecordsContext ctx) {
//        List<Value> temp = new ArrayList<>();
//        String id = ctx.ID().getText();
//        for (int i = 0; i < ctx.recordsTypes().size() ; i++) {
//
//            if(ctx.recordsTypes(i).integer() != null)
//            {
//                Value value = this.visit(ctx.recordsTypes(i).integer());
//                temp.add(value);
//            }
//            else if (ctx.recordsTypes(i).char_() != null)
//            {
//                Value value = this.visit(ctx.recordsTypes(i).char_());
//                temp.add(value);
//            } else if (ctx.recordsTypes(i).records() != null) {
//                Value value = this.visit(ctx.recordsTypes(i).records());
//                temp.add(value);
//            }
//        }
//        recordsHashMap.put(id,new Value(calculate(temp)));
//
//        System.out.println("The size of " + id + " is " + recordsHashMap.get(id));
//        return new Value(recordsHashMap.get(id));
//    }



    @Override
    public Value visitInteger(Example2Parser.IntegerContext ctx) {
        System.err.println("The size of " + ctx.ID().getText() + " is " + 8);
        return new Value(8);
    }

    @Override
    public Value visitChar(Example2Parser.CharContext ctx) {
        System.err.println("The size of " + ctx.ID().getText() + " is " + 1);
        return new Value(1);
    }

    @Override
    public Value visitAdd(Example2Parser.AddContext ctx) {
        Value first = this.visit(ctx.expression(0));
        Value second = this.visit(ctx.expression(1));
        return new Value((Integer.parseInt(first.asString())) + (Integer.parseInt(second.asString())));
    }

    @Override
    public Value visitSub(Example2Parser.SubContext ctx) {
        Value first = this.visit(ctx.expression(0));
        Value second = this.visit(ctx.expression(1));
        return new Value((Integer.parseInt(first.asString()) - (Integer.parseInt(second.asString()))));
    }

    @Override
    public Value visitMul(Example2Parser.MulContext ctx) {
        Value first = this.visit(ctx.expression(0));
        Value second = this.visit(ctx.expression(1));
        return new Value((Integer.parseInt(first.asString()) * (Integer.parseInt(second.asString()))));
    }

    @Override
    public Value visitDiv(Example2Parser.DivContext ctx) {
        Value first = this.visit(ctx.expression(0));
        Value second = this.visit(ctx.expression(1));
        return new Value((Integer.parseInt(first.asString()) / (Integer.parseInt(second.asString()))));
    }

    @Override
    public Value visitPow(Example2Parser.PowContext ctx) {
        Value first = this.visit(ctx.expression(0));
        Value second = this.visit(ctx.expression(1));
        return new Value(Math.pow(Integer.parseInt(first.asString()) , Integer.parseInt(second.asString())));
    }

    @Override
    public Value visitConditionVariable(Example2Parser.ConditionVariableContext ctx) {
        Value value = this.visit(ctx.expression(0));
        boolean result = Boolean.parseBoolean(value.asString());
        Value returnResult;
        if(result){
            returnResult = this.visit(ctx.expression(1));
            System.err.println("the result is true, print "+ returnResult);
        }else {
            returnResult = this.visit(ctx.expression(2));
            System.err.println("the result is false, print "+ returnResult);
        }
        return returnResult;
    }

    @Override
    public Value visitComparisons(Example2Parser.ComparisonsContext ctx) {
        Value leftValue = this.visit(ctx.expression(0));
        Value rightValue = this.visit(ctx.expression(1));
        int left = Integer.parseInt(leftValue.asString());
        int right = Integer.parseInt(rightValue.asString());

        return switch (ctx.getChild(1).getText()) {
            case ">" -> new Value(left > right);
            case "<" -> new Value(left < right);
            case "<=" -> new Value(left <= right);
            case ">=" -> new Value(left >= right);
            case "==" -> new Value(left == right);
            case "!=" -> new Value(left != right);
            default -> new Value(new Object());
        };
    }

    @Override
    public Value visitAndExpr(Example2Parser.AndExprContext ctx) {
        Boolean firstCondition = Boolean.parseBoolean(this.visit(ctx.expression(0)).asString());
        Boolean secondCondition = Boolean.parseBoolean(this.visit(ctx.expression(1)).asString());
        Value value = new Value(firstCondition && secondCondition);
        System.err.println("The result is of {and} Expr " + " = " + (value));
        return value;
    }

    @Override
    public Value visitOrExpr(Example2Parser.OrExprContext ctx) {
        Boolean firstCondition = Boolean.parseBoolean(this.visit(ctx.expression(0)).asString());
        Boolean secondCondition = Boolean.parseBoolean(this.visit(ctx.expression(1)).asString());
        Value value = new Value(firstCondition || secondCondition);
        System.err.println("The result is of {or} Expr " + " = " + (value));
        return value;
    }

    @Override
    public Value visitNotExpr(Example2Parser.NotExprContext ctx) {
        Boolean expr = this.visit(ctx.expression()).asBoolean();
        Value value = new Value(!expr);
        System.err.println("The result is of {not} Expr " + " = " + (value));
        return value;
    }

    @Override
    public Value visitIncrementExpr(Example2Parser.IncrementExprContext ctx) {
        String id = ctx.ID().getText();
        Value value = valuesHashMap.get(id);
        Value result = new Value(Integer.parseInt(value.asString()) + 1);
        valuesHashMap.put(id, result);
        return result;
    }

    @Override
    public Value visitDecrementExpr(Example2Parser.DecrementExprContext ctx) {
        String id = ctx.ID().getText();
        Value value = valuesHashMap.get(id);
        Value result = new Value(Integer.parseInt(value.asString()) - 1);
        valuesHashMap.put(id, result);
        return result;
    }

    @Override
    public Value visitEqualIncrementExpr(Example2Parser.EqualIncrementExprContext ctx) {
        Value value1 = this.visit(ctx.expression(0));
        Value value2 = this.visit(ctx.expression(1));
        Value result = new Value(Integer.parseInt(value1.asString()) + Integer.parseInt( value2.asString()));
        if(valuesHashMap.containsKey(ctx.expression(0).getText())){
            valuesHashMap.put(ctx.expression(0).getText(),result);
        }
        return result;
    }

    @Override
    public Value visitEqualDecrementExpr(Example2Parser.EqualDecrementExprContext ctx) {
        Value value1 = this.visit(ctx.expression(0));
        Value value2 = this.visit(ctx.expression(1));
        Value result = new Value(Integer.parseInt(value1.asString()) - Integer.parseInt( value2.asString()));
        if(valuesHashMap.containsKey(ctx.expression(0).getText())){
            valuesHashMap.put(ctx.expression(0).getText(),result);
        }
        return result;
    }

    @Override
    public Value visitFor_statement(Example2Parser.For_statementContext ctx) {
        Value intValue = this.visit(ctx.for_block().assign_variables());
        Value value = this.visit(ctx.for_block().expression(0));

        while (Boolean.TRUE.equals(value.asBoolean())) {
            this.visit(ctx.code_block());

            intValue =  this.visit(ctx.for_block().expression(1));

            value = this.visit(ctx.for_block().expression(0));
        }
        return value;
    }

    @Override
    public Value visitRepeat_until_statement(Example2Parser.Repeat_until_statementContext ctx) {
        Value value = this.visit(ctx.expression());

        while (Boolean.TRUE.equals(value.asBoolean())) {
            this.visit(ctx.code_block());

             value = this.visit(ctx.expression());
        }
        return value;
    }

    @Override
    public Value visitDo_while_statement(Example2Parser.Do_while_statementContext ctx) {
        Value value = this.visit(ctx.expression());

        while (Boolean.TRUE.equals(value.asBoolean())) {
            this.visit(ctx.code_block());

            value = this.visit(ctx.expression());
        }
        return value;
    }

    @Override
    public Value visitWhile_statement(Example2Parser.While_statementContext ctx) {
        Value value = this.visit(ctx.expression());

        while (Boolean.TRUE.equals(value.asBoolean())) {
            this.visit(ctx.code_block());

            value = this.visit(ctx.expression());
        }
        return value;
    }

    @Override
    public Value visitIf_statement(Example2Parser.If_statementContext ctx) {
        Value value = this.visit(ctx.expression());
        if(Boolean.TRUE.equals(value.asBoolean())){
            this.visit(ctx.code_block(0));
        }else if(ctx.ELSE() != null){
            this.visit(ctx.code_block(1));
        }
        return Value.VOID;
    }
}


public class Main {

    public static void main(String[] args) throws Exception {
		
        CharStream input = CharStreams.fromStream(System.in);
		Example2Lexer lexer = new Example2Lexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Example2Parser parser = new Example2Parser(tokens);

        ParseTree tree = parser.start2();
		
        Example2Visitor<Value> visitor = new MyVisitor();
        visitor.visit(tree);
    }
}