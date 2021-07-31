/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Person implements Saveable{
    private String name;
    private String address;
    
    public Person() {
        this.name = "human";
        this.address = "starting";
    }
    
    public void delete(){}
    
    public void save(){}
    
    public void load(String address){
        this.address = address;
    }
}
