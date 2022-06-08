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
public class Substraction extends Arithmetic {

    public Substraction(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public void calc() {
        result = num1 - num2;
        printResult(SUBSTRACTION);
    }

}
