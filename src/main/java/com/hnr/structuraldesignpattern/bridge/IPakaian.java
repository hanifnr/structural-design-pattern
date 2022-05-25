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
public interface IPakaian {

    void setBahan(Pakaian.Bahan bahan);

    void setWarna(String warna);

    void setUkuran(Pakaian.Ukuran ukuran);

}
