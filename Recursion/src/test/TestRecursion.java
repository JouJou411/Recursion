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
public class TestRecursion {

    public static void main(String[] args) {
        Recursion r = new Recursion();
        int arr[] = {5, 8, 4, 9, 2, 5};
        r.recursion1(arr, arr.length - 1);
        r.mostrar(arr, arr.length - 1);
    }
}
