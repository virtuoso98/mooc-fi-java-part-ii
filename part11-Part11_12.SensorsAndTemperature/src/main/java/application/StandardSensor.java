package application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class StandardSensor implements Sensor{
    private int temp;
    
    public StandardSensor(int temp) {
        this.temp = temp;
    }
    
    public void setOn(){}
    public void setOff(){}
    
    public boolean isOn() {
        return true;
    }
    
    public int read() {
        return this.temp;
    }
}
