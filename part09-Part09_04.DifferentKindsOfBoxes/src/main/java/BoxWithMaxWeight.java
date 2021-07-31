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
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capcity) {
        this.capacity = capcity;
        this.items = new ArrayList<>();
    }
    
    public int currentAmount() {
        int sum = 0;
        for (Item item : this.items) {
            sum += item.getWeight();
        }
        return sum;
    }
    
    @Override
    public void add(Item item) {
        if (this.currentAmount() + item.getWeight() <= this.capacity) {
            this.items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {   
        return this.items.contains(item);
    }
}
