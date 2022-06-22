// Generated from Example2.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Example2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Example2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Example2Parser#start2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart2(Example2Parser.Start2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Example2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(Example2Parser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(Example2Parser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#for_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_block(Example2Parser.For_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(Example2Parser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(Example2Parser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(Example2Parser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpr(Example2Parser.IncrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(Example2Parser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualIncrementExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualIncrementExpr(Example2Parser.EqualIncrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableValue}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValue(Example2Parser.VariableValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(Example2Parser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerValue}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerValue(Example2Parser.IntegerValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(Example2Parser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(Example2Parser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionVariable}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionVariable(Example2Parser.ConditionVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparisons}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisons(Example2Parser.ComparisonsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(Example2Parser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualDecrementExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualDecrementExpr(Example2Parser.EqualDecrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(Example2Parser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(Example2Parser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(Example2Parser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(Example2Parser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementExpr(Example2Parser.DecrementExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#assign_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_variables(Example2Parser.Assign_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(Example2Parser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(Example2Parser.CharContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#recordsTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordsTypes(Example2Parser.RecordsTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#records}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecords(Example2Parser.RecordsContext ctx);
}