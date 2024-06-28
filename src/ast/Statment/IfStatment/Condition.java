package ast.Statment.IfStatment;

import ast.Variable.Variable;

public class Condition  {
    public Variable variable1 ;
    public Variable variable2 ;
    public String compare ;
    Condition(Variable variable1 , Variable variable2 , String compare){
        this.variable1 = variable1 ;
        this.variable2 = variable2 ;
        this.compare = compare ;
    }
    Condition(Variable variable1 ){
        this.variable1 = variable1;
    }
    public String toString(){
        return symbol();
    }
    public String symbol(){

        String str = "Conditon { " ;
        if(variable1 != null){
            str+= "Variable-1=" + variable1.toString();
        }
        str+= "Compare="+ compare;
        if(variable2 != null){
            str+= "Variable-2" + variable2.toString();
        }
        return str ;
    }


}
