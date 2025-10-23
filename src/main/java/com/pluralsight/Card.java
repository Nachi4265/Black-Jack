package com.pluralsight;

public class Card {

    private String suit;
    private String value;
    private boolean isFaceUp;

    //CONSTRUCTOR
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    //getters
    public String getSuit(){
        if(isFaceUp){
            return suit;
        }else {
            return "#";
        }
    }

    public String getValue(){
        if(isFaceUp){
            //return the value of the card A,K,Q,J,10
            return value;
        }else{
            return "#";
        }
    }


    public int getPointValue(){
        if(isFaceUp){
            switch(value){
                case "2":
                    return 2;

                case "3":
                    return 3;

                case "4":
                    return 4;

                case "5":
                    return 5;

                case "6":
                    return 6;

                case "7":
                    return 7;

                case "8":
                    return 8;

                case "9":
                    return 9;

                case "10":
                    return 10;

                case "J","K","Q":
                    return 10;

                case "A":
                    return 11;
            }
        }return 0;
    }


    //You can see the cards suit and value
    public boolean isFaceUp(){
        return isFaceUp;
    }



    //Method
    //Flips the card upside down (no longer face up)
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}
