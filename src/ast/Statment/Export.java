package ast.Statment;

import ast.CodeGeneartion;

import java.util.ArrayList;

public class Export extends Statment implements CodeGeneartion {
    public int line ;

    public ArrayList<String> items ;
    public String exportType ;

    public Export(int line , String exportType, ArrayList<String> items){
        this.exportType = exportType ;
        this.items = items;
        this.setLine(line);
    }

    public void setExportType(String exportType){
        this.exportType = exportType;
    }
    public void setItems(ArrayList<String> items ){
        this.items= items ;
    }
    public String getExportType(){
        return exportType;
    }
    public ArrayList<String> getItems(){
        return items;
    }
    public String toString(){
        return symbol();
    }
    public String symbol(){
        return "Export Statment { \n" + "type={" + exportType + "} items={" + items.toString() + "}\n }\n" ;
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
