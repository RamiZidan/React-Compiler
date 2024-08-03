
package ast;
import ast.Statment.Statment;

import java.util.ArrayList;

public class Program {
    ArrayList<Statment> statments = new ArrayList<>();
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
        String str = "Program { \n" ;
        for(int i =0  ;i < statments.size() ;i++){
            str += " Statment { \n"  ;
            str+= statments.get(i).toString() + "\n" ;
            str+= "}\n" ;
        }
        str+= "}\n";
        return str ;
    }
    public void print_ast(){
        System.out.println(this.toString());
    }
}
