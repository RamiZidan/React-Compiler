package ast.Statment;

import ast.CodeGeneartion;
import org.antlr.v4.runtime.misc.Pair;

public class Statment implements CodeGeneartion {
    public String codeGenerationType = "js";
    public Statment(){

    }
    public String toString(){
        return "" ;
    }

    @Override
    public Pair<String,String> generate() {
        return new Pair<>("","");
    }

    public String symbol(){
        return "" ;
    }

    @Override
    public int getLine() {
        return 0;
    }
    public String getCodeGenerationType() {
        return codeGenerationType;
    }
    public void  setCodeGenerationType(String codeGenerationType) {
        this.codeGenerationType = codeGenerationType;
    }
}
