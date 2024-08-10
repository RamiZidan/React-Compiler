package ast;

import org.antlr.v4.runtime.misc.Pair;

public interface CodeGeneartion {
    public int line = -1;
    public Pair<String,String> generate();
    public String symbol();
    public int getLine() ;
}
