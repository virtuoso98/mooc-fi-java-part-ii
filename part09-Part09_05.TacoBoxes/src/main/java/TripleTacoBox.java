/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.Math;

/**
 *
 * @author user
 */
public class TripleTacoBox implements TacoBox{
    private int tacos;
    
    public TripleTacoBox() {
        this.tacos = 3;
    }
    
    public void eat() {
        this.tacos = Math.max(this.tacos - 1, 0);
    }
    
    public int tacosRemaining() {
        return this.tacos;
    }
}
