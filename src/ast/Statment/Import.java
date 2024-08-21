package ast.Statment;

import ast.CodeGeneartion;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class Import extends Statment {
    public int line ;
    public String moduleName;
    public ArrayList<String> items ;

    public Import(int line ,String moduleName , ArrayList<String> items){
        this.moduleName = moduleName ;
        this.items = items;
        this.setLine(line);
    }

    public void setModuleName(String moduleName){
        this.moduleName = moduleName ;
    }
    public void setItems(ArrayList<String> items ){
        this.items= items ;
    }
    public String getModuleName(){
        return moduleName;
    }
    public ArrayList<String> getItems(){
        return items;
    }
    public String toString(){
        return symbol();
    }
    public String symbol(){
        return "Import Statment { \n" + "module={" + moduleName + "} items={" + items.toString() + "}\n }\n" ;
    }
    @Override
    public Pair<String,String> generate() {
        String html = "" , js = "" ;
        js = "import " ;
        for(String item : items){
            js+= item  + " , ";
        }
        js += "from " + moduleName ;
        return new Pair<>(html,js);
    }
    public void setLine(int line){
        this.line = line ;
    }
    public int getLine(){
        return line;
    }



}
