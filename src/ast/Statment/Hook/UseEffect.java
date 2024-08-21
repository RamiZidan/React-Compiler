package ast.Statment.Hook;

import ast.CodeGeneartion;
import ast.Statment.Statment;
import ast.Statment.Variable.Variable;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.Random;

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
        // put random name for function
        String functionName = "UseEffect_callback_Function_" + (new Random()).nextInt(1000) ;
        String js = "function " + functionName + "()" + "{ \n" ;
        for(int i= 0 ;i < statmentsList.size();i++){
            if(statmentsList.get(i).generate().b != null )
            js += statmentsList.get(i).generate().b;
        }
        js += "}\n" ;
        js = "window.onload = () => { \n" ;
        js += functionName + "(); \n" ;
        js += "}\n" ;
        js += "const " + "Proxy_"+ functionName + "= " + "new Proxy(" + ", {" + "\n" ;
        js+= "set: function ( target , key , value ) { \n";
        js += "let dependcy = [ " + dependencyList.toString() + " ];\n";
        js += "if ( " ;
        for(int i = 0 ;i < dependencyList.size();i++){
            js+= "states.includes(" + dependencyList.get(i).varName + ") || \n ";
        }
        js += ") {\n " ;
        js += "target[key] = value; \n";
        js += functionName + "(); \n" ;
        js += "}\n" ;
        js += "}\n";
        return new Pair<>(html,js);
    }

}
