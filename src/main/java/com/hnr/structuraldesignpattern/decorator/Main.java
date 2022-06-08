/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.structuraldesignpattern.decorator;

/**
 *
 * @author hanifnr
 */
public class Main {

    public static void main(String[] args) {
        BasePaket hanif = new KentangDecorator(
                new MinumanDecorator(
                        new Paket1(),
                        MinumanDecorator.Minuman.Soda
                )
        );
        hanif.printTotal();
    }

}
