package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1 what is your name: ");
        String player1Name = scanner.next();

        System.out.print("Player 2 what is your name: ");
        String player2Name = scanner.next();
        System.out.println();

        System.out.println("Welcome "+ player1Name + " and " + player2Name);
        System.out.println("I will now deal you both 2 cards");
        System.out.println();


        //created deck
        Deck deckOfJack = new Deck();

        //Shuffling the deck
        deckOfJack.shuffle();

        //Created PLayer Hands
        Hand player1 = new Hand();
        Hand player2  = new Hand();


        for (int I = 0; I < 2; I++){

            Card card = deckOfJack.deal();

            player1.Deal(card);
        }

        for (int I = 0; I < 2; I++){

            Card card = deckOfJack.deal();

            player2.Deal(card);
        }


        int  player1HandValue = player1.getValue();
        int  player2HandValue = player2.getValue();

        if(player1HandValue<player2HandValue){
            System.out.println(player1Name + " is the winner " + player1HandValue);
        }else {
            System.out.println(player2Name + " is the winner " + player2HandValue);
        }



//        System.out.println(player1Name + " your card is " + firstCardPlayer1.getValue() + " of " + firstCardPlayer1.getSuit());
//        System.out.println(player1Name + " your second card is " + firstCardPlayer1.getValue() + " of " + firstCardPlayer1.getSuit());
//        System.out.println(player1Name + " total points = " + player1.getValue());
//        System.out.println();


//        //deal 1 card from deck
//        MorgDeck.deal();
//        System.out.println(MorgDeck.getSize());
//
//        Card card1 = MorgDeck.deal();
//        card1.flip();
//        System.out.println(card1.getValue() + " of " + card1.getSuit());
//
//        Card card2 = MorgDeck.deal();
//        card2.flip();
//        System.out.println(card2.getValue() + " of " + card2.getSuit());
//
//        MorgDeck.shuffle();
//
//        Card card3 = MorgDeck.deal();
//        card3.flip();
//        System.out.println(card3.getValue() + " of " + card3.getSuit());

    }
}