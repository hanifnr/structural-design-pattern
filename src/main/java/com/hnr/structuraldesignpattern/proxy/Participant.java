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
public class Participant {

    enum GENDER {
        M, F
    }

    private String name;
    private int age;
    private GENDER gender;
    private boolean vaccinated = false;

    public Participant(String name, int age, GENDER gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public GENDER getGender() {
        return gender;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void info() {
        System.out.println(String.format("Name:%s\nAge:%s\nGender:%s\nVaccinated:%s\n",
                name,
                age,
                gender == GENDER.M ? "Male" : "Female",
                vaccinated
        ));
    }

}
