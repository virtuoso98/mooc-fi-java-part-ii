/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;

/**
 *
 * @author user
 */
public class Abbreviations {
    private HashMap<String, String> map;
    
    public Abbreviations() {
        this.map = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.map.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.map.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.map.get(abbreviation);
    }
}
