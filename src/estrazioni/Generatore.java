/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrazioni;

/**
 *
 * @author Laura
 */
public class Generatore {

    public int foundMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int foundMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }

    public int getElement(int index, int[] arr) {
        if (index < 0 || index > arr.length) {
            return 0;
        }
        return arr[index];

    }

    public int foundMedia(int[] arr) {
        int media;
        int somma = 0;
        for (int i = 1; i < arr.length; i++) {
            somma = somma + arr[i];
        }
        media = somma / arr.length;
        return media;
    }

    public int percentuale(int[] arr) {
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                p++;
            }
        }
        return p;
    }

    public void BubbleSort(int[] x) {

        for (int i = 0; i < x.length; i++) {

            for (int j = 0; j < x.length - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int k = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = k;

                }
            }

        }

    }

}
