/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author shreyasprasad
 */
public class EncounterHistory {

    

private ArrayList<Encounter> encounterList ;

    public EncounterHistory() {
        
        this.encounterList = new ArrayList<>();
        
        Encounter encounter = new Encounter();
        
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
//        Date date = new Date();
//        
//        encounter = new Encounter();
//        encounter.setSbp(0);
//        encounter.setDbp(0);
//        encounter.setRes_rate(0);
//        encounter.setPulse(0);
//        encounter.setTemp(0);
//        encounter.setDate(formatter.format(date));
//        
//        
//        encounterList.add(encounter);
        
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    
//    public Patient addPatient(){
//    
//    Patient p = new Patient();
//    patientList.add(p);
//    return p;
//        
//    }
    
    
    public Encounter addEncounter(){
        Encounter encounter = new Encounter();
        encounterList.add(encounter);
        return encounter;
    }

    
  






    
}
