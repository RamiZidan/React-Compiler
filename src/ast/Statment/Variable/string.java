package ast.Statment.Variable;

import ast.CodeGeneartion;

public class string extends Variable implements CodeGeneartion {
    public String varValue = "" ;
    public string (){

    }
    public string(int line ,String varModifier , String varName , String varValue ){
        super(line,varModifier , varName , "string" ) ;
        this.varValue = varValue;

    }
    public void setVarValue(String varValue ){
        this.varValue = varValue;
    }
    public String getVarValue(){
        return varValue ;
    }
    @Override
    public String toString(){
        return symbol();
    }
    @Override
    public String symbol(){

        String str = "Variable { \n type=string\n" ;
        if(!isVarNameNull()){
            str += "name={" + varName + "}" ;
        }
        str+= ", value={" + varValue + "}\n }\n";
        return str;
    }
    @Override
    public String generate() {
        return "";
    }


}
