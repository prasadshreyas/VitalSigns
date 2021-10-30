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
public class EncounterHistory extends Encounter {

private ArrayList<Encounter> encounterList ;
private Patient p;


public EncounterHistory(){
    this.encounterList = new ArrayList<Encounter> ();
}
    
}
