package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1 what is your name: ");
        String player1Name = scanner.next();

        System.out.print("Player 2 what is your name: ");
        String player2Name = scanner.next();

        System.out.println("Welcome "+ player1Name + " and " + player2Name);
        System.out.println("I will now deal you both 2 cards");

    }
}