/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.structuraldesignpattern.composite;

/**
 *
 * @author hanifnr
 */
public class Mitra extends MLM {

    public Mitra(String name) {
        super(name);
    }

    @Override
    public int countMitra() {
        return 1;
    }

    @Override
    public void info() {
        super.info(); //To change body of generated methods, choose Tools | Templates.
    }

}
