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
public class HospitalDirectory {
    private ArrayList<Hospital> HospDirectory;
    
    public HospitalDirectory(){
        this.HospDirectory = new ArrayList<Hospital>();
       
    }
    
    public ArrayList<Hospital> getHospitalDirectory(){
        return HospDirectory;
    }
    
    public void setHospitalDirectory(ArrayList<Hospital> HospitalDirectory){
        this.HospDirectory = HospitalDirectory;
    }
    
    public Hospital addNewHospital(){
        Hospital newdata = new Hospital();
        HospDirectory.add(newdata);
        return newdata;
        
    }
    
    public void deleteHosp(Hospital hd){
        HospDirectory.remove(hd);
        }
    
}
