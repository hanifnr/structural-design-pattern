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
public class AdvanceMediaPlayer {

    Mp4 mp4;

    public AdvanceMediaPlayer(Mp4 mp4) {
        this.mp4 = mp4;
    }

    public void play() {
        System.out.println(String.format("Sedang memutar film... \nJudul: %s\nPublisher: %s\nDurasi: %s", mp4.judul, mp4.publisher, mp4.durasi));
    }

}
