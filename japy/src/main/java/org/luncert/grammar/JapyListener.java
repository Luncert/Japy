package org.luncert.grammar;
// Generated from Japy.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JapyParser}.
 */
public interface JapyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JapyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JapyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JapyParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JapyParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JapyParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(JapyParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(JapyParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(JapyParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(JapyParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(JapyParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(JapyParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JapyParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JapyParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JapyParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JapyParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JapyParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JapyParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(JapyParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(JapyParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(JapyParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(JapyParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(JapyParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(JapyParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(JapyParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(JapyParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(JapyParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(JapyParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(JapyParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(JapyParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JapyParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JapyParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JapyParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JapyParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JapyParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JapyParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(JapyParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(JapyParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JapyParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JapyParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(JapyParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(JapyParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JapyParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JapyParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(JapyParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(JapyParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JapyParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JapyParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(JapyParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(JapyParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(JapyParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(JapyParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(JapyParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(JapyParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(JapyParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(JapyParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JapyParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JapyParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(JapyParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(JapyParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(JapyParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(JapyParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(JapyParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(JapyParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(JapyParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(JapyParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JapyParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JapyParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryCompilation(JapyParser.OrdinaryCompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryCompilation(JapyParser.OrdinaryCompilationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#modularCompilation}.
	 * @param ctx the parse tree
	 */
	void enterModularCompilation(JapyParser.ModularCompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#modularCompilation}.
	 * @param ctx the parse tree
	 */
	void exitModularCompilation(JapyParser.ModularCompilationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JapyParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JapyParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(JapyParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(JapyParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JapyParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JapyParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(JapyParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(JapyParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(JapyParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(JapyParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(JapyParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(JapyParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(JapyParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(JapyParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JapyParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JapyParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(JapyParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(JapyParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDirective(JapyParser.ModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDirective(JapyParser.ModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void enterRequiresModifier(JapyParser.RequiresModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void exitRequiresModifier(JapyParser.RequiresModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JapyParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JapyParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(JapyParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(JapyParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(JapyParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(JapyParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JapyParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JapyParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(JapyParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(JapyParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(JapyParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(JapyParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(JapyParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(JapyParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(JapyParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(JapyParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JapyParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JapyParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JapyParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JapyParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(JapyParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(JapyParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JapyParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JapyParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(JapyParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(JapyParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(JapyParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(JapyParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JapyParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JapyParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JapyParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JapyParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JapyParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JapyParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(JapyParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(JapyParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(JapyParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(JapyParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(JapyParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(JapyParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(JapyParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(JapyParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(JapyParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(JapyParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(JapyParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(JapyParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(JapyParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(JapyParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(JapyParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(JapyParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(JapyParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(JapyParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(JapyParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(JapyParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(JapyParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(JapyParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(JapyParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(JapyParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JapyParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JapyParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(JapyParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(JapyParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JapyParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JapyParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JapyParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JapyParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JapyParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JapyParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JapyParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JapyParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JapyParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JapyParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JapyParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JapyParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JapyParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JapyParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JapyParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JapyParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JapyParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JapyParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(JapyParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(JapyParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(JapyParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(JapyParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(JapyParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(JapyParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JapyParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JapyParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(JapyParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(JapyParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(JapyParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(JapyParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JapyParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JapyParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(JapyParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(JapyParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(JapyParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(JapyParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(JapyParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(JapyParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JapyParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JapyParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(JapyParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(JapyParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JapyParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JapyParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(JapyParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(JapyParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(JapyParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(JapyParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JapyParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JapyParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(JapyParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(JapyParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JapyParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JapyParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JapyParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JapyParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(JapyParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(JapyParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(JapyParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(JapyParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(JapyParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(JapyParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JapyParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JapyParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JapyParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JapyParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(JapyParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(JapyParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(JapyParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(JapyParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JapyParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JapyParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JapyParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JapyParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JapyParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JapyParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JapyParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JapyParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(JapyParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(JapyParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JapyParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JapyParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(JapyParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(JapyParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JapyParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JapyParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JapyParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JapyParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(JapyParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(JapyParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(JapyParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(JapyParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JapyParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JapyParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JapyParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JapyParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JapyParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JapyParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(JapyParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(JapyParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(JapyParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(JapyParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(JapyParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(JapyParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JapyParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JapyParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(JapyParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(JapyParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(JapyParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(JapyParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JapyParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JapyParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JapyParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JapyParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JapyParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JapyParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(JapyParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(JapyParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(JapyParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(JapyParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#smallStatement}.
	 * @param ctx the parse tree
	 */
	void enterSmallStatement(JapyParser.SmallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#smallStatement}.
	 * @param ctx the parse tree
	 */
	void exitSmallStatement(JapyParser.SmallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JapyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JapyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#passStatement}.
	 * @param ctx the parse tree
	 */
	void enterPassStatement(JapyParser.PassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#passStatement}.
	 * @param ctx the parse tree
	 */
	void exitPassStatement(JapyParser.PassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(JapyParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(JapyParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JapyParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JapyParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JapyParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JapyParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(JapyParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(JapyParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JapyParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JapyParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(JapyParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(JapyParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JapyParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JapyParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(JapyParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(JapyParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JapyParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JapyParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(JapyParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(JapyParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JapyParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JapyParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JapyParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JapyParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(JapyParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(JapyParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JapyParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JapyParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(JapyParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(JapyParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JapyParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JapyParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JapyParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JapyParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(JapyParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(JapyParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(JapyParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(JapyParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JapyParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JapyParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JapyParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JapyParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JapyParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JapyParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JapyParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JapyParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(JapyParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(JapyParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(JapyParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(JapyParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(JapyParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(JapyParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JapyParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JapyParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(JapyParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(JapyParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JapyParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JapyParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(JapyParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(JapyParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(JapyParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(JapyParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JapyParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JapyParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(JapyParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(JapyParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JapyParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JapyParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(JapyParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(JapyParser.VariableAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JapyParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JapyParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(JapyParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(JapyParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(JapyParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(JapyParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(JapyParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(JapyParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(JapyParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(JapyParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JapyParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JapyParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JapyParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JapyParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(JapyParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(JapyParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JapyParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JapyParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JapyParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JapyParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void enterClassLiteral(JapyParser.ClassLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void exitClassLiteral(JapyParser.ClassLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(JapyParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(JapyParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(JapyParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(JapyParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(JapyParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(JapyParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JapyParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JapyParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(JapyParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(JapyParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(JapyParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(JapyParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(JapyParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(JapyParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JapyParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JapyParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(JapyParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(JapyParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(JapyParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(JapyParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(JapyParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(JapyParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(JapyParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(JapyParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(JapyParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(JapyParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JapyParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JapyParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(JapyParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(JapyParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(JapyParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(JapyParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(JapyParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(JapyParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(JapyParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(JapyParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(JapyParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(JapyParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(JapyParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(JapyParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(JapyParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(JapyParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JapyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JapyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JapyParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JapyParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JapyParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JapyParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(JapyParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(JapyParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JapyParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JapyParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JapyParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JapyParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JapyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JapyParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JapyParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JapyParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JapyParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JapyParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JapyParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JapyParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(JapyParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(JapyParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JapyParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JapyParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(JapyParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(JapyParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(JapyParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(JapyParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JapyParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JapyParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JapyParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JapyParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JapyParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JapyParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(JapyParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(JapyParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JapyParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JapyParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JapyParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JapyParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JapyParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JapyParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(JapyParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(JapyParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(JapyParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(JapyParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(JapyParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(JapyParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JapyParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JapyParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(JapyParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(JapyParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(JapyParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(JapyParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(JapyParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(JapyParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(JapyParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(JapyParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JapyParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JapyParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapyParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JapyParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapyParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JapyParser.IdentifierContext ctx);
}