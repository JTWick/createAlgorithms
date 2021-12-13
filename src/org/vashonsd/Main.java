package org.vashonsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userWins = 0;
        boolean playAgain = true;

        while(playAgain) {
            int theNumber = (int)(Math.random() * 100.0D + 1.0D);
            Scanner scan = new Scanner(System.in);
            int userGuess = -1;
            while(userGuess != theNumber) {
                System.out.println("Guess a number from 1 to 100:");
                userGuess = scan.nextInt();
                if (userGuess > theNumber) {
                    System.out.println("The number is too big!");
                } else if (userGuess < theNumber) {
                    System.out.println("The number is too small!");
                }
            }

            System.out.println("Congratulations, you got it!");
            ++userWins;
            System.out.println("Number of wins: " + userWins);
            System.out.println("Type yes if you want to play again, type no if not");
            Scanner answer = new Scanner(System.in);
            String answ = answer.next();
            answer.nextLine();
            if (answ.trim().toLowerCase().equals("yes")) {
                playAgain = true;
            } else {
                playAgain = false;
            }
        }

    }
    }
