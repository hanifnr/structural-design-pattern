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
public abstract class BasePaket {

    BigDecimal price = BigDecimal.ZERO;

    public abstract void info();

    public abstract void calcPrice();

    public void printTotal() {
        System.out.println(String.format("Total: %s", price));
    }

}
