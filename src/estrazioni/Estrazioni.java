/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrazioni;

import java.util.Arrays;


public class Estrazioni {
 
    public static void main(String[] args) {

        int[] x = new int[100];
        for (int i = 1; i <= 100; i++) {
            int c = (int) (Math.random() * 100);
            x[c] = c;
            

        }

        Generatore r = new Generatore();
        System.out.println("");
        System.out.println("Il numero massimo è: " + r.foundMax(x));
        System.out.println("Il numero minimo è: " + r.foundMin(x));
        System.out.println("Il valore medio è: " + r.foundMedia(x));
        System.out.println("La percentuale dei pari è: " + r.percentuale(x) + "%");
        System.out.println("La percentuale dei dispari è: " + (100 - r.percentuale(x)) + "%");
        r.BubbleSort(x);
        System.out.println("Oridne crescente: "+Arrays.toString(x));
        }
        
    }


