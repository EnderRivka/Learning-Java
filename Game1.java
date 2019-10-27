package com.company;

import java.util.Scanner;
import java.util.Random;
public class Main {
    private static int input(String prompt) {
        System.out.println(prompt);
        Scanner inputStream = new Scanner(System.in);
        return inputStream.nextInt();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int choice = rand.nextInt(50);
        int answer = input("If you guess my number you win! What is your guess?");
        while (choice != answer) {
            if (answer < choice) {
                System.out.println("That is less than my number");
            }
            if (answer > choice) {
                System.out.println("That is greater than my number");
            }
            answer = input("Try again, you got it wrong. What is your new guess?");
        }System.out.println("That is my number");

    }
}
