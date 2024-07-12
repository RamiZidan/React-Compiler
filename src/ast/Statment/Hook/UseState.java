package ast.Statment.Hook;

import ast.CodeGeneartion;
import ast.Statment.Variable.Variable;

public class UseState extends Hook implements CodeGeneartion {
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

    public String generate() {
        return "";
    }
    public String toString(){
        return symbol();
    }
    @Override

    public String symbol() {
        return "Hook { " + " type=useState , "  + " stateName=" + stateName + ", setStateFunction=" + setStateFunctionName + ", value=" + value.toString()  + " }" ;
    }

}
