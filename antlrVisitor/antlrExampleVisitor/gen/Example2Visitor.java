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
	 * Visit a parse tree produced by {@link Example2Parser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(Example2Parser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#repeat_until_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_until_statement(Example2Parser.Repeat_until_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(Example2Parser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Example2Parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(Example2Parser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(Example2Parser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#default_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_expression(Example2Parser.Default_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(Example2Parser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(Example2Parser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpr(Example2Parser.IncrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factoriel}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoriel(Example2Parser.FactorielContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(Example2Parser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalDecrementExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualDecrementExpr(Example2Parser.EqualDecrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(Example2Parser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substracting}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstracting(Example2Parser.SubstractingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(Example2Parser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(Example2Parser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decrementExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementExpr(Example2Parser.DecrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(Example2Parser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(Example2Parser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionVariable}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionVariable(Example2Parser.ConditionVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code adding}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdding(Example2Parser.AddingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Example2Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisons}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisons(Example2Parser.ComparisonsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerValue}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerValue(Example2Parser.IntegerValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanValue}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(Example2Parser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(Example2Parser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(Example2Parser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalIncrementExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualIncrementExpr(Example2Parser.EqualIncrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignVariables}
	 * labeled alternative in {@link Example2Parser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariables(Example2Parser.AssignVariablesContext ctx);
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
	 * Visit a parse tree produced by the {@code recordAssign}
	 * labeled alternative in {@link Example2Parser#records}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordAssign(Example2Parser.RecordAssignContext ctx);
}