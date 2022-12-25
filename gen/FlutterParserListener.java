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
	 * Enter a parse tree produced by {@link FlutterParser#one_return}.
	 * @param ctx the parse tree
	 */
	void enterOne_return(FlutterParser.One_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#one_return}.
	 * @param ctx the parse tree
	 */
	void exitOne_return(FlutterParser.One_returnContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class_instance}.
	 * @param ctx the parse tree
	 */
	void enterClass_instance(FlutterParser.Class_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class_instance}.
	 * @param ctx the parse tree
	 */
	void exitClass_instance(FlutterParser.Class_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FlutterParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FlutterParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list_decl}.
	 * @param ctx the parse tree
	 */
	void enterList_decl(FlutterParser.List_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list_decl}.
	 * @param ctx the parse tree
	 */
	void exitList_decl(FlutterParser.List_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#new_list}.
	 * @param ctx the parse tree
	 */
	void enterNew_list(FlutterParser.New_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#new_list}.
	 * @param ctx the parse tree
	 */
	void exitNew_list(FlutterParser.New_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list_values}.
	 * @param ctx the parse tree
	 */
	void enterList_values(FlutterParser.List_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list_values}.
	 * @param ctx the parse tree
	 */
	void exitList_values(FlutterParser.List_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list_assignement}.
	 * @param ctx the parse tree
	 */
	void enterList_assignement(FlutterParser.List_assignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list_assignement}.
	 * @param ctx the parse tree
	 */
	void exitList_assignement(FlutterParser.List_assignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list_value_call}.
	 * @param ctx the parse tree
	 */
	void enterList_value_call(FlutterParser.List_value_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list_value_call}.
	 * @param ctx the parse tree
	 */
	void exitList_value_call(FlutterParser.List_value_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FlutterParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FlutterParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(FlutterParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(FlutterParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#comparison_operations}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operations(FlutterParser.Comparison_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#comparison_operations}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operations(FlutterParser.Comparison_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(FlutterParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(FlutterParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_header}.
	 * @param ctx the parse tree
	 */
	void enterFor_header(FlutterParser.For_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_header}.
	 * @param ctx the parse tree
	 */
	void exitFor_header(FlutterParser.For_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_body}.
	 * @param ctx the parse tree
	 */
	void enterFor_body(FlutterParser.For_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_body}.
	 * @param ctx the parse tree
	 */
	void exitFor_body(FlutterParser.For_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterFor_var_decl(FlutterParser.For_var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitFor_var_decl(FlutterParser.For_var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_var_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_var_init(FlutterParser.For_var_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_var_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_var_init(FlutterParser.For_var_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_var}.
	 * @param ctx the parse tree
	 */
	void enterFor_var(FlutterParser.For_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_var}.
	 * @param ctx the parse tree
	 */
	void exitFor_var(FlutterParser.For_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_structure}.
	 * @param ctx the parse tree
	 */
	void enterFor_structure(FlutterParser.For_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_structure}.
	 * @param ctx the parse tree
	 */
	void exitFor_structure(FlutterParser.For_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_each}.
	 * @param ctx the parse tree
	 */
	void enterFor_each(FlutterParser.For_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_each}.
	 * @param ctx the parse tree
	 */
	void exitFor_each(FlutterParser.For_eachContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_each_header}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_header(FlutterParser.For_each_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_each_header}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_header(FlutterParser.For_each_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(FlutterParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(FlutterParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#while_header}.
	 * @param ctx the parse tree
	 */
	void enterWhile_header(FlutterParser.While_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#while_header}.
	 * @param ctx the parse tree
	 */
	void exitWhile_header(FlutterParser.While_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(FlutterParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(FlutterParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(FlutterParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(FlutterParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#if_header}.
	 * @param ctx the parse tree
	 */
	void enterIf_header(FlutterParser.If_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#if_header}.
	 * @param ctx the parse tree
	 */
	void exitIf_header(FlutterParser.If_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(FlutterParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(FlutterParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(FlutterParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(FlutterParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#try_catch}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch(FlutterParser.Try_catchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#try_catch}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch(FlutterParser.Try_catchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#try}.
	 * @param ctx the parse tree
	 */
	void enterTry(FlutterParser.TryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#try}.
	 * @param ctx the parse tree
	 */
	void exitTry(FlutterParser.TryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#catche}.
	 * @param ctx the parse tree
	 */
	void enterCatche(FlutterParser.CatcheContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#catche}.
	 * @param ctx the parse tree
	 */
	void exitCatche(FlutterParser.CatcheContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#finaly}.
	 * @param ctx the parse tree
	 */
	void enterFinaly(FlutterParser.FinalyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#finaly}.
	 * @param ctx the parse tree
	 */
	void exitFinaly(FlutterParser.FinalyContext ctx);
}