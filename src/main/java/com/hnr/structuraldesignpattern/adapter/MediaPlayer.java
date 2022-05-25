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
public class MediaPlayer {

    Mp3 mp3;

    public MediaPlayer() {
    }

    public MediaPlayer(Mp3 mp3) {
        this.mp3 = mp3;
    }

    public void play() {
        System.out.println(String.format("Sedang memutar lagu... \nJudul: %s\nPenyanyi: %s\nDurasi: %s", mp3.judul, mp3.penyanyi, mp3.durasi));
    }

}
