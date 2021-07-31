/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author user
 */
public class Herd implements Movable{
    private ArrayList<Movable> animals;
    
    public Herd() {
        this.animals = new ArrayList<>();
    }
    
    
    public void addToHerd(Movable movable) {
        this.animals.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable animal : this.animals) {
            animal.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        for (Movable animal : this.animals) {
            output += this.animals.toString() + "\n";
        }
        
        return output;
    }
}
