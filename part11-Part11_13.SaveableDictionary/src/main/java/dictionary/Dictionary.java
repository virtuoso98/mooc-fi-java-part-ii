/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class Dictionary {
    private HashMap<String, String> map;
    
    public Dictionary() {
        this.map = new HashMap<>();
    }
    
    public void add(String words, String translation) {
        if (!this.map.containsKey(words)) {
            this.map.put(words, translation);
        }
    }
    
    public String translate(String word) {
        return this.map.getOrDefault(word, null);
    }
    
    public void delete(String word) {
        if (this.map.containsKey(word)) {
            this.map.remove(word);
        }
    }
}
