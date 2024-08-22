package ast.Statment.Component;

import ast.Statment.Statment;
import org.antlr.v4.runtime.misc.Pair;

public class JsxEleContent extends Statment {
    public JsxElement jsxElement;
    public String raw ;
    public JsxEleContent(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }
    public JsxEleContent(String raw) {
        this.raw = raw;
    }
    public Pair<String,String> generate (){
        String html = "" ;
        if( raw != null){
            html+= raw ;
        }
        else if(jsxElement != null){
            html += jsxElement.generate();
        }
       return new Pair<>(html ,"");
    }
    public String symbol(){
        if(jsxElement != null)
            return jsxElement.symbol();
        else if(raw != null)
            return raw;
        else
            return "" ;
    }
    public String toString(){
        return symbol();
    }
}

