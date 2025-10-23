package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card>cards = new ArrayList<>();

    public Deck(){
        String[]suits = {"Heart","Diamond","Club","Spade"};
        String[]values = {"2","3","4","5","6","7","8","9","10","J","K","Q","A"};

        for(String suit: suits){
            for(String value:values){
                Card card = new Card(suit,value);
                cards.add(card);
            }
        }
    }


    public void shuffle(){
        Collections.shuffle(cards);
    }



    public Card deal(){
        if(cards.size()>0){
            return cards.remove(0);
        }else {
            return null;
        }
    }

    public int getSize(){
        return cards.size();
    }


    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }


}
