// Generated from sparo_parser.g4 by ANTLR 4.7.1
package parser.sparo;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sparo_parserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sparo_parserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(sparo_parserParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#class_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition_list(sparo_parserParser.Class_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#class_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(sparo_parserParser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#class_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_head(sparo_parserParser.Class_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#base_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_clause(sparo_parserParser.Base_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#member_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_list(sparo_parserParser.Member_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(sparo_parserParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#destructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructor(sparo_parserParser.DestructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(sparo_parserParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#method_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_definition(sparo_parserParser.Method_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration_list(sparo_parserParser.Parameter_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(sparo_parserParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(sparo_parserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(sparo_parserParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#declaration_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifier(sparo_parserParser.Declaration_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(sparo_parserParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#array_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_specifier(sparo_parserParser.Array_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#tensor_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTensor_specifier(sparo_parserParser.Tensor_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#integer_constant_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_constant_list(sparo_parserParser.Integer_constant_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#pointer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_type(sparo_parserParser.Pointer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator(sparo_parserParser.Init_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(sparo_parserParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(sparo_parserParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(sparo_parserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(sparo_parserParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#logical_OR_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_OR_expression(sparo_parserParser.Logical_OR_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#logical_AND_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_AND_expression(sparo_parserParser.Logical_AND_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(sparo_parserParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(sparo_parserParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(sparo_parserParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(sparo_parserParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(sparo_parserParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(sparo_parserParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#new_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_expression(sparo_parserParser.New_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#new_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_keyword(sparo_parserParser.New_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(sparo_parserParser.Postfix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(sparo_parserParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(sparo_parserParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(sparo_parserParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(sparo_parserParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(sparo_parserParser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(sparo_parserParser.Iteration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sparo_parserParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(sparo_parserParser.Jump_statementContext ctx);
}