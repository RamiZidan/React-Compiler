package ast.Statment.Hook;

import ast.CodeGeneartion;
import ast.Statment.Variable.Variable;
import org.antlr.v4.runtime.misc.Pair;

public class UseState extends Hook  {
    public String stateName;
    public String setStateFunctionName ;
    public Variable value ;
    public UseState(String stateName , String setStateName , Variable value){
        this.stateName = stateName ;
        this.setStateFunctionName = setStateName ;
        this.value = value ;
    }

    public void setStateName(String stateName){
        this.stateName = stateName ;
    }
    public void setSetStateFunctionName(String setStateFunctionName){
        this.setStateFunctionName = setStateFunctionName;
    }
    public void setValue(Variable value ){
        this.value = value ;
    }
    public String getStateName(){
        return stateName;
    }
    public String getSetStateFunctionName(){
        return setStateFunctionName;
    }
    public Variable getValue() {
        return value;
    }
    public String toString(){
        return symbol();
    }
    @Override

    public String symbol() {
        return "Hook { \n" + " type=useState , "  + " stateName={" + stateName + "}\n, setStateFunction={" + setStateFunctionName + "}\n, value={" + value.toString()  + "}\n }\n" ;
    }

    public Pair<String,String> generate() {
        String html = "" ;
        String js = "" ;
        js+= "states = { ...states , " + stateName + " } ; ";
        return new Pair(html, js);
    }
}
