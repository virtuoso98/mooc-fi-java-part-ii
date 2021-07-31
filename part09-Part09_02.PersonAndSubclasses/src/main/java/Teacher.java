/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Teacher extends Person{
    private int pay;
    
    public Teacher(String name, String address, int pay) {
        super(name, address);
        this.pay = pay;
    }
    
    @Override
    public String toString(){    
        return super.toString() + "\n" + "  salary " + this.pay + " euro/month";
    }
}
