package ast.Variable;

import ast.Statment.Statment;

abstract public class Variable extends Statment {
    public String varModifier;
    public String varName ;
    public String varValue ;
    public String varType ;
    public int line ;

    Variable(){
    }
    Variable(int line ,String varModifier , String varName , String varType){
        this.varModifier = varModifier ;
        this.varName = varName ;
        this.varType = varType ;
        this.line = line ;
    }

    public String getVarName(){
        return varName;
    }
    public String getVarType(){
        return varType ;
    }
    public String getVarModifier(){
        return varModifier ;
    }
    public String getVarValue(){
        return varValue ;
    }
    public void setVarValue (String varValue ){
        this.varValue = varValue ;
    }
    public int getLine(){
        return line ;
    }
    public void setLine(int line){
        this.line = line ;
    }
    public void setVarName(String varName){
        this.varName = varName;
    }
    public void setVarType(String varType){
        this.varType = varType ;
    }
    public void setVarModifier(String varModifier){
        this.varModifier = varModifier ;
    }
    public String symbol(){ return "Variable {" + varName + " = " + varValue + " }" ;}
    public String toString(){
        return symbol();
    }
}
