
package ast;
import ast.Statment.Statment;

import java.util.ArrayList;

public class Program {
    ArrayList<Statment> statments ;
    public Program(){

    }
    public Program(ArrayList<Statment> statments){
        this.statments = statments ;
    }
    public void addStatment(Statment statment){
        this.statments.add(statment);
    }
    public ArrayList<Statment> getStatments(){
        return statments ;
    }
    public String symbol(){
        return toString();
    }
    public String toString(){
        String str = "Program { " ;
        for(int i =0  ;i < statments.size() ;i++){
            str += " Statment { "  ;
            str+= statments.get(i).toString();
            str+= "}" ;
        }
        str+= "}";
        return str ;
    }
}
