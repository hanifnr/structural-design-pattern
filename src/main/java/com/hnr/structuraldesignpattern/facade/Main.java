package com.hnr.structuraldesignpattern.facade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hanifnr
 */
public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator(4, 2);
        calc.add();
        calc.substract();
        calc.divide();
        calc.multiply();
    }

}
