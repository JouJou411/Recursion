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
public class Recursion
{

    public void recursion1(int[] arreglo, int i)
    {
        if (i >= 0)
        {
            recursion2(arreglo, arreglo.length - 1);
            recursion1(arreglo, i - 1);
        }
    }

    public void recursion2(int[] arreglo, int i)
    {
        if (i > 0)
        {
            int elementoActual = arreglo[i - 1],
                    elementoSiguiente = arreglo[i];
            if (elementoActual > elementoSiguiente)
            {
                arreglo[i - 1] = elementoSiguiente;
                arreglo[i] = elementoActual;
            }
            recursion2(arreglo, i - 1);
        }
    }

    public void mostrar(int[] arreglo, int i)
    {
        if (i >= 0)
        {
            mostrar(arreglo, i - 1);
            System.out.println(arreglo[i]);
        }
    }

    public int factorial(int n)
    {
        int f = 1;
        for (int i = 2; i <= n; i++)
        {
            f *= i;
        }
        return f;
    }

    public int factorialRecur(int n, int f, int i)
    {
        if (i <= n)
        {
            f = i * factorialRecur(n, f, i + 1);
        }
        return f;
    }

    public double promedio(int[] arr)
    {
        double prom = 0;
        for (int i = 0; i < arr.length; i++)
        {
            prom += arr[i];
        }
        double resultado = prom / arr.length;
        return resultado;
    }

    public double promedioRecur(int[] arr, double prom, int i)
    {
        if (i >= 0)
        {
            prom += arr[i];
            return promedioRecur(arr, prom, i - 1);
        }  else {
            return prom += arr[i];
        }
    }
}
