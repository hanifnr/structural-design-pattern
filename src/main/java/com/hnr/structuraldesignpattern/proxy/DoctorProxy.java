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
public class DoctorProxy implements IDoctor {

    Doctor doctor = new Doctor();

    @Override
    public void doVaccination(Participant participant) {
        if (verifyParticipant(participant)) {
            doctor.doVaccination(participant);
        }
    }

    public boolean verifyParticipant(Participant participant) {
        if (participant.getAge() < 5) {
            System.out.println("Participant age has to be more than 5 years old!");
        } else if (participant.isVaccinated()) {
            System.out.println("This participant has already vaccinated!");
        } else {
            return true;
        }
        return false;
    }

}
