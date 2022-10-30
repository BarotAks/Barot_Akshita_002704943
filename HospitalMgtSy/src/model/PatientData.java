/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author akshitabarot
 */
public class PatientData extends Person{
    
    
    private String patientID;
    private double heightIncms;
    private double weightInkgs;
    private Date VisitDate;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public double getHeightIncms() {
        return heightIncms;
    }

    public void setHeightIncms(double heightIncms) {
        this.heightIncms = heightIncms;
    }

    public double getWeightInkgs() {
        return weightInkgs;
    }

    public void setWeightInkgs(double weightInkgs) {
        this.weightInkgs = weightInkgs;
    }

    public Date getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(Date VisitDate) {
        this.VisitDate = VisitDate;
    }

    public String toString(){
        return patientID;
    }
}
