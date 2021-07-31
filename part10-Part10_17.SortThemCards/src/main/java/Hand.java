/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand (){
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        this.cards.stream()
                .forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(this.cards);
    }
    
    @Override
    public int compareTo(Hand compared) {
        int thisVal = this.cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        
        int otherVal = compared.cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        
        return thisVal - otherVal;
    }
    
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
}
