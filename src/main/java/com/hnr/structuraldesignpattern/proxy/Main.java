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
public class Main {

    public static void main(String[] args) {
        Participant hanif = new Participant("Hanif", 26, Participant.GENDER.M);
        IDoctor doctor = new DoctorProxy();
        doctor.doVaccination(hanif);
        doctor.doVaccination(hanif);
    }

}
