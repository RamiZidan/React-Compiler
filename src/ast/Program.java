
package ast;
import ast.Statment.Statment;
import org.antlr.v4.runtime.misc.Pair;


import java.io.FileWriter;
import java.io.IOException;
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

    public void  generateCode(){
        try {
            FileWriter htmlFile = new FileWriter("html.html");
            FileWriter jsFile = new FileWriter("js.js");

            String htmlHeader = "<html> \n<head> </head>\n<body> \n";
            String htmlFooter = "</body> \n</html>\n";
            String html = "";
            html += "/* Generated HTML Code */";

            html += htmlHeader;
            String js = "/* Generated JS Code */ \n";
            js += "";
            js += "let states = {}  ; \n";
            for (int i = 0; i < statments.size(); i++) {
                Statment statment = statments.get(i);
                if (statments.get(i).generate().a != null)
                    html += statment.generate().a + " \n";
                if (statments.get(i).generate().b != null)
                    js += statment.generate().b + " \n";
            }
            js += "\n";
            html += htmlFooter;
            htmlFile.write(html);
            jsFile.write(js);
            htmlFile.close();
            jsFile.close();
        }
        catch(IOException e ){

        }

//        return new Pair(html , js) ;
    }
    public void print_ast(){
        System.out.println(this.toString());
    }
}
