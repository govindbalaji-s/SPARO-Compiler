// Generated from SparoParser.g4 by ANTLR 4.7.1
package sparo;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SparoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SparoParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SparoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SparoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#class_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition_list(SparoParser.Class_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#class_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(SparoParser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#class_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_head(SparoParser.Class_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#base_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_clause(SparoParser.Base_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#member_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_list(SparoParser.Member_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(SparoParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#destructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructor(SparoParser.DestructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(SparoParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#method_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_definition(SparoParser.Method_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration_list(SparoParser.Parameter_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(SparoParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SparoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SparoParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_declaration(SparoParser.Member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#declaration_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifier(SparoParser.Declaration_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(SparoParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#array_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_specifier(SparoParser.Array_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#tensor_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTensor_specifier(SparoParser.Tensor_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#integer_constant_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_constant_list(SparoParser.Integer_constant_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#pointer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_type(SparoParser.Pointer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator(SparoParser.Init_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(SparoParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(SparoParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SparoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(SparoParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#logical_OR_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_OR_expression(SparoParser.Logical_OR_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#logical_AND_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_AND_expression(SparoParser.Logical_AND_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(SparoParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(SparoParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(SparoParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(SparoParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(SparoParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SparoParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#new_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_expression(SparoParser.New_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#new_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_keyword(SparoParser.New_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(SparoParser.Postfix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(SparoParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SparoParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(SparoParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(SparoParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(SparoParser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(SparoParser.Iteration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparoParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(SparoParser.Jump_statementContext ctx);
}