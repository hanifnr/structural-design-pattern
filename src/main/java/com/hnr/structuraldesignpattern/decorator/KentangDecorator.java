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
public class KentangDecorator extends BasePaket {

    BasePaket paket;

    public KentangDecorator(BasePaket paket) {
        this.paket = paket;
        info();
        calcPrice();
    }

    @Override
    public void calcPrice() {
        price = paket.price.add(new BigDecimal(12000));
    }

    @Override
    public void info() {
        System.out.println("+ Kentang ");
    }

}
