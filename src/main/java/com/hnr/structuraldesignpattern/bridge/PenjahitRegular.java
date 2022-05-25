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
public class PenjahitRegular implements IPenjahit {

    IPakaian pakaian;

    PenjahitRegular() {
    }

    public PenjahitRegular(IPakaian pakaian) {
        this.pakaian = pakaian;
    }

    public void setPakaian(IPakaian pakaian) {
        this.pakaian = pakaian;
    }

    @Override
    public void pilihBahan(Pakaian.Bahan bahan) {
        if (bahan == Pakaian.Bahan.Sutra) {
            System.out.println("Pesanan ditolak");
            return;
        }
        pakaian.setBahan(bahan);
    }

    @Override
    public void pilihWarna(String warna) {
        pakaian.setWarna(warna);
    }

    @Override
    public void pilihUkuran(Pakaian.Ukuran ukuran) {
        pakaian.setUkuran(ukuran);
    }

}
