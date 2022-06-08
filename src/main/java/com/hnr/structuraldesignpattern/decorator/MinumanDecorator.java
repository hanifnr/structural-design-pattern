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
public class MinumanDecorator extends BasePaket {

    enum Minuman {
        AirPutih, Soda
    }
    BasePaket paket;
    Minuman minuman;

    public MinumanDecorator(BasePaket paket, Minuman minuman) {
        this.paket = paket;
        this.minuman = minuman;
        calcPrice();
        info();
    }

    @Override
    public void calcPrice() {
        switch (minuman) {
            case AirPutih ->
                price = paket.price.add(new BigDecimal(5000));
            case Soda ->
                price = paket.price.add(new BigDecimal(10000));
        }
    }

    @Override
    public void info() {
        System.out.println(String.format("+ Minuman %s", minuman));
    }

}
