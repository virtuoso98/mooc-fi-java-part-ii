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
public class TodoList {
    private final ArrayList<String> todos;
    
    public TodoList() {
        this.todos = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todos.add(task);
    }
    
    public void print() {
        for (int i = 1; i <= this.todos.size(); i++) {
            String task = this.todos.get(i - 1);
            System.out.println(i + ": " + task);
        }
    }
    
    public void remove(int number) {
        if (1 <= number && number <= this.todos.size()) {
            this.todos.remove(number - 1);
        }
    }
}
