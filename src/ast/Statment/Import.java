package ast.Statment;

import ast.CodeGeneartion;

import java.util.ArrayList;

public class Import extends Statment implements CodeGeneartion {
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
