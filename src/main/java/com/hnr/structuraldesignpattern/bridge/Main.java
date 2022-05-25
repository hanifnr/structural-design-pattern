package com.hnr.structuraldesignpattern.bridge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hanifnr
 */
public class Main {

    public static void main(String[] args) {
        Baju baju1 = new Baju();
        Baju baju2 = new Baju();
        Celana celana1 = new Celana();
        Celana celana2 = new Celana();

        PenjahitRegular aaron = new PenjahitRegular();
        PenjahitPro gg = new PenjahitPro();

        aaron.setPakaian(baju1);
        aaron.pilihBahan(Pakaian.Bahan.Denim);
        aaron.pilihUkuran(Pakaian.Ukuran.XL);
        aaron.pilihWarna("Merah");
        baju1.info();

        aaron.setPakaian(celana1);
        aaron.pilihBahan(Pakaian.Bahan.Katun);
        aaron.pilihUkuran(Pakaian.Ukuran.M);
        aaron.pilihWarna("Putih");
        celana1.info();

        gg.setPakaian(baju2);
        gg.pilihBahan(Pakaian.Bahan.Sutra);
        gg.pilihUkuran(Pakaian.Ukuran.L);
        gg.pilihWarna("Kuning");
        baju2.info();

        gg.setPakaian(celana2);
        gg.pilihBahan(Pakaian.Bahan.Kulit);
        gg.pilihUkuran(Pakaian.Ukuran.S);
        gg.pilihWarna("Hitam");
        celana2.info();
    }

}
