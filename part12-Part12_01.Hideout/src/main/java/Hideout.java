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
public class Hideout<T> {
    private ArrayList<T> stuff;
    
    public Hideout() {
        this.stuff = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        this.stuff.add(toHide);
    }
    
    public T takeFromHideout() {
        if (this.stuff.isEmpty()) {
            return null;
        }
        T output = this.stuff.get(0);
        this.stuff.remove(0);
        return output;
    } 
    
    public boolean isInHideout() {
        return !this.stuff.isEmpty();
    }
}
