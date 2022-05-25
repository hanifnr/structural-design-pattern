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
public class AdvanceMediaPlayerAdapter extends MediaPlayer {

    AdvanceMediaPlayer amp;

    public AdvanceMediaPlayerAdapter(AdvanceMediaPlayer amp) {
        this.amp = amp;
    }

    @Override
    public void play() {
        amp.play();
    }

}
