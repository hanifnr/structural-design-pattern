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
public class Calculator {

    int num1, num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        Addition addition = new Addition(num1, num2);
        addition.calc();
    }

    public void substract() {
        Substraction substraction = new Substraction(num1, num2);
        substraction.calc();
    }

    public void divide() {
        Division division = new Division(num1, num2);
        division.calc();
    }

    public void multiply() {
        Multiplication multiply = new Multiplication(num1, num2);
        multiply.calc();
    }

}
