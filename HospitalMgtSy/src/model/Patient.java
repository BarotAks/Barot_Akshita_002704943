/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author akshitabarot
 */
public class Patient extends Person{
    
    private String patientID;
    private double heightIncm;
    private double weightInkg;
    private EncounterHistory patientEncounterHistory;
    private String allergies;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public double getHeightIncm() {
        return heightIncm;
    }

    public void setHeightIncm(double heightIncm) {
        this.heightIncm = heightIncm;
    }

    public double getWeightInkg() {
        return weightInkg;
    }

    public void setWeightInkg(double weightInkg) {
        this.weightInkg = weightInkg;
    }

    public EncounterHistory getPatientEncounterHistory() {
        return patientEncounterHistory;
    }

    public void setPatientEncounterHistory(EncounterHistory patientEncounterHistory) {
        this.patientEncounterHistory = patientEncounterHistory;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    
 
    
}
