/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.structuraldesignpattern.composite;

import java.math.BigDecimal;

/**
 *
 * @author hanifnr
 */
public abstract class MLM {

    MLM manager;
    String name;

    public final BigDecimal cutPercentage = new BigDecimal(0.2);

    public MLM(String name) {
        this.name = name;
    }

    public void setManager(MLM manager) {
        this.manager = manager;
    }

    public abstract int countMitra();

    public void info() {
        if (manager != null) {
            System.out.println(String.format("Manager Mitra %s : %s", name, manager.name));
        }
        System.out.println(String.format("Jumlah mitra %s : %s", name, countMitra()));
    }

}
