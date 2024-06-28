package ast.Statment.Hook;

import ast.CodeGeneartion;
import ast.Statment.Statment;
import ast.Statment.Variable.Variable;

import java.util.ArrayList;

public class UseEffect extends Hook implements CodeGeneartion {
    public ArrayList<Variable> dependencyList ;
    public ArrayList<Statment> statmentsList ;
    UseEffect(ArrayList<Variable> dependencyList , ArrayList<Statment> statmentsList){
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
    public String generate() {
        return "";
    }
    public String toString(){
        return symbol();
    }
    @Override
    public String symbol() {
        return "Hook { " + " type=useEffect , "  + " depenecyList=" + dependencyList.toString()  + ", statmentsList=" + statmentsList.toString()   + " }" ;
    }

}
