/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author akshitabarot
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> DoctorDirectory;
    
    public DoctorDirectory(){
        this.DoctorDirectory = new ArrayList<Doctor>();
        
    }
    
    public ArrayList<Doctor> getDoctorDirectory(){
        return DoctorDirectory;
    }
    
    public void setDoctorDirectory(ArrayList<Doctor> DoctorDirectory) {
        this.DoctorDirectory = DoctorDirectory;
        
    }
    
    public Doctor addNewDoctor(){
        Doctor newdata = new Doctor();
        DoctorDirectory.add(newdata);
        return newdata;
    
}
    
}
