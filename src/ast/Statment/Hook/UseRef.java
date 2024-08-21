package ast.Statment.Hook;

import ast.CodeGeneartion;
import ast.Statment.Variable.Variable;
import org.antlr.v4.runtime.misc.Pair;

public class UseRef extends Hook  {
    public String varName;
    public Variable value ;
    public UseRef(String varName , Variable value){
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

    public Pair<String,String> generate() {
        String html = "" , js = "" ;
        js += "let " + varName + " = document.getElementById('" + varName + "')'" ;
        return new Pair(html,js);
    }
    public String toString(){
        return symbol();
    }
    @Override
    public String symbol() {
        return "Hook { \n" + " type=useRef , \n"  + " hookName={" + varName + "}\n, value={" + value.toString() + " }\n }\n" ;
    }


}
