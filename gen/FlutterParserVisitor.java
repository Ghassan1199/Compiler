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
	 * Visit a parse tree produced by {@link FlutterParser#one_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_return(FlutterParser.One_returnContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FlutterParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_decl(FlutterParser.List_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#new_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_list(FlutterParser.New_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_values(FlutterParser.List_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list_assignement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_assignement(FlutterParser.List_assignementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list_value_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_value_call(FlutterParser.List_value_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FlutterParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(FlutterParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#comparison_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operations(FlutterParser.Comparison_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(FlutterParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_header(FlutterParser.For_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_body(FlutterParser.For_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_var_decl(FlutterParser.For_var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_var_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_var_init(FlutterParser.For_var_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_var(FlutterParser.For_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_structure(FlutterParser.For_structureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each(FlutterParser.For_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_each_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_header(FlutterParser.For_each_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(FlutterParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#while_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_header(FlutterParser.While_headerContext ctx);
}