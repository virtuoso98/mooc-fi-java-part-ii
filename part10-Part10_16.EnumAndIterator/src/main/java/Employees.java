/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class Employees {
    private ArrayList<Person> people;
    
    public Employees(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
            .forEach(person -> this.people.add(person));
    }
    
    public void print() {
        Iterator<Person> iterator = this.people.iterator();
        while (iterator.hasNext()){
            Person nextPerson = iterator.next();
            System.out.println(nextPerson);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        while (iterator.hasNext()){
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        while (iterator.hasNext()){
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
