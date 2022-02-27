package domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joabp
 */
public class Recursion {

    private static float prom = 0;

    public void recursion1(int[] arreglo, int i) {
        if (i >= 0) {
            recursion2(arreglo, arreglo.length - 1);
            recursion1(arreglo, i - 1);
        }
    }

    public void recursion2(int[] arreglo, int i) {
        if (i > 0) {
            int elementoActual = arreglo[i - 1],
                    elementoSiguiente = arreglo[i];
            if (elementoActual > elementoSiguiente) {
                arreglo[i - 1] = elementoSiguiente;
                arreglo[i] = elementoActual;
            }
            recursion2(arreglo, i - 1);
        }
    }

    public void mostrar(int[] arreglo, int i) {
        if (i >= 0) {
            mostrar(arreglo, i - 1);
            System.out.println(arreglo[i]);
        }
    }

    public float promedio(float[] arr) {
        float prom = 0;
        for (int i = 0; i < arr.length; i++) {
            prom += arr[i];
        }
        return prom / arr.length;
    }

    public float recurPromedio(float arr[], int i) {
        if (i < arr.length) {
            prom += arr[i];
            recurPromedio(arr, i + 1);
        }
        return prom / arr.length;
    }

}
