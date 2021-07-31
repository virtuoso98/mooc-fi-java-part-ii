package dictionary;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author user
 */
 

public class SaveableDictionary {
    private Map<String, String> words;
    private String file;
    
    public SaveableDictionary() {
        this.words = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    
    public boolean load() {
        try 
        {
            Files.lines(Paths.get(this.file))
                    .map(l -> l.split(":"))
                    .forEach(parts -> {
                        this.words.put(parts[0], parts[1]);
                        this.words.put(parts[1], parts[0]);
                    });
            return true;
        } 
        catch (IOException ex) 
        {
            return false;
        }
    }
    
    public boolean save() {
        try 
        {
            PrintWriter writer = new PrintWriter(new File(file));
            saveWords(writer);
            writer.close();
        } 
        catch (Exception e) 
        {
            return false;
        }
        return true;
    }

 

    public void add(String word, String translation) {
        if (words.containsKey(word)) {
            return;
        }
        words.put(word, translation);
        words.put(translation, word);
    }

 

    public String translate(String word) {
        return words.get(word);
    }

 

    public void delete(String word) {
        String translation = translate(word);
        words.remove(word);
        words.remove(translation);
    }

 

    private void saveWords(PrintWriter writer) throws IOException {
        List<String> alreadySaved = new ArrayList<>();
        words.keySet().stream().forEach(word -> {
            if (alreadySaved.contains(word)) {
                return;
            }
            String pari = word + ":" + words.get(word);
            writer.println(pari);
            
            alreadySaved.add(word);
            alreadySaved.add(words.get(word));
        });
    }
}
