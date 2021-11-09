/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shreyasprasad
 */
public class Patient extends Person {
    
    EncounterHistory encounterHistory;
    
    public Patient(int age, int phone, String name, String community, int id) {
        super(age, phone, name, community, id);
        
        this.encounterHistory = new EncounterHistory();
        
    }

    public Patient() {
        super(0, 0, null, null, 0);
        this.encounterHistory = new EncounterHistory();
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }


    

}
