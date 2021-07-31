/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Container {
    private int curr;
    private int capacity;
    
    public Container() {
        this.curr = 0;
        this.capacity = 100;
    }
    
    public int contains() {
        return this.curr;
    }
    
    public void add(int amount) {
        if (amount >= 0) {
            this.curr = Math.min(this.curr + amount, this.capacity);
        }
    }
    
    public void remove(int amount) {
        if (amount >= 0) {
            this.curr = Math.max(0, this.curr - amount);
        }
    }
    
    @Override 
    public String toString() {
        return this.curr + "/" + this.capacity;
    }
}
