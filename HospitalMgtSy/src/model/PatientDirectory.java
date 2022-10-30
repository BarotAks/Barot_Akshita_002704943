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
public class PatientDirectory {
    
    private ArrayList<PatientData> PatDirectory;
    
    public PatientDirectory(){
        this.PatDirectory = new ArrayList<PatientData>();
        
    }
    
    public ArrayList<PatientData> getPatDirectory(){
        return PatDirectory;
    }
    
    public void setPatientDirectory(ArrayList<PatientData> PatientDirectory){
        this.PatDirectory = PatientDirectory;
    }
    
    public PatientData addNewpatData(){
        PatientData newdata1 = new PatientData();
        PatDirectory.add(newdata1);
        return newdata1;
        
    }
    
    public void detelePat(PatientData pd){
        PatDirectory.remove(pd);
    }
}
