package ast.Statment.FunctionStatment;

import ast.CodeGeneartion;
import ast.Statment.Statment;
import ast.Variable.Variable;

import java.util.ArrayList;

public class Function extends Statment implements CodeGeneartion {
    public int line ;
    public String functionName ;
    public ArrayList<String> params ;
    public ArrayList<Statment> statments ;
    public Variable returnValue ;
    Function(int line , String functionName , ArrayList<String> params, ArrayList<Statment> statments , Variable returnValue ){
        this.statments = statments;
        this.params = params ;
        this.returnValue = returnValue;
        this.functionName = functionName ;
        this.setLine(line);
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

    public void setParams(ArrayList<String> params) {
        this.params = params;
    }

    public ArrayList<String> getParams() {
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
        return "Function { " + "params=" + params.toString() + ", statments=" + statments.toString()  + ", returnStatment=" + returnValue.toString() + " }" ;
    }
    public String generate(){
        return "";
    }
}
