/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author user
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> map;
    
    public DictionaryOfManyTranslations() {
        this.map = new HashMap<>();
    }
    public void add(String word, String translation) {
        this.map.putIfAbsent(word, new ArrayList<>());
        this.map.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        if (this.map.containsKey(word)) {
            return this.map.get(word);
        }
        return new ArrayList<>();
    }
    
    public void remove(String word) {
        if (this.map.containsKey(word)) {
            this.map.remove(word);
        }
    }
}
