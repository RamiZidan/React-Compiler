package ast.Statment.Variable;

import ast.Statment.Statment;
import org.antlr.v4.runtime.misc.Pair;

public class Variable extends Statment {
    public String varModifier;
    public String varName = "" ;
    public String varValue ;
    public String varType ;
    public int line ;
    public Variable(){
    }
    public Variable(int line ,String varModifier , String varName , String varType){
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
    public String symbol(){ return "Variable {\n" + varName + " = " + varValue + " }\n" ;}
    public String toString(){
        return symbol();
    }
    public Boolean isVarNameNull(){

        return varName.isEmpty();
    }
    public Pair<String,String> generate(){
        String js = varModifier + " " + varName + " = " + generateVarValue() ;
        return new Pair<>("",js);
    }
    public String generateVarValue(){
        if(varValue == null)
            return "" ;
        return varValue.toString();
    }
}