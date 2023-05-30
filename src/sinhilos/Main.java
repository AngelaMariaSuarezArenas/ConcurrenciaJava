/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhilos;

/**
 *
 * @author Angela
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        Operacion op = new Operacion();
        op.llenarAyB();
        long fin = System.currentTimeMillis();
        double total = fin - inicio;
        System.out.println("Se demoró: " + total/1000);
    }
    
}
