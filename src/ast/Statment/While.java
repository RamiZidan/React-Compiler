package ast.Statment;

import ast.CodeGeneartion;
import ast.Statment.IfStatment.Condition;

import java.util.ArrayList;

public class While extends Statment  {
    public int line;

    public ArrayList<Condition> conditionsList ;
    public ArrayList<Statment> statments ;
    public While(int line , ArrayList<Condition> conditionsList , ArrayList<Statment> statments){
        this.conditionsList = conditionsList ;
        this.statments = statments;
        this.setLine(line);
    }

    public void setConditionsList(ArrayList<Condition> conditionsList) {
        this.conditionsList = conditionsList;
    }

    public void setStatments(ArrayList<Statment> statments) {
        this.statments = statments;
    }

    public ArrayList<Condition> getConditionsList() {
        return conditionsList;
    }

    public ArrayList<Statment> getStatments() {
        return statments;
    }
    public String toString(){
        return symbol();
    }
    public String symbol(){
        String str =  "While statment { \n" + "conditions={" + conditionsList.toString()  + "} \n statments=" + " {" ;
        for(int i =0 ;i < statments.size();i++){
            str+= statments.get(i).toString();
        }
        str += " }\n" ;
        str += " }\n" ;
        return str ;
    }

    public String generate() {
        String str = "While( " + conditionsList.toString() + ")\n" + " {" ;
        return str;
    }
    public void setLine(int line){
        this.line = line ;
    }
    public int getLine(){
        return line;
    }


}
