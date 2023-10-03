package com.Joel.lek_5_uppgifter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String playerName = scanner.nextLine();
        System.out.println("Player 1 name is: " + playerName);

        System.out.println("Enter a number");
        int givenNumber = scanner.nextInt();
        for (int i = 0; i < givenNumber; i++) {
            System.out.println("looping...");
        }
        do {
            System.out.println("Type 1 to throw. Type stop to exit");
            String svar = scanner.next();

            switch (svar){
                case "stop":
                    return;
                case "1":
                    System.out.println("Throwing");
                    break;
                default:
                    System.out.println("Wrong input");
                    System.out.println("-----------");
            }

        } while (true);
    }
}
