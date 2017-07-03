
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author papa
 */
public class ModelInpr {
    String engineStr;
    ScriptEngine engine=null;

    public ModelInpr(String engine) {
        this.engineStr = engine;
         this.engine = 
                new ScriptEngineManager().getEngineByName(engineStr);
         
    }
    public  String work(String expr)
    {
        String ud=System.getProperty("user.dir");
        try
        {
            
            //engine.eval(new FileReader("d:/program.js"));
            
           
               
                    if(expr.matches("#include [a-z]+")){
                        String [] ar=expr.split("(\\s)+");
                        //String p=ud+"/"+ar[1]+".js";
                        //System.out.println(ar[1]);
                       
                  }
                    //System.out.println(s);
                    if(!expr.matches("#include [a-z]+")){
                        //System.out.print(this.engine.eval(expr));
                       return String.valueOf(this.engine.eval(expr));
                                             
                    }
                
                        
                        
                  
                
          
            
        }
        
        
        catch(Exception Ex)
        {
            Ex.printStackTrace();
            //return "Scripting error";
            return Ex.toString();
            
        }
        return null;
       
    }
}
