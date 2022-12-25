// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlutterParser}.
 */
public interface FlutterParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlutterParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FlutterParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FlutterParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FlutterParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FlutterParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_header(FlutterParser.Function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_header(FlutterParser.Function_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(FlutterParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(FlutterParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(FlutterParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(FlutterParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(FlutterParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(FlutterParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(FlutterParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(FlutterParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(FlutterParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(FlutterParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(FlutterParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(FlutterParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#variable_call}.
	 * @param ctx the parse tree
	 */
	void enterVariable_call(FlutterParser.Variable_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#variable_call}.
	 * @param ctx the parse tree
	 */
	void exitVariable_call(FlutterParser.Variable_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FlutterParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FlutterParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(FlutterParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(FlutterParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(FlutterParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(FlutterParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#variable_access}.
	 * @param ctx the parse tree
	 */
	void enterVariable_access(FlutterParser.Variable_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#variable_access}.
	 * @param ctx the parse tree
	 */
	void exitVariable_access(FlutterParser.Variable_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function_access}.
	 * @param ctx the parse tree
	 */
	void enterFunction_access(FlutterParser.Function_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function_access}.
	 * @param ctx the parse tree
	 */
	void exitFunction_access(FlutterParser.Function_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(FlutterParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(FlutterParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class_header}.
	 * @param ctx the parse tree
	 */
	void enterClass_header(FlutterParser.Class_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class_header}.
	 * @param ctx the parse tree
	 */
	void exitClass_header(FlutterParser.Class_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(FlutterParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(FlutterParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(FlutterParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(FlutterParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#extends_class}.
	 * @param ctx the parse tree
	 */
	void enterExtends_class(FlutterParser.Extends_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#extends_class}.
	 * @param ctx the parse tree
	 */
	void exitExtends_class(FlutterParser.Extends_classContext ctx);
}