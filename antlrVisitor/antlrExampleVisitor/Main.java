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


class MyVisitor extends Example2BaseVisitor<Value> 
{
	// MyVisitor doesn't contain visitAndExpr(), so Example2BaseVisitor.visitAndExpr()
    // is called when running the application
	// (see Example2BaseVisitor.java: this Example2BaseVisitor.visitAndExpr() calls visitChildren())
	
	@Override public Value visitLoop(Example2Parser.LoopContext ctx) 
	{ 
		System.err.println("loop: visit 'statement'-child only");
		Value v = visit(ctx.statement());
		return v; 
	}
	@Override public Value visitPrint(Example2Parser.PrintContext ctx) 
	{ 
		System.err.println("print: visit all children");
		Value v = visitChildren(ctx);
		return v;
	}
	@Override public Value visitIfStat(Example2Parser.IfStatContext ctx) 
	{ 
		System.err.println("if: visit no children at all");
		return Value.VOID;
	}
	@Override public Value visitNumber(Example2Parser.NumberContext ctx)
	{
		Value v = visit(ctx.NUMBER());
		System.err.println("number: " + v);
		return (v);
	}
	@Override public Value visitText(Example2Parser.TextContext ctx)
	{
		System.err.println("text: token not visited");
		return (Value.VOID);
	}
	
	@Override public Value visitUrl(Example2Parser.UrlContext ctx)
	{
		Value nA, nB, nC, nD;
		
		nA = visit(ctx.numberD());
		nB = visit(ctx.numberC());
		nC = visit(ctx.numberB());
		nD = visit(ctx.numberA());
		System.err.println("URL: " + nA + "." + nB + "." + nC + "." + nD);
		return (Value.VOID);
	}
	
	@Override public Value visitTerminal(TerminalNode node) 
	{ 
		System.err.println("[" + node.getText() + "]");
		return (new Value (node.getText()));
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