package com.pluralsight;

import java.util.ArrayList;

public class Hand {

    //Collection of Card
    private ArrayList<Card> cards;


    //Your hands are empty to begin with
    public Hand (){
        cards = new ArrayList<>();
    }


    //Deal Method
    //deal one singular from our Arraylist
    // A Card is dealt to the Hand and the Hand is responsible
    // to store the card
    public void Deal(Card card){
        cards.add(card);
    }


    //Checking how many cards are currently in my hand.
    public int getSize(){
        return cards.size();
    }


    //Get the value of our hand
    public int getValue(){

        //start our hand value at 0
        int value = 0;

        //iterate through our cards and adds the value of our card to our hand
        for(Card card:cards){

            card.flip();//flip our card to see value

            value += card.getPointValue(); //gets the value and adds our new card point value to it

            card.flip();//flip card to hide it again.

        }
        return value;
    }
}
