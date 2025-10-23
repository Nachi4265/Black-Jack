package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Player 1 what is your name: ");
//        String player1Name = scanner.next();
//
//        System.out.print("Player 2 what is your name: ");
//        String player2Name = scanner.next();
//
//        System.out.println("Welcome "+ player1Name + " and " + player2Name);
//        System.out.println("I will now deal you both 2 cards");

        //created deck
        Deck MorgDeck = new Deck();

        //deal 1 card from deck
        MorgDeck.deal();
        System.out.println(MorgDeck.getSize());

        Card card1 = MorgDeck.deal();
        card1.flip();
        System.out.println(card1.getValue() + " of " + card1.getSuit());

        Card card2 = MorgDeck.deal();
        card2.flip();
        System.out.println(card2.getValue() + " of " + card2.getSuit());

        MorgDeck.shuffle();

        Card card3 = MorgDeck.deal();
        card3.flip();
        System.out.println(card3.getValue() + " of " + card3.getSuit());

    }
}