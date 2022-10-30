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
    
    private ArrayList<Doctor> DocDirectory;
    
    public DoctorDirectory(){
        this.DocDirectory = new ArrayList<Doctor>();
        
    }
    
    public ArrayList<Doctor> getDoctorDirectory(){
        return DocDirectory;
    }
    
    public void setDoctorDirectory(ArrayList<Doctor> DoctorDirectory) {
        this.DocDirectory = DoctorDirectory;
        
    }
    
    public Doctor addNewDoctor(){
        Doctor newdata = new Doctor();
        DocDirectory.add(newdata);
        return newdata;
    
    }
    
    public void deleteDoc(Doctor dd){
        DocDirectory.remove(dd);
    }
    
    
}
