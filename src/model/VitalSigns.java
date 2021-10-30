/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author shreyasprasad
 */
public class VitalSigns {

    /**
     * @param args the command line arguments
     */

    
    private int bp,  pulse, res_rate;
    private double temp;
    
   public VitalSigns()
    {
        
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getRes_rate() {
        return res_rate;
    }

    public void setRes_rate(int res_rate) {
        this.res_rate = res_rate;
    }
    
    
}
