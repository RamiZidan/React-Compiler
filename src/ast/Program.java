
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
            str+= statments.get(i).toString() + " \n" ;
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
        String js = "<script>\n " ;
        js += "let states = {}  ; " ;
        for(int i =0 ;i < statments.size() ;i++){
            Statment statment = statments.get(i);
            if(statments.get(i).generate().a != null )
            html += statment.generate().a + " \n" ;
            if(statments.get(i).generate().b != null )
            js+= statment.generate().b + " \n" ;
        }
        js+= "</script>\n" ;
        html += htmlFooter;
        System.out.println("/*----- Code Generation Start ------*/");
        System.out.println("/* Generated HTML Code */");
        System.out.println(html);
        System.out.println("/* Generated JS Code */");
        System.out.println(js);
        System.out.println("/*------ Code Generation End  ------*/");
        return new Pair(html , js) ;
    }
    public void print_ast(){
        System.out.println(this.toString());
    }
}
