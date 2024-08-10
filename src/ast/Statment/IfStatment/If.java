package ast.Statment.IfStatment;

import ast.CodeGeneartion;
import ast.Statment.Statment;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class If extends Statment {
    public int line;
    public ArrayList<Condition> conditionsList ;
    public ArrayList<Statment> statments ;
    public If(int line , ArrayList<Condition> conditionsList , ArrayList<Statment> statments){
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
        String str =  "If statment { \n" + "conditions={" + conditionsList.toString()  +"}\n" ;
         str += ", statments= {\n" ;
         for(int i =0  ;i < statments.size();i++){
             str += "\n" ;
             str += statments.toString() ;
             str += "\n" ;
         }
         str+= "}\n" ;
         str += "}\n" ;
         return str ;
    }
    public void setLine(int line){
        this.line = line ;
    }
    public int getLine(){
        return line;
    }

    @Override
    public Pair<String,String> generate() {
        String html = "" ;
        String js = "if ( " + conditionsList.toString() ;
        for(Condition condition : conditionsList){
            html+= condition.generate().a ;
            js += condition.generate().b;
        }
        js += " ) " ;
        js += "{\n";
        for(Statment statment : statments){
            html += statment.generate().a + "\n" ;
            js += statment.generate().b + "\n" ;
        }
        js += "}\n" ;
        return new Pair<String,String>(html,js) ;
    }
}
