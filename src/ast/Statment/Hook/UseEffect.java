package ast.Statment.Hook;

import ast.CodeGeneartion;
import ast.Statment.Statment;
import ast.Statment.Variable.Variable;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class UseEffect extends Hook  {
    public ArrayList<Variable> dependencyList ;
    public ArrayList<Statment> statmentsList ;
    public UseEffect(ArrayList<Variable> dependencyList , ArrayList<Statment> statmentsList){
        this.dependencyList = dependencyList;
        this.statmentsList= statmentsList;
    }
    public void setDependencyList(ArrayList<Variable> dependencyList){
        this.dependencyList = dependencyList;
    }
    public void setStatmentsList(ArrayList<Statment> statmentsList){
        this.statmentsList = statmentsList;
    }
    public ArrayList<Variable> getDependencyList(){
        return dependencyList;
    }
    public ArrayList<Statment> getStatmentsList(){
        return statmentsList;
    }

    public String toString(){
        return symbol();
    }
    @Override
    public String symbol() {
        return "Hook { \n" + " type=useEffect ,\n "  + " depenecyList={" + dependencyList.toString()  + "}\n, statmentsList={\n" + statmentsList.toString()   + "\n }\n" ;
    }
    public Pair<String,String> generate() {
        String html = "" ;
        String js = "window.onload = () => { \n" ;
        
        js += "}\n";

        return new Pair<>(html,js);
    }

}
