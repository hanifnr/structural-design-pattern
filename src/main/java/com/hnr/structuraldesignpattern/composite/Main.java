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
public class Main {

    public static void main(String[] args) {
        Manager david = new Manager("David");
        Manager hanif = new Manager("Hanif");
        Mitra dwiky = new Mitra("Dwiky");
        Mitra aaron = new Mitra("Aaron");

        david.addMitra(hanif);
        hanif.addMitra(dwiky);
        hanif.addMitra(aaron);
        david.info();
        hanif.info();
        dwiky.info();
        aaron.info();
    }

}
