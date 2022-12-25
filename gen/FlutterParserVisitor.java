// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlutterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlutterParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlutterParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FlutterParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FlutterParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_header(FlutterParser.Function_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure(FlutterParser.StructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(FlutterParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(FlutterParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters(FlutterParser.Function_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(FlutterParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(FlutterParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#variable_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_call(FlutterParser.Variable_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FlutterParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(FlutterParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(FlutterParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#variable_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_access(FlutterParser.Variable_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_access(FlutterParser.Function_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(FlutterParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#class_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_header(FlutterParser.Class_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(FlutterParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(FlutterParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#extends_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_class(FlutterParser.Extends_classContext ctx);
}