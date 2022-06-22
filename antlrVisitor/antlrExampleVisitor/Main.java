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
    private Map<String, Value> valueStorage = new HashMap<String, Value>();
    private Map<String, Value> recordStorage = new HashMap<>();

    @Override
    public Value visitTerminal(TerminalNode node) {
        return (new Value(node.getText()));
    }

    @Override
    public Value visitIntegerValue(Example2Parser.IntegerValueContext ctx) {
        Value value = visit(ctx.INT());
        return value;
    }



    @Override
    public Value visitParenthesis(Example2Parser.ParenthesisContext ctx) {
        return visit(ctx.expression(0));
    }


    private void printSystem(Object input){
        System.out.println(input);
    }

    // Variables
    @Override
    public Value visitAssignVariables(Example2Parser.AssignVariablesContext ctx) {

        if ( ctx.ID().size() == ctx.expression().size()){
            for (int i = 0; i < ctx.ID().size(); i++) {
                String id =  ctx.ID(i).getText();
                Value rtnval = visit(ctx.expression(i));
                if (!valueStorage.containsKey(id)){
                    valueStorage.put(id,rtnval);
                }
                printSystem( id+ " : " + rtnval.toString());
            }
        }
        else {
            printSystem("The variables on the left do not match the assignments on the right");
        }
        return (Value.VOID);
    }

    @Override
    public Value visitVariable(Example2Parser.VariableContext ctx) {
        String id = ctx.ID().getText();
        return valueStorage.get(id);
    }

    // Records

    @Override
    public Value visitRecordAssign(Example2Parser.RecordAssignContext ctx) {
        ;
        List<Value> temp = new ArrayList<>();
        String id = ctx.ID().getText();
        for (int i = 0; i < ctx.recordsTypes().size() ; i++) {

            if(ctx.recordsTypes(i).integer() != null)
            {
                Value value = this.visit(ctx.recordsTypes(i).integer());
                temp.add(value);
            }
            else if (ctx.recordsTypes(i).char_() != null)
            {
                Value value = this.visit(ctx.recordsTypes(i).char_());
                temp.add(value);
            } else if (ctx.recordsTypes(i).records() != null) {
                Value value = this.visit(ctx.recordsTypes(i).records());
                temp.add(value);
            }
        }
        recordStorage.put(id,new Value(calculate(temp)));

        System.out.println("The size of " + id + " is " + recordStorage.get(id));
        return new Value(recordStorage.get(id));
    }

    private int calculate(List<Value> temp){
        int sum = 0;
        for (int i = 0; i < temp.size() ; i++) {
            sum += Integer.parseInt(String.valueOf(temp.get(i)));
        }
        return sum;
    }



    @Override
    public Value visitInteger(Example2Parser.IntegerContext ctx) {
        System.err.println("The size of " + ctx.ID().getText() + " is " + 8);
        return new Value(8);
    }

    @Override
    public Value visitChar(Example2Parser.CharContext ctx) {
//        recordStorage.put(ctx.ID().getText(), new Value(1));
        System.err.println("The size of " + ctx.ID().getText() + " is " + 1);
        return new Value(1);
    }

    // Mathematical operations
    @Override
    public Value visitAdding(Example2Parser.AddingContext ctx) {
        Value first = visit(ctx.expression(0));
        Value second = visit(ctx.expression(1));
        return new Value((Integer.parseInt(first.asString())) + (Integer.parseInt(second.asString())));
    }

    @Override
    public Value visitSubstracting(Example2Parser.SubstractingContext ctx) {
        Value first = visit(ctx.expression(0));
        Value second = visit(ctx.expression(1));
        return new Value((Integer.parseInt(first.asString()) - (Integer.parseInt(second.asString()))));
    }

    @Override
    public Value visitMultiplication(Example2Parser.MultiplicationContext ctx) {
        Value first = visit(ctx.expression(0));
        Value second = visit(ctx.expression(1));
        return new Value((Integer.parseInt(first.asString()) * (Integer.parseInt(second.asString()))));
    }

    @Override
    public Value visitDivision(Example2Parser.DivisionContext ctx) {
        Value first = visit(ctx.expression(0));
        Value second = visit(ctx.expression(1));
        return new Value((Integer.parseInt(first.asString()) / (Integer.parseInt(second.asString()))));
    }

    @Override
    public Value visitPower(Example2Parser.PowerContext ctx) {
        Value first = visit(ctx.expression(0));
        Value second = visit(ctx.expression(1));
        return new Value(Math.pow(Integer.parseInt(first.asString()) , Integer.parseInt(second.asString())));
    }

    @Override
    public Value visitConditionVariable(Example2Parser.ConditionVariableContext ctx) {
        Value value = this.visit(ctx.expression(0));
        boolean result = Boolean.parseBoolean(value.asString());
        Value returnResult = null;
        if(result){
            returnResult = this.visit(ctx.expression(1));
            printSystem("the result is true, print "+ returnResult);
        }else {
            returnResult = this.visit(ctx.expression(2));
            printSystem("the result is false, print "+ returnResult);
        }
        return returnResult;
    }


    @Override
    public Value visitComparisons(Example2Parser.ComparisonsContext ctx) {
        Value leftValue = visit(ctx.expression(0));
        Value rightValue = visit(ctx.expression(1));
        int left = Integer.parseInt(leftValue.asString());
        int right = Integer.parseInt(rightValue.asString());

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
                return new Value(left == right);
            case "!=":
                return new Value(left != right);
            default:
                return new Value(new Object());
        }
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