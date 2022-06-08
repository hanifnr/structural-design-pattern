/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.structuraldesignpattern.decorator;

import java.math.BigDecimal;

/**
 *
 * @author hanifnr
 */
public class Paket1 extends BasePaket {

    public Paket1() {
        info();
        calcPrice();
    }

    @Override
    public void info() {
        System.out.println("Nasi + Ayam dada");
    }

    @Override
    public void calcPrice() {
        price = price.add(new BigDecimal(20000));
    }

}
