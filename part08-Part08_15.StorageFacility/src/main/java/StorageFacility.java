/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> map;
    
    public StorageFacility() {
        this.map = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.map.putIfAbsent(unit, new ArrayList<>());
        this.map.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (this.map.containsKey(storageUnit)) {
            return this.map.get(storageUnit);
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item){
        if (this.map.containsKey(storageUnit)) {
            if (this.map.get(storageUnit).contains(item)) {
                this.map.get(storageUnit).remove(item);
                if (this.map.get(storageUnit).isEmpty()) {
                    this.map.remove(storageUnit);
                }
            }
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> output = new ArrayList<>();
        for (String unit : this.map.keySet()) {
            if (!(this.map.get(unit).isEmpty())) {
                output.add(unit);
            }
        }
        return output;
    }
}
