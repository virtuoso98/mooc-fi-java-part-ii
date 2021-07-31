/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CD implements Packable{
    private String author;
    private String name;
    private int year;
    private double weight;
    
    public CD(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.weight = 0.1;
    }
    
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.author + ": " + this.name + " (" + this.year + ")";
    }
}
