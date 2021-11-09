/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shreyasprasad
 */
public class Community extends City{
    
    public String comm_name;

    public int getCounter() {
        return counter;
    }

    public Community(String comm_name, int counter) {
        this.comm_name = comm_name;
        this.counter = counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    public int counter;

    public String getComm_name() {
        return comm_name;
    }

    public void setComm_name(String comm_name) {
        this.comm_name = comm_name;
    }
    
}
