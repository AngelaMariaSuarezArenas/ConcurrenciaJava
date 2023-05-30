/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conhilos;

import static conhilos.Operacion.TAMANIO;
import sinhilos.*;

/**
 *
 * @author Angela
 */
public class Operacion implements Runnable {

    static final int TAMANIO = 90000000;

    int[] A = new int[TAMANIO];// productos
    int[] B = new int[TAMANIO];// pedidos
    int[] C = new int[TAMANIO];// a comprar para stock

    int[] vals = {7, 2, 3, 5, 4, 6, 1, 9, 8, 10};

    public void llenarAyB() {
        for (int i = 0; i < TAMANIO; i++) {
            int val = (int) Math.floor(Math.random() * 10);
            A[i] = vals[val];
            System.out.println("insert A: " + A[i]);
            val = (int) Math.floor(Math.random() * 10);
            B[i] = vals[val];
            System.out.println("insert B: " + B[i]);
        }
    }

    public void llenarC() {
        for (int i = 0; i < TAMANIO; i++) {
            int val = (int) Math.floor(Math.random() * 10);
            C[i] = vals[val];
            System.out.println("insert C: " + C[i]);
            
        }
    
        for (int i = 0; i < TAMANIO; i++) {
            if (A[i] == B[i]) {
                C[i] = A[i];
            } else if (B[i] > A[i]) {
                C[i] = 2 * (B[i] - A[i]);
            } else if (B[i] < A[i]) {
                C[i] = B[i];
            }
        }
}

    public void calcularMayorPedidos(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < TAMANIO; i++) {
            System.out.println(C[i]);
            if(C[i] > max) {
                max = C[i];
            }
        }
        System.out.println(max);
    }


    @Override
    public void run() {

    }

}

