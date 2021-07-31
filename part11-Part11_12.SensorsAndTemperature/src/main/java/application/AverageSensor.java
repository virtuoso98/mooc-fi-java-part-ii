package application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> temps;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.temps = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()){
                return false;
            } 
        }
        return true;
    }
    
    @Override
    public void setOn(){
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }
    
    @Override
    public void setOff(){
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }
    
    @Override
    public int read(){
        if (this.isOn() && !this.sensors.isEmpty())
        {
            int sum = 0;
            for (Sensor sensor : this.sensors) {
                sum += sensor.read();
            }
            this.temps.add(sum / this.sensors.size());
            return sum / this.sensors.size();
        }
        else
        {
            throw new IllegalStateException("No exception or Sensors off");
        }
    }
    
    public List<Integer> readings(){
        return this.temps;
    }
}
