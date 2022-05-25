/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.structuraldesignpattern.bridge;

/**
 *
 * @author hanifnr
 */
public class Pakaian {

    enum Bahan {
        Katun, Denim, Kulit, Sutra
    }

    enum Ukuran {
        S, M, L, XL
    }

    Bahan bahan;
    String warna;

    public void info() {
        System.out.println(String.format("Bahan: %s\nWarna: %s\n", bahan, warna));
    }
}
