package ast.visitor;

import SymbolTable.SymbolTable;
import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.Program;
import ast.Statment.Component.Component;
import ast.Statment.Component.JsxElement;
import ast.Statment.Export;
import ast.Statment.FunctionStatment.Function;
import ast.Statment.Hook.Hook;
import ast.Statment.Hook.UseEffect;
import ast.Statment.Hook.UseRef;
import ast.Statment.Hook.UseState;
import ast.Statment.IfStatment.Condition;
import ast.Statment.IfStatment.If;
import ast.Statment.Import;
import ast.Statment.Statment;
import ast.Statment.Variable.*;
import ast.Statment.While;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class BaseVisitor extends ReactParserBaseVisitor {
    public SymbolTable symbolTable ;
    public BaseVisitor(){
        symbolTable = new SymbolTable();
    }

    @Override
    public Object visitProgram(ReactParser.ProgramContext ctx) {
        Program program = new Program() ;

        for(int i =0  ;i < ctx.statment().size() ;i++){
            if(ctx.statment(i) != null ){
                Statment statment = (Statment) visitStatment(ctx.statment(i));
                program.addStatment( statment ) ;
            }
        }
        return program;
    }

    @Override
    public Object visitStatment(ReactParser.StatmentContext ctx) {
        Statment statment = new Statment();
        if(ctx.varDeclarationStatment() != null ){
            statment = (Statment) visitVarDeclarationStatment(ctx.varDeclarationStatment());
        }
        else if(ctx.hookDeclarationStatment() != null ){
            statment = (Statment) visitHookDeclarationStatment(ctx.hookDeclarationStatment());
        }
        else if(ctx.assignStatment() != null){
            statment = (Statment) visitAssignStatment(ctx.assignStatment());
        }
        else if(ctx.ifStatment() != null ){
            statment = (Statment) visitIfStatment(ctx.ifStatment()) ;
        }
        else if(ctx.whileStatment() != null){
            statment = (Statment) visitWhileStatment(ctx.whileStatment()) ;
        }
        else if(ctx.functionStatment() != null){
            statment = (Statment) visitFunctionStatment(ctx.functionStatment()) ;
        }
        else if(ctx.component() != null){
            statment = (Statment) visitComponent(ctx.component());
        }
        else if(ctx.importStatment() != null){
            statment = (Statment) visitImportStatment(ctx.importStatment());
        }
        else if (ctx.exportStatment() != null){
            statment = (Statment) visitExportStatment(ctx.exportStatment());
        }
        else {
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Unknown statment");
        }

        return statment ;
    }
    // ##################################### VisitVarDeclarationStatment Start #####################################
    @Override
    public Object visitVarDeclarationStatment(ReactParser.VarDeclarationStatmentContext ctx) {
        if(ctx.varModifier() == null ){
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Var Modifier is null ");
        }
        if(ctx.Identifier() == null ){
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Variable name is null ");
        }

        Variable varValue = new Variable();
        if(ctx.variable() != null ){
            varValue = (Variable) visitVariable(ctx.variable());
        }
        varValue.setVarModifier(ctx.varModifier().getText());
        varValue.setVarName(ctx.Identifier().getText());

        symbolTable.addVariable(varValue);
        return varValue;
    }

    @Override
    public Object visitVariable(ReactParser.VariableContext ctx) {
        if(ctx == null ){
            return new Variable();
        }
        Variable variable  = new Variable();
        if(ctx.array() != null ){
            variable = (array) visitArray(ctx.array());
        }
        else if(ctx.object() != null ){
            variable = (object) visitObject(ctx.object());
        }
        else if(ctx.equation() != null ){
            variable = (equation) visitEquation(ctx.equation());
        }
        else if(ctx.string() != null ){

            variable = (string) visitString(ctx.string());
        }
        else if(ctx.Identifier() != null ){
            variable = new string();
            variable.setVarValue(ctx.Identifier().getText().toString());
        }
        else if(ctx.number() != null ) {
            variable = new number();
            variable.setVarValue(  ctx.number().getText().toString());
        }
        else{
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Unknown Variable type");
        }
        return variable;
    }

    @Override
    public Object visitArray(ReactParser.ArrayContext ctx) {
        ArrayList<Variable> variableArrayList = new ArrayList<Variable>();
        for(int i =0  ;i < ctx.variable().size() ;i++){
            variableArrayList.add( (Variable) visitVariable( ctx.variable(i) )) ;
        }
        // putting varModifier , varName as (const , temp) temporary until it is returned and set in there
        return new array( ctx.getStart().getLine()  , "const", "temp"  ,variableArrayList) ;
    }

    @Override
    public Object visitObject(ReactParser.ObjectContext ctx) {
        HashMap<String , Variable> objectValue = new HashMap<String,Variable>();
        for(int i =0 ;i < ctx.Identifier().size() ;i++){
            objectValue.put(ctx.Identifier(i).getText() , (Variable) visitVariable( ctx.variable(i)));
        }
        return new object( ctx.getStart().getLine() , "const", "temp" , objectValue ) ;
    }

    @Override
    public Object visitEquation(ReactParser.EquationContext ctx) {
        if(ctx.equation().size() != 2 ){
            if(ctx.equation().isEmpty()){
                return  new equation( Integer.parseInt( ctx.number().getText() ));
            }
            else{
                // handle error it should be (equation operation equation ) or number (here there is none or more than 2 )
                return new equation(1);
            }
        }
        else {

            return new equation( (equation) visitEquation(ctx.equation(0) ) , (equation) visitEquation(ctx.equation(1)) , ctx.operation().getText() ) ;
        }
    }

    @Override
    public Object visitString(ReactParser.StringContext ctx) {
        return new string( ctx.getStart().getLine(), "const" , "temp" ,  ctx.StringLiteral().getText());
    }
    // ###################################  VisitVarDeclarationStatment End #################################################




    // ###################################  VisitHookDeclarationStatment Start ##############################################
    @Override
    public Object visitHookDeclarationStatment(ReactParser.HookDeclarationStatmentContext ctx) {
        Hook hook = new Hook();
        if(ctx.useEffect() != null ){
            hook = (Hook) visitUseEffect(ctx.useEffect());
        }
        else if(ctx.useState() != null  ){
            hook = (Hook) visitUseState(ctx.useState()) ;
        }
        else if(ctx.useRef() != null  ){
            hook = (Hook) visitUseRef(ctx.useRef()) ;
        }
        else{
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Hook is null ");
        }
        return hook ;
    }

    @Override
    public Object visitUseEffect(ReactParser.UseEffectContext ctx) {
        ArrayList<Statment> statmentArrayList = new ArrayList<Statment>() ;
        SymbolTable parentSymbolTable = symbolTable ;
        symbolTable = symbolTable.newInstance(ctx.getStart().getLine() , "useEffect") ;
        for(int i =0 ; i< ctx.statment().size() ;i++){
            statmentArrayList.add( (Statment) visitStatment( ctx.statment(i)) );
        }
        symbolTable = parentSymbolTable ;
        ArrayList<Variable> dependancyList = new ArrayList<Variable>() ;
        for(int i =0  ;i < ctx.dependancyList().array().variable().size() ;i++){
             dependancyList.add( (Variable) visitVariable( ctx.dependancyList().array().variable(i) ) ) ;
        }
        return new UseEffect(dependancyList ,  statmentArrayList ) ;
    }

    @Override
    public Object visitUseState(ReactParser.UseStateContext ctx) {
        if(ctx.Identifier(0) == null ) {
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "State name is null ");
        }
        if(ctx.Identifier(1) == null ) {
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Set State Function is null ");
        }

        String stateName = ctx.Identifier(0).getText() ;
        String setStateFunction = ctx.Identifier(1).getText() ;
        Variable variable = new Variable();
        if(ctx.variable() != null ){
            variable = (Variable) visitVariable(ctx.variable());
        }
        symbolTable.addVariable(variable);
        return new UseState(stateName , setStateFunction , variable );
    }

    @Override
    public Object visitUseRef(ReactParser.UseRefContext ctx) {
        if(ctx.Identifier() == null ){
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Refname is null is null ");
        }

        String refName = ctx.Identifier().getText() ;
        Variable var = new Variable() ;
        if(ctx.variable()!= null ){
            var = (Variable) visitVariable( ctx.variable() ) ;
        }
        symbolTable.addVariable(var);
        return  new UseRef(refName , var) ;
    }

    // ###################################  VisitHookDeclarationStatment End ##############################################

    // ###################################  AssignStatment Start ##############################################
    @Override
    public Object visitAssignStatment(ReactParser.AssignStatmentContext ctx) {
        // maybe we need to create seperate class for this maybe no (IDRK)
        if(ctx.Identifier() == null ){
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Variable name is null ");
        }
        if(ctx.variable() == null ){
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Variable is null ");
        }
        String variableName = ctx.Identifier().getText();
        Variable variable = (Variable) visitVariable( ctx.variable() );
        variable.setVarName(variableName);
        symbolTable.updateVariable(variable);
        return variable;
    }
    // ###################################  AssignStatment End  ##############################################

    // ###################################  IfStatment Start  ##############################################
    @Override
    public Object visitIfStatment(ReactParser.IfStatmentContext ctx) {

        ArrayList<Statment> statmentArrayList = new ArrayList<Statment>() ;
        ArrayList< Condition > conditionArrayList = new ArrayList<Condition>();
        SymbolTable parentSymbolTable = symbolTable ;
        symbolTable = symbolTable.newInstance(ctx.getStart().getLine() , "If") ;
        for(int i =0 ; i< ctx.statment().size() ;i++){
            statmentArrayList.add( (Statment) visitStatment( ctx.statment(i)) );
        }
        symbolTable = parentSymbolTable ;
        for(int i =0  ;i < ctx.conditionsList().condition().size() ;i++){
            if(ctx.conditionsList().condition(i).variable().size() == 2 ){
                Condition condition = new Condition( (Variable) visitVariable(ctx.conditionsList().condition(i).variable(0) ) ,
                        (Variable) visitVariable(ctx.conditionsList().condition(i).variable(1) ) ,
                        ctx.conditionsList().condition(i).compare().getText()
                );
                conditionArrayList.add(  condition  ) ;
            }
            else if(ctx.conditionsList().condition(i).variable().size() == 1 ) {
                Condition condition = new Condition( (Variable) visitVariable(ctx.conditionsList().condition(i).variable(0) ) );
                conditionArrayList.add(  condition  ) ;
            }
            else { //  == 0 or > 2
                // handle error
            }
        }
        return new If( ctx.getStart().getLine(), conditionArrayList , statmentArrayList ) ;
    }
    // ###################################  IfStatment End  ##############################################

    // ###################################  WhileStatment Start  ##############################################
    @Override
    public Object visitWhileStatment(ReactParser.WhileStatmentContext ctx) {
        ArrayList<Statment> statmentArrayList = new ArrayList<Statment>() ;
        ArrayList< Condition > conditionArrayList = new ArrayList<Condition>();
        SymbolTable parentSymbolTable = symbolTable ;
        symbolTable = symbolTable.newInstance(ctx.getStart().getLine() , "useEffect") ;
        for(int i =0 ; i< ctx.statment().size() ;i++){
            statmentArrayList.add( (Statment) visitStatment( ctx.statment(i)) );
        }
        symbolTable = parentSymbolTable ;
        for(int i =0  ;i < ctx.conditionsList().condition().size() ;i++){
            if(ctx.conditionsList().condition(i).variable().size() == 2 ){
                Condition condition = new Condition( (Variable) visitVariable(ctx.conditionsList().condition(i).variable(0) ) ,
                        (Variable) visitVariable(ctx.conditionsList().condition(i).variable(1) ) ,
                        ctx.conditionsList().condition(i).compare().getText()
                );
                conditionArrayList.add(  condition  ) ;
            }
            else if(ctx.conditionsList().condition(i).variable().size() == 1 ) {
                Condition condition = new Condition( (Variable) visitVariable(ctx.conditionsList().condition(i).variable(0) ) );
                conditionArrayList.add(  condition  ) ;
            }
            else { //  == 0 or > 2
                // handle error
            }
        }
        return new While( ctx.getStart().getLine() , conditionArrayList , statmentArrayList  );
    }
    // ###################################  WhileStatment End  ##############################################

    // ###################################  FunctionStatment Start ##############################################
    @Override
    public Object visitFunctionStatment(ReactParser.FunctionStatmentContext ctx) {
        Function function = null ;
        Variable variable ;
        if(ctx.regularFunction() != null ){
            function =  (Function) visitRegularFunctionStart( ctx.regularFunction().regularFunctionStart() );
            Variable returnValue = (Variable) visitVariable(  ctx.regularFunction().functionBody().variableReturnStatment().variable() );
            ArrayList<Statment> statmentArrayList = new ArrayList<Statment>() ;
            SymbolTable parentSymbolTable = symbolTable ;
            symbolTable = symbolTable.newInstance(ctx.getStart().getLine() , "Function") ;
            for(int i =0 ; i< ctx.regularFunction().functionBody().statment().size() ;i++){
                statmentArrayList.add( (Statment) visitStatment( ctx.regularFunction().functionBody().statment(i)) );
            }
            symbolTable = parentSymbolTable ;
            function.setStatments(statmentArrayList);
            function.setReturnValue(returnValue);
        }
        else if(ctx.arrowFunction() != null ){
            function =  (Function) visitArrowFunctionStart( ctx.arrowFunction().arrowFunctionStart());
            Variable returnValue = (Variable) visitVariable(  ctx.arrowFunction().functionBody().variableReturnStatment().variable() );
            ArrayList<Statment> statmentArrayList = new ArrayList<Statment>() ;
            SymbolTable parentSymbolTable = symbolTable ;
            symbolTable = symbolTable.newInstance(ctx.getStart().getLine() , "Arrow Function") ;
            for(int i =0 ; i< ctx.arrowFunction().functionBody().statment().size() ;i++){
                statmentArrayList.add( (Statment) visitStatment( ctx.arrowFunction().functionBody().statment(i)) );
            }
            symbolTable = parentSymbolTable ;
            function.setStatments(statmentArrayList);
            function.setReturnValue(returnValue);
        }
        variable = new Variable(ctx.getStart().getLine(), "const" , function.getFunctionName() , "Function");
        symbolTable.addVariable(variable);
        return function ;
    }


    @Override
    public Object visitRegularFunctionStart(ReactParser.RegularFunctionStartContext ctx) {
        if(ctx.Identifier() == null ){
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Function name is null ");
        }
        String functionName = ctx.Identifier().getText() ;
        ArrayList<Variable> params = new ArrayList<Variable>();
        for(int i =0 ;i < ctx.params().variable().size();i++){
            params.add( (Variable)  visitVariable( ctx.params().variable(i) )  );
        }
        return new Function(ctx.getStart().getLine() , functionName , params , null , null );
    }

    @Override
    public Object visitArrowFunctionStart(ReactParser.ArrowFunctionStartContext ctx) {
        if(ctx.Identifier() == null ){
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Function name is null ");
        }
        String functionName = ctx.Identifier().getText() ;
        ArrayList<Variable> params = new ArrayList<Variable>();
        for(int i =0 ;i < ctx.params().variable().size();i++){
            params.add( (Variable)  visitVariable( ctx.params().variable(i) )  );
        }
        return new Function(ctx.getStart().getLine() , functionName , params , null , null );
    }

    // ###################################  FunctionStatment End ##############################################


    // ###################################  ImportStatment Start ##############################################
    @Override
    public Object visitImportStatment(ReactParser.ImportStatmentContext ctx) {
        Import importStatment = null ;
        if(ctx.namedImportStatment() != null ){
            ArrayList<String> modules = new ArrayList<String>();
            for(int i =0 ;i < ctx.namedImportStatment().listOfIdentifiers().Identifier().size() ;i++){
                modules.add(ctx.namedImportStatment().listOfIdentifiers().Identifier(i).getText());
            }
            for(int i =0 ;i < ctx.namedImportStatment().listOfIdentifiers().hook().size() ;i++){
                modules.add(ctx.namedImportStatment().listOfIdentifiers().hook(i).getText());
            }
            if(ctx.namedImportStatment().StringLiteral() == null ) {
                symbolTable.addSyntaxError(ctx.getStart().getLine() , "Module name is null ");
            }
            String moduleName = ctx.namedImportStatment().StringLiteral().getText();
            importStatment = new Import( ctx.getStart().getLine() , moduleName , modules );
        }
        else if(ctx.defaultImportStatment() != null ){
            ArrayList<String> modules = new ArrayList<String>();
            for(int i =0 ;i < ctx.defaultImportStatment().listOfIdentifiers().Identifier().size() ;i++){
                modules.add(ctx.defaultImportStatment().listOfIdentifiers().Identifier(i).getText());
            }
            for(int i =0 ;i < ctx.defaultImportStatment().listOfIdentifiers().hook().size() ;i++){
                modules.add(ctx.defaultImportStatment().listOfIdentifiers().hook(i).getText());
            }
            String moduleName = ctx.defaultImportStatment().StringLiteral().getText();
            if(ctx.defaultImportStatment().StringLiteral() == null ) {
                symbolTable.addSyntaxError(ctx.getStart().getLine() , "Module name is null ");
            }
            importStatment = new Import( ctx.getStart().getLine() , moduleName , modules );
        }
        for(String item : importStatment.getItems()){
            Variable variable = new Variable(ctx.getStart().getLine(), "const" , item , "Import");
            symbolTable.addVariable(variable);
        }
        return importStatment;
    }
    // ###################################  ImportStatment End ##############################################

    // ###################################  ExportStatment Start ##############################################
    @Override
    public Object visitExportStatment(ReactParser.ExportStatmentContext ctx) {
        ArrayList<String> modules = new ArrayList<String>();
        for(int i =0 ;i < ctx.Identifier().size();i++){
            modules.add( ctx.Identifier(i).getText() );
        }
        String exportType = (ctx.Default() != null ? "Default" : "Named" ) ;
        return new Export(ctx.getStart().getLine() , exportType , modules ) ;
    }
    // ###################################  ExportStatment End ##############################################


    @Override
    public Object visitComponent(ReactParser.ComponentContext ctx) {
        Component component  = null ;
        if(ctx.functionalComponent() != null ){
           component = (Component)  visitFunctionalComponent(ctx.functionalComponent());
        }
        else if(ctx.classComponent() != null ){
            component = (Component) visitClassComponent(ctx.classComponent());
        }
        else {
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "Component is null ");
        }
        Variable variable = new Variable(ctx.getStart().getLine(), "const" , component.getFunctionName() , "Component");
        return component;
    }

    @Override
    public Object visitFunctionalComponent(ReactParser.FunctionalComponentContext ctx) {
        Function function = new Function();
        if(ctx.arrowFunctionStart() != null ){
             function =  (Function) visitArrowFunctionStart( ctx.arrowFunctionStart());
        }
        else if(ctx.regularFunctionStart() != null ){
            function =  (Function) visitRegularFunctionStart( ctx.regularFunctionStart());
        }
        String componentName = function.getFunctionName() ;
        ArrayList<Statment> statmentArrayList = new ArrayList<Statment>();
        SymbolTable parentSymbolTable = symbolTable ;
        symbolTable = symbolTable.newInstance(ctx.getStart().getLine() , "Functional Component") ;
        for(int i =0 ; i< ctx.componentBody().statment().size() ;i++){
            statmentArrayList.add( (Statment) visitStatment( ctx.componentBody().statment(i)) );
        }
        symbolTable = parentSymbolTable ;
        JsxElement returnValue = (JsxElement) visitJsxElement( ctx.componentBody().jsxReturnStatment().jsxElement() );
        return new Component(ctx.getStart().getLine() , componentName, function.getParams() , statmentArrayList , returnValue   ) ;
    }

    @Override
    public Object visitClassComponent(ReactParser.ClassComponentContext ctx) {
        if(ctx.Identifier() == null ) {
            symbolTable.addSyntaxError(ctx.getStart().getLine() , "component name is null ");
        }
        String componentName = ctx.Identifier().getText();
        ArrayList<Statment> statmentArrayList = new ArrayList<Statment>();
        ArrayList<Variable> params = new ArrayList<>( );
        for(int i =0 ;i < ctx.params().variable().size();i++){
            params.add( (Variable) visitVariable( ctx.params().variable(i)) ) ;
        }

        SymbolTable parentSymbolTable = symbolTable ;
        symbolTable = symbolTable.newInstance(ctx.getStart().getLine() , "Class Component") ;
        for(int i =0 ; i< ctx.componentBody().statment().size() ;i++){
            statmentArrayList.add( (Statment) visitStatment( ctx.componentBody().statment(i)) );
        }
        symbolTable = parentSymbolTable ;
        JsxElement returnValue = (JsxElement) visitJsxElement( ctx.componentBody().jsxReturnStatment().jsxElement() );
        return new Component(ctx.getStart().getLine() , componentName, params , statmentArrayList , returnValue   ) ;
    }

    @Override
    public Object visitJsxElement(ReactParser.JsxElementContext ctx) {
        String jsxTagName = "";

        if(ctx.jsxTagName().size() == 1 ) {
            if(ctx.jsxTagName(0).Identifier() == null ) {
                symbolTable.addSyntaxError(ctx.getStart().getLine() , "JsxTag name is null ");
            }
            jsxTagName = ctx.jsxTagName(0).Identifier().getText().toString();
        }
        else if(ctx.jsxTagName().size() == 2 ){
            if(!ctx.jsxTagName(0).Identifier().getText().equals(ctx.jsxTagName(1).Identifier().getText())) {
                symbolTable.addSyntaxError(ctx.getStart().getLine() , "Jsx Tag names does not match");
            }
            else {
                jsxTagName = ctx.jsxTagName(0).Identifier().getText();
            }
        }
        HashMap<String , Variable> jsxAttributes = new HashMap<>();
        for(int i =0 ;i < ctx.jsxAtt().size();i++){
            String jsxAttName = ctx.jsxAtt(i).jsxAttName().getText() ;
            Variable value = (Variable) visitVariable( ctx.jsxAtt(i).jsxAttValue().variable() ) ;
            jsxAttributes.put(jsxAttName , value) ;
        }
        ArrayList<JsxElement> children = new ArrayList<>();
        if(!ctx.jsxEleContent().isEmpty()){
            for(int i =0 ;i < ctx.jsxEleContent().size() ;i++){
                if(ctx.jsxEleContent(i).jsxElement() != null ){
                    JsxElement jsxElement = (JsxElement)  visitJsxElement( ctx.jsxEleContent(i).jsxElement() );
                    children.add( jsxElement) ;
                }

            }
        }

        JsxElement jsxElement = new JsxElement( ctx.getStart().getLine() , jsxTagName , jsxAttributes , children ) ;
        jsxElement.setRaw(ctx.getText());
        return jsxElement ;
    }

}




