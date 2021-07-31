/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author user
 */
public class UserInterface {
    private TodoList todos;
    private Scanner scan;
    
    public UserInterface(TodoList todos, Scanner scan) {
        this.scan = scan;
        this.todos = todos;
    }
    
    public void start() {
        boolean isLoop = true;
        while (isLoop) {
            System.out.println("Command: ");
            String cmd = this.scan.nextLine();
            switch (cmd) {
                case "add":
                    System.out.println("To add: ");
                    String toAdd = this.scan.nextLine();
                    this.todos.add(toAdd);
                    break;
                case "list":
                    this.todos.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    Integer idx = Integer.valueOf(this.scan.nextLine());
                    this.todos.remove(idx);
                    break;
                case "stop":
                    isLoop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
