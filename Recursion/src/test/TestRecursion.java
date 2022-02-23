/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Recursion;

/**
 *
 * @author Joabp
 */
public class TestRecursion
{

    public static void main(String[] args)
    {
        Recursion r = new Recursion();
        int arr[] =
        {
            5, 8, 4, 9, 2, 5
        };
//        r.recursion1(arr, arr.length - 1);
//        r.mostrar(arr, arr.length - 1);
//        int x = r.factorial(6);
//        System.out.println("x = " + x);
//        System.out.println("y = " + r.factorialRecur(6, 1, 2));
        System.out.println("Promedio: " + r.promedio(arr));
        System.out.println("Promedio: " + r.promedioRecur(arr, 0, arr.length - 1));
    }
}
