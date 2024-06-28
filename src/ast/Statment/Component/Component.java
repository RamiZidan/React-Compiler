package ast.Statment.Component;

import ast.CodeGeneartion;
import ast.Statment.Statment;
import ast.Variable.Variable;

import java.util.ArrayList;

public class Component extends Statment implements CodeGeneartion {
    public int line ;
    public String componentName ;
    public ArrayList<String> params ;
    public ArrayList<Statment> statments ;
    public JsxElement returnValue ;
    Component(int line , String componentName , ArrayList<String> params, ArrayList<Statment> statments , JsxElement returnValue ){
        this.statments = statments;
        this.params = params ;
        this.returnValue = returnValue;
        this.componentName = componentName ;
        this.setLine(line);
    }

    public String getFunctionName() {
        return componentName;
    }

    public void setFunctionName(String componentName) {
        this.componentName = componentName;
    }

    public JsxElement getReturnValue() {
        return returnValue;
    }
    public void setReturnValue(JsxElement returnValue) {
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
