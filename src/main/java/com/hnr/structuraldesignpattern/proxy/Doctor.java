/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.structuraldesignpattern.proxy;

/**
 *
 * @author hanifnr
 */
public class Doctor implements IDoctor {

    public Doctor() {
    }

    @Override
    public void doVaccination(Participant participant) {
        participant.setVaccinated(true);
        participant.info();
    }

}
