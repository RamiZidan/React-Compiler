package ast.Hook;

import ast.CodeGeneartion;
import ast.Variable.Variable;

public class UseRef extends Hook implements CodeGeneartion {
    public String varName;
    public Variable value ;
    UseRef(String varName , Variable value){
        this.varName = varName ;
        this.value = value ;
    }
    public void setVarName(String varName){
        this.varName = varName ;
    }
    public void setValue(Variable value ){
        this.value = value ;
    }
    public String getVarName(){
        return varName;
    }
    public Variable getValue(){
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
        return "Hook { " + " type=useRef , "  + " hookName=" + varName + ", value=" + value.toString() + " }" ;
    }


}
