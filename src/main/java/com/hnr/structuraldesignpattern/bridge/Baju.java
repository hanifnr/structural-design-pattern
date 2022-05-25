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
public class Baju extends Pakaian implements IPakaian {

    int lebar, tinggi;

    @Override
    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void setBahan(Bahan bahan) {
        this.bahan = bahan;
    }

    @Override
    public void setUkuran(Ukuran ukuran) {
        if (null != ukuran) {
            switch (ukuran) {
                case S:
                    lebar = 46;
                    tinggi = 65;
                    break;
                case M:
                    lebar = 48;
                    tinggi = 67;
                    break;
                case L:
                    lebar = 50;
                    tinggi = 69;
                    break;
                case XL:
                    lebar = 52;
                    tinggi = 71;
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void info() {
        if (bahan != null && warna != null) {
            System.out.println(String.format("-----BAJU-----\nLebar: %s\nTinggi: %s", lebar, tinggi));
            super.info(); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
