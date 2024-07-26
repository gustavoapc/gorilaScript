// Generated from GorilaScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GorilaScriptParser}.
 */
public interface GorilaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GorilaScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GorilaScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GorilaScriptParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GorilaScriptParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(GorilaScriptParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(GorilaScriptParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#paramOptional}.
	 * @param ctx the parse tree
	 */
	void enterParamOptional(GorilaScriptParser.ParamOptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#paramOptional}.
	 * @param ctx the parse tree
	 */
	void exitParamOptional(GorilaScriptParser.ParamOptionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#paramRecursive}.
	 * @param ctx the parse tree
	 */
	void enterParamRecursive(GorilaScriptParser.ParamRecursiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#paramRecursive}.
	 * @param ctx the parse tree
	 */
	void exitParamRecursive(GorilaScriptParser.ParamRecursiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GorilaScriptParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GorilaScriptParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GorilaScriptParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GorilaScriptParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#funType}.
	 * @param ctx the parse tree
	 */
	void enterFunType(GorilaScriptParser.FunTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#funType}.
	 * @param ctx the parse tree
	 */
	void exitFunType(GorilaScriptParser.FunTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GorilaScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GorilaScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GorilaScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GorilaScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GorilaScriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GorilaScriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GorilaScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GorilaScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(GorilaScriptParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(GorilaScriptParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#elsifStatement}.
	 * @param ctx the parse tree
	 */
	void enterElsifStatement(GorilaScriptParser.ElsifStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#elsifStatement}.
	 * @param ctx the parse tree
	 */
	void exitElsifStatement(GorilaScriptParser.ElsifStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(GorilaScriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(GorilaScriptParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(GorilaScriptParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(GorilaScriptParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(GorilaScriptParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(GorilaScriptParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(GorilaScriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(GorilaScriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(GorilaScriptParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(GorilaScriptParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GorilaScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GorilaScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(GorilaScriptParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(GorilaScriptParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(GorilaScriptParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(GorilaScriptParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#booleans}.
	 * @param ctx the parse tree
	 */
	void enterBooleans(GorilaScriptParser.BooleansContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#booleans}.
	 * @param ctx the parse tree
	 */
	void exitBooleans(GorilaScriptParser.BooleansContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GorilaScriptParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GorilaScriptParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GorilaScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GorilaScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(GorilaScriptParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(GorilaScriptParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#functionExpressionRecursive}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpressionRecursive(GorilaScriptParser.FunctionExpressionRecursiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#functionExpressionRecursive}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpressionRecursive(GorilaScriptParser.FunctionExpressionRecursiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GorilaScriptParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GorilaScriptParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GorilaScriptParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GorilaScriptParser.PrintContext ctx);
}