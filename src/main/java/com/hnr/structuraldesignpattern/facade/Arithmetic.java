/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.structuraldesignpattern.facade;

/**
 *
 * @author hanifnr
 */
public abstract class Arithmetic {

    int result, num1, num2;
    public static final String ADDITION = "penambahan";
    public static final String SUBSTRACTION = "pengurangan";
    public static final String MULTIPLICATION = "perkalian";
    public static final String DIVISION = "pembagian";

    public Arithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract void calc();

    public void printResult(String type) {
        System.out.println(String.format("Hasil %s dari %s dengan %s adalah %s", type, num1, num2, result));
    }

}
