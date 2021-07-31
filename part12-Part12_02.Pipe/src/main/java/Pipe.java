/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Pipe<T> {
    private ArrayList<T> stuff;
    
    public Pipe() {
        this.stuff = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.stuff.add(value);
    }
    
    public T takeFromPipe() {
        if (this.stuff.isEmpty()) {
            return null;
        }
        T output = this.stuff.get(this.stuff.size() - 1);
        this.stuff.remove(this.stuff.size() - 1);
        return output;
    }
    
    public boolean isInPipe() {
        return !this.stuff.isEmpty();
    }
}
