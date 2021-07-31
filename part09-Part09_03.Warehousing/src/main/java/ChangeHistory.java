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
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return this.history + "";
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        Double ans = Double.MIN_VALUE;
        for (double val : this.history) {
            ans = Math.max(ans, val);
        }
        return ans;
    }
    
    public double minValue(){
        if (this.history.isEmpty()) {
            return 0.0;
        }
        Double ans = Double.MAX_VALUE;
        for (double val : this.history) {
            ans = Math.min(ans, val);
        }
        return ans;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double acc = 0.0;
        for (double val : this.history) {
            acc += val;
        }
        return acc / this.history.size();
    }
}
