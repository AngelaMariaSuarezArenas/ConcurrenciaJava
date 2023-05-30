/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conhilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Angela
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double inicio = System.currentTimeMillis();
        
        Runnable op1 = new Operacion();
        Runnable op2 = new Operacion();
        
        
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(op1);
        ex.execute(op2);
        
        ex.shutdown();
        
        while(!ex.isTerminated()){
            
        }
        
        double fin = System.currentTimeMillis();
        
        System.out.println("total: "+ (fin - inicio)/1000);
    }
    
}
