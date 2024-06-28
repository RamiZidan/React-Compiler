package ast.Variable;
import ast.CodeGeneartion;

import java.util.ArrayList;

public class array extends Variable implements CodeGeneartion {
    ArrayList<Variable> varValue ;
    array(int line, String varModifier , String varName , ArrayList<Variable> varValue ){
        super(line ,varModifier , varName , "array") ;
        this.varValue= varValue;
    }

    public void add(Variable var){
        varValue.add(var);
    }

    public ArrayList<Variable> getArrayValue(){
        return varValue ;
    }

    public void setVarValue(ArrayList<Variable> varValue){
        this.varValue = varValue;
    }
    @Override
    public String getVarValue(){
        return varValue.toString() ;
    }
    @Override
    public String toString() {
        return  symbol();
    }
    @Override
    public String symbol() {
        return "Variable { " + "name=" + varName + ", value=" + varValue.toString() + " }";
    }

    @Override
    public String generate() {
        return "";
    }

}
