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
public class Warehouse {
    private Map<String, Integer> stockMap;
    private Map<String, Integer> priceMap;
    
    public Warehouse() {
        this.priceMap = new HashMap<>();
        this.stockMap = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.stockMap.put(product, this.stockMap.getOrDefault(product, 0) + stock);
        this.priceMap.put(product, price);
    }
    
    public int price(String product) {
        return this.priceMap.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.stockMap.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (!this.stockMap.containsKey(product)) {
            return false;
        }
        int qty = this.stockMap.get(product);
        if (qty == 0) 
        {
            return false;
        } 
        else 
        {
            this.stockMap.put(product, qty - 1);
            return true;
        }
    }
    
    public Set<String> products() {
        return this.priceMap.keySet();
    }
}
