package ast.Statment.FunctionStatment;

import ast.CodeGeneartion;
import ast.Statment.Statment;
import ast.Statment.Variable.Variable;

import java.util.ArrayList;

public class Function extends Statment implements CodeGeneartion {
    public int line ;
    public String functionName ;
    public ArrayList<Variable> params ;
    public ArrayList<Statment> statments ;
    public Variable returnValue ;
    public Function(int line , String functionName , ArrayList<Variable> params, ArrayList<Statment> statments , Variable returnValue ){
        this.statments = statments;
        this.params = params ;
        this.returnValue = returnValue;
        this.functionName = functionName ;
        this.setLine(line);
    }
    public Function(){

    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Variable getReturnValue() {
        return returnValue;
    }
    public void setReturnValue(Variable returnValue) {
        this.returnValue = returnValue;
    }

    public void setStatments(ArrayList<Statment> statments) {
        this.statments = statments;
    }

    public void setParams(ArrayList<Variable> params) {
        this.params = params;
    }

    public ArrayList<Variable> getParams() {
        return params;
    }

    public ArrayList<Statment> getStatments() {
        return statments;
    }

    public void setLine(int line) {
        this.line = line;
    }
    @Override
    public int getLine() {
        return line;
    }
    public String toString(){
        return symbol();
    }
    @Override
    public String symbol() {
        String str =  "Function { " + "params=" + params.toString() ;
        str +=  ", statments= { " ;
        for(int i =0  ;i < statments.size() ;i++){
            str+= statments.get(i).toString();
        }
        str += ", returnStatment=" + returnValue.toString() + " }" ;
        return str ;

    }
    public String generate(){
        return "";
    }
}
