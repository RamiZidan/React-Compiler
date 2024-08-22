package ast.Statment.Variable;
import ast.CodeGeneartion;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class array extends Variable implements CodeGeneartion {
    ArrayList<Variable> varValue ;

    public array(int line, String varModifier , String varName , ArrayList<Variable> varValue ){
        super(line ,varModifier , varName , "array") ;
        this.varValue= varValue;
    }

    public void add(Variable var){
        varValue.add(var);
    }

    public ArrayList<Variable> getArrayValue(){
        return varValue ;
    }

    public void setVarValue(ArrayList<Variable> varValue){
        this.varValue = varValue;
    }
    @Override
    public String getVarValue(){
        return "[" +
                varValue.toString()  + "]";
    }
    @Override
    public String toString() {
        return  symbol();
    }
    @Override
    public String symbol() {
        String str =  "Variable { \n type=array\n" ;
        if(!isVarNameNull()){
            str += "name={" + varName + "}" ;
        }
        str+= ", \n value={" + varValue.toString() + "}\n }\n";
        return str ;
    }

    @Override
    public String generateVarValue(){
//        String html = "" ;
        String js = "[" ;
        for(int i = 0 ; i < varValue.size() ; i++){
            js += varValue.get(i).generateVarValue() + (i == varValue.size()-1 ? "," : "") ;
        }
        js += "]\n" ;
        return js ;
    }

}
