package ast.Statment;

import ast.CodeGeneartion;
import ast.Statment.IfStatment.Condition;

import java.util.ArrayList;

public class While extends Statment implements CodeGeneartion {
    public int line;
    public ArrayList<Condition> conditionsList ;
    public ArrayList<Statment> statments ;
    While(int line , ArrayList<Condition> conditionsList , ArrayList<Statment> statments){
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
        return "While statment { " + "conditions=" + conditionsList.toString()  + "statments=" +  statments.toString() + " }" ;
    }

    public String generate() {
        return "";
    }
    public void setLine(int line){
        this.line = line ;
    }
    public int getLine(){
        return line;
    }


}
