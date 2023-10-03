package com.Joel.lek_5_uppgifter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPlaying = true;

        System.out.println("What is your name?");
        String playerName = scanner.nextLine();
        System.out.println("Player 1 name is: " + playerName);

        System.out.println("Enter a number");
        int givenNumber = scanner.nextInt();
        for (int i = 0; i < givenNumber; i++) {
            System.out.println("looping...");
        }
        do {
            System.out.println("Are you ready?");
            String svar = scanner.nextLine();
            if (svar.equals("stop")){
                break;
            }
        } while (true);
    }
}
