/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.structuraldesignpattern.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanifnr
 */
public class Manager extends MLM {

    List<MLM> listMitra = new ArrayList<>();
    BigDecimal finalIncome;

    public Manager(String name) {
        super(name);
    }

    public void addMitra(MLM mitra) {
        mitra.setManager(this);
        listMitra.add(mitra);
    }

    public void removeMitra(MLM mitra) {
        listMitra.remove(mitra);
    }

    @Override
    public int countMitra() {
        int result = 1;
        for (MLM data : listMitra) {
            result = result + data.countMitra();
        }
        return result;
    }

}
