/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Box implements Packable{
    private ArrayList<Packable> items;
    private double capacity;
    
    public Box(double capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }
    
    @Override
    public double weight() {
        double sum = 0.0;
        for (Packable item : this.items) {
            sum += item.weight();
        }
        return sum;
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.capacity) {
            this.items.add(item);
        }
    }
    
    @Override
    public String toString() {
        return "Box: " + this.items.size() + 
                " items" + ", total weight " + 
                this.weight() + " kg";
    }
}
