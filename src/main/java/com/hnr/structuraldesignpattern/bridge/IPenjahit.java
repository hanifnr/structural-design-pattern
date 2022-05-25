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
public interface IPenjahit {

    void pilihBahan(Pakaian.Bahan bahan);

    void pilihWarna(String warna);

    void pilihUkuran(Pakaian.Ukuran ukuran);

}
