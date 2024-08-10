package ast.Statment.Variable;

import ast.CodeGeneartion;
import org.antlr.v4.runtime.misc.Pair;

import java.util.HashMap;
import java.util.Map;

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
        String str = "Variable { \n type=object\n" ;
        if(!isVarNameNull()){
            str += "name={" + varName + "}" ;
        }
        str +=  ", value={" + varValue.toString() + "}\n }\n";
        return str;
    }

    @Override
    public String generateVarValue(){
        String js = "{\n" ;
        for(String key : varValue.keySet()){
            js += key + ":" + varValue.get(key).generateVarValue() + "\n" ;
        }
        js += "}\n";
        return js ;
    }

}
