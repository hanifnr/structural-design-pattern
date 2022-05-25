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
public class Celana extends Pakaian implements IPakaian {

    int nomor;

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
                    nomor = 28;
                    break;
                case M:
                    nomor = 30;
                    break;
                case L:
                    nomor = 32;
                    break;
                case XL:
                    nomor = 34;
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void info() {
        if (bahan != null && warna != null) {
            System.out.println(String.format("-----CELANA-----\nUkuran: %s", nomor));
            super.info(); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
