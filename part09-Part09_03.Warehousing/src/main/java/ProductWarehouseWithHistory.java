/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history = new ChangeHistory();
    
    public ProductWarehouseWithHistory(
            String productName, 
            double capacity, 
            double initialBalance
    ) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
    }
    
    public String history() {
        return this.history.toString();
    }
    
    public void addToWarehouse(double amount) {
        double result = (double) super.getBalance() + amount;
        this.history.add(result);
        super.addToWarehouse(amount);
    }
    
    public double takeFromWarehouse(double amount) {
        double result = (double) super.getBalance() - amount;
        this.history.add(result);
        return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history.toString());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
