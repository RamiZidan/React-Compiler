package ast.Statment.Component;

import ast.CodeGeneartion;
import ast.Statment.Statment;
import ast.Statment.Variable.Variable;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class Component extends Statment  {
    public int line ;
    public String componentName ;
    public ArrayList<Variable> params ;
    public ArrayList<Statment> statments ;
    public JsxElement returnValue ;
    public Component(int line , String componentName , ArrayList<Variable> params, ArrayList<Statment> statments , JsxElement returnValue ){
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
        String str = "Function { \n" +
                        "params={" + params.toString() + "}\n" ;
        str += ", statments={" ;
        for(int i =0  ;i < statments.size() ;i++){
            str += statments.get(i).toString() + " \n";
        }
        str += "}\n" ;
        str += ", returnStatment={" + returnValue.toString() + "}\n";
        str += "}\n" ;
        return str ;
    }
    public Pair<String,String> generate(){
        String html = "<!-- Comment Component name " + componentName + " --> \n";
        String js = "" ;
        for(int i =0 ;i < statments.size() ;i++){
            if(statments.get(i).generate().a != null )
                html += statments.get(i).generate().a + " \n";
            if(statments.get(i).generate().b != null )
                js += statments.get(i).generate().b + " \n" ;
        }

        if(returnValue.generate().a !=null )
            html += returnValue.generate().a ;
        return new Pair(html,js);

    }
}
