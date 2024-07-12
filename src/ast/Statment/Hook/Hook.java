package ast.Statment.Hook;

import ast.CodeGeneartion;
import ast.Statment.Statment;

public class Hook extends Statment implements CodeGeneartion {
    public int line ;
    public String hookName ;
    public Hook(){

    }


    @Override
    public String generate() {
        return "";
    }

    @Override
    public String symbol() {
        return "";
    }

    @Override
    public int getLine() {
        return line ;
    }
}
