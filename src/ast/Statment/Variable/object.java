package ast.Statment.Variable;

import ast.CodeGeneartion;

import java.util.HashMap;

public class object extends Variable implements CodeGeneartion {
    HashMap<String,Variable> varValue ;
    public object(int line ,String varModifier , String varName , HashMap<String,Variable> varValue){
        super(line,varModifier , varName , "object");
        this.varValue = varValue ;
    }
    public void addProperty(String key , Variable value ){
        varValue.putIfAbsent(key ,value) ;
    }
    public void assignValue(String key , Variable value){
        varValue.put(key ,value);
    }
    public String getVarValue(){
        return varValue.toString();
    }
    public HashMap<String,Variable> getObjectValue(){
        return varValue;
    }
    @Override
    public String toString(){
        return symbol();
    }
    @Override
    public String symbol(){
        return "Variable { " + "name=" + varName + " value=" + varValue.toString() + " }";
    }

    @Override
    public String generate() {
        return "";
    }

}
