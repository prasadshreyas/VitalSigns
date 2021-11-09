/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shreyasprasad
 */
public class PatientDirectory {
    
private ArrayList<Patient> patientList;

    public PatientDirectory() {
    
    this.patientList = new ArrayList<>();
    
    
    Patient p1 = new Patient(17, 123456789, "Mike", "A", 1 );
    Patient p2 = new Patient(27, 123456789, "Sam", "B", 2 );
    Patient p3 = new Patient(71, 123456789, "Lucy", "A", 3 );
    Patient p4 = new Patient(34, 123456789, "Helen", "A", 4 );
    Patient p5 = new Patient(56, 123456789, "Carey", "B", 5 );
    Patient p6 = new Patient(67, 123456789, "George", "B", 6 );
    Patient p7 = new Patient(13, 123456789, "Jack", "A", 7 );
    Patient p8 = new Patient(52, 123456789, "Selena", "B", 8 );
    Patient p9 = new Patient(87, 123456789, "Mark", "B", 9 );
    Patient p10 = new Patient(47, 123456789, "Mason", "A", 10 );
    
    patientList.add(p1);
    patientList.add(p2);
    patientList.add(p3);
    patientList.add(p4);
    patientList.add(p5);
    patientList.add(p6);
    patientList.add(p7);
    patientList.add(p8);
    patientList.add(p9);
    patientList.add(p10);
  
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient addPatient(){
    
    Patient p = new Patient();
    patientList.add(p);
    return p;
        
    }
    
    public void addP(Patient p ){
        patientList.add(p);
    }
 
        public void deletePatient (Patient p )
    {
        patientList.remove(p);
    }
    
    
   
 



 
    
    
}
