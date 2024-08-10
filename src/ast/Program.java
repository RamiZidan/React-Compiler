
package ast;
import ast.Statment.Statment;
import org.antlr.v4.runtime.misc.Pair;


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

    public Pair<String,String> generateCode(){
        String htmlHeader = "<html> \n<head> </head>\n<body> \n" ;
        String htmlFooter = "</body> \n</html>\n";
        String html = "" ;
        html += htmlHeader;
        String js = "" ;
        for(int i =0 ;i < statments.size() ;i++){
            Statment statment = statments.get(i);
            html += statment.generate().a + "\n" ;
            js+= statment.generate().b + "\n" ;
        }
        html += htmlFooter;
        System.out.println("HTML");
        System.out.println(html);
        System.out.println("JS");
        System.out.println(js);
        return new Pair(html , js) ;
    }
    public void print_ast(){
        System.out.println(this.toString());
    }
}
