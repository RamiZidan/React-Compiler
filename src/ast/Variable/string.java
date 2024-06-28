package ast.Variable;

import ast.CodeGeneartion;

public class string extends Variable implements CodeGeneartion {
    public String varValue = "" ;

    string(int line ,String varModifier , String varName , String varValue ){
        super(line,varModifier , varName , "string" ) ;
        this.varValue = varValue;

    }
    public void setVarValue(String varValue ){
        this.varValue = varValue;
    }
    public String getVarValue(){
        return varValue ;
    }
    @Override
    public String toString(){
        return symbol();
    }
    @Override
    public String symbol(){
        return "Variable { " + "name=" + varName + ", value=" + varValue + " }";
    }
    @Override
    public String generate() {
        return "";
    }


}
