package SymbolTable;

import ast.Statment.Variable.Variable;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public int line = 0 ;
    public String scopeIdentifier = "global" ;
    public boolean hasSyntaxError = false;
    public boolean hasSemanticError = false;
    public HashMap<String , Variable> table = new HashMap<>();
    public HashMap<String , Variable> parentTable = new HashMap<>();
    public SymbolTable parent ;
    public ArrayList<SymbolTable> children = new ArrayList<>();

    public ArrayList<Pair<Integer, String>> SemanticErrors = new ArrayList<>();
    public ArrayList<Pair<Integer,String>> SyntaxErrors = new ArrayList<>();

    public SymbolTable(){
    }

    public SymbolTable newInstance(){
        SymbolTable newTable = new SymbolTable();
        newTable.parent = this;
        newTable.children = new ArrayList<>();
        newTable.parentTable = this.table ;
        children.add(newTable);
        return newTable ;
    }
    public SymbolTable newInstance(int line  , String scopeIdentifier){
        SymbolTable newTable = new SymbolTable();
        newTable.parent = this;
        newTable.children = new ArrayList<>();
        newTable.parentTable = new HashMap<>();
        newTable.parentTable.putAll(this.table);
        newTable.parentTable.putAll(this.parentTable);
        children.add(newTable);
        newTable.line = line ;
        newTable.scopeIdentifier = scopeIdentifier;
        return newTable;
    }
    public void setLine(int line ){
        this.line = line ;
    }
    public int getLine(){
        return line ;
    }
    public void setScopeIdentifier(String scopeIdentifier){
        this.scopeIdentifier = scopeIdentifier ;
    }
    public String getScopeIdentifier(){
        return scopeIdentifier ;
    }
    public void addSyntaxError(int line , String errorMessage ){
        hasSyntaxError = true;
        SyntaxErrors.add(new Pair<>(line , errorMessage));
    }
    public void addSemanticError(int line , String errorMessage ){
        hasSemanticError = true;
        SemanticErrors.add(new Pair<>(line , errorMessage));
    }

    public Boolean addVariable(Variable var){
        // need to recheck logic of (table,parentTable) (because if we want to update a value of variable it will be updated in the child table not in the original table
        String varName = var.getVarName() ;
        if(varName.equals("")){
            return false ;
        }
        if(table.containsKey(varName)){

            Variable existingVariable = table.get(varName);
            if(existingVariable.getVarModifier() == "var" && var.getVarName() == "var"){
                table.put(varName, var);
            }else{
                addSemanticError( var.getLine() , "Variable: " + varName + "has already been declared");
                this.hasSemanticError = true;
                return false ;
            }
        }
        else{
            table.put(varName , var);
        }
        return true ;
    }

    public Boolean updateVariable(Variable var){
        String varName = var.getVarName() ;
        if(varName.equals("")){
            return false ;
        }
        if(table.containsKey(varName) || parentTable.containsKey(varName) ){
            if(table.containsKey(varName)){
                Variable variable = table.get(varName);
                if(variable.getVarModifier() == "const"){
                    addSemanticError(var.getLine() , "Variable: " + varName + "Uncaught TypeError: Assignment to constant variable.");
                    return false ;
                }
                else{
                    table.put(varName, var);
                }
            }
            else{
                Variable variable = parentTable.get(varName);
                if(variable.getVarModifier() == "const"){
                    addSemanticError(var.getLine() , "Variable: " + varName + "Uncaught TypeError: Assignment to variable.");
                    return false ;
                }
                else{
                    parentTable.put(varName, var);
                }
            }
        }
        else{
            addSemanticError(var.getLine() , "Rerfrance Error: " + varName + " is not defined");
            return false ;
        }
        return true ;
    }

    public Variable getVariable(String varName){
        return table.get(varName);
    }

    public void printTable(){
        HashMap<String,Pair<String, Variable>> table = new HashMap<>();
        ArrayList<Pair<Integer,String>> SemnaticErrors = new ArrayList<>();
        ArrayList<Pair<Integer,String>> SyntaxErrors = new ArrayList<>();
        getTable(this , table , SemnaticErrors , SyntaxErrors);
        System.out.println("###### Symbol Table ########");
        if(!SemanticErrors.isEmpty() || !SyntaxErrors.isEmpty()){
            System.out.println("Errors:");
        }
        if(!SemanticErrors.isEmpty()){
            System.out.println("Sematnic Errors:");
        }
        for(Pair<Integer,String> pair : SemnaticErrors){
            System.out.println("Line: " + pair.a  + " Error: " + pair.b);
        }
        if(!SyntaxErrors.isEmpty()){
            System.out.println("Syntax Errors:");
        }
        for(Pair<Integer,String> pair : SyntaxErrors){
            System.out.println("Line: " + pair.a  + " Error: " + pair.b);
        }
        System.out.println("Variables:");
        for(Map.Entry<String,Pair<String, Variable>> entry : table.entrySet()){
            System.out.println(entry.getValue()) ;
        }

    }
    public void getTable(SymbolTable symbolTable  , HashMap<String ,  Pair<String, Variable>> table , ArrayList<Pair<Integer, String>> semanticErrors , ArrayList<Pair<Integer, String>> syntaxErrors ){
        for( Map.Entry<String, Variable> entry : symbolTable.table.entrySet() ){
            String varName = entry.getKey() ;
            Variable var = entry.getValue() ;
            String description = "Line: " + var.getLine() + " , Scope: " + scopeIdentifier + "\n" +
                                 "Variable: name=" + varName +  " , "  + var.toString().replace('\n' ,' ');
            table.put(varName , new Pair<>( description  , var ) );
        }
        semanticErrors.addAll(symbolTable.SemanticErrors);
        syntaxErrors.addAll(symbolTable.SyntaxErrors);
        for(SymbolTable child : symbolTable.children){
            child.getTable(child , table , semanticErrors , syntaxErrors );
        }
    }

}