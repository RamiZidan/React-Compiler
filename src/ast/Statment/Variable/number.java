package ast.Statment.Variable;

import ast.CodeGeneartion;

public class number extends Variable implements CodeGeneartion {
    public int varValue = 0 ;
    public number(){

    }
    public number(int line ,String varModifier , String varName  , String varValue ){
        super(line,varModifier , varName , "string" ) ;
        this.varValue = Integer.parseInt(varValue) ;
    }
    public number(int line,String varModifier , String varName, int varValue ){
        super(line,varModifier , varName , "string" ) ;
        this.varValue = varValue  ;
    }
    public void setVarValue(String varValue ){
        this.varValue = Integer.parseInt(varValue);
    }
    public void setVarValue(int varValue ){
        this.varValue = varValue ;
    }
    public int getNumberValue(){
        return varValue;
    }
    @Override
    public String getVarValue(){
        return Integer.toString(varValue) ;
    }
    @Override
    public String toString() {
        return symbol();
    }
    @Override
    public String symbol() {
        String str = "Variable { \n type=number\n" ;
        if(!isVarNameNull()){
            str += "name={" + varName + "}" ;
        }
        str += ", value={" + Integer.toString(varValue) + "}\n }\n";
        return str ;
    }

    @Override
    public String generate() {
        return "";
    }


}
