package ast.Statment.Hook;

import ast.CodeGeneartion;
import ast.Statment.Statment;
import org.antlr.v4.runtime.misc.Pair;

public class Hook extends Statment  {
    public int line ;
    public String hookName ;
    public Hook(){

    }


    @Override
    public Pair<String,String>  generate() {
        return new Pair<>("","");
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
