/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Book {
    
    
    private String name;
    private int age;

    public Book(String name, int ageRec) {
        this.name = name;
        this.age = ageRec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    
    public String toString(){   
        return this.name + " (recommended for " + this.getAge() +" year-olds or older)";
    } 
}
