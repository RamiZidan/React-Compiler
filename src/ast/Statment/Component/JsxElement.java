package ast.Statment.Component;

import ast.CodeGeneartion;
import ast.Statment.Statment;
import ast.Statment.Variable.Variable;

import java.util.ArrayList;
import java.util.HashMap;

public class JsxElement extends Statment implements CodeGeneartion {
    public int line ;
    public HashMap<String, Variable> attributes ;
    public String tagName ;
    public ArrayList<JsxElement> children ;
    public JsxElement(int line , String tagName , HashMap<String,Variable> attributes , ArrayList<JsxElement> children ){
        this.line = line ;
        this.tagName = tagName ;
        this.attributes = attributes;
        this.children = children;
    }

    @Override
    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public HashMap<String, Variable> getAttributes() {
        return attributes;
    }

    public void setAttributes(HashMap<String, Variable> attributes) {
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public ArrayList<JsxElement> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<JsxElement> children) {
        this.children = children;
    }


    public String generate(){
        return "" ;
    }
    public String toString(){
        return symbol();
    }
    public String symbol(){
        String str = "JsxElement { " + "\n" ;
        str+= "Tag={" + tagName + "} , \n";
        str+= "attributes={" +  attributes.toString() + "}\n" ;
        str += "Children={\n" ;
        for(int i =0  ;i < children.size();i++){
            str += "\n" ;
            str+= children.get(i).symbol();
            str += "\n" ;
        }
        str += "}\n" ;
        str+= "}\n" ;
        return str ;
    }

}
