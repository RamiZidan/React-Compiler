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
        js += "let declare " + moduleName.replaceAll("'","") + "\n" ;
        js += "const {" ;
        for(int i =0 ;i < items.size() ;i++){
            js+= items.get(i);
            if(i != items.size()-1 ){
                js+= " , " ;
            }
        }
        js+= "}" ;
        if(moduleName.equals("'react'")){
            html+= "<script crossorigin src=\"https://unpkg.com/react@18/umd/react.production.min.js\"></script>\n";
        }
        js += " = " + moduleName.replaceAll("'","") ;
        return new Pair<>(html,js);
    }
    public void setLine(int line){
        this.line = line ;
    }
    public int getLine(){
        return line;
    }



}
