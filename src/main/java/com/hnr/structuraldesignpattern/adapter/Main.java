/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.structuraldesignpattern.adapter;

/**
 *
 * @author hanifnr
 */
public class Main {

    public static void main(String[] args) {
        Mp3 lagu = new Mp3("Top topan", "Happy Asmara", "3.25");
        Mp4 film = new Mp4("Pengkhianatan G30S/PKI", "Produksi Film Negara", "4.51.66");
        MediaPlayer mp = new MediaPlayer(lagu);
        mp.play();
        System.out.println("=================================");
        mp = new AdvanceMediaPlayerAdapter(new AdvanceMediaPlayer(film));
        mp.play();
    }

}
