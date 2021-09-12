/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;


public class Legaldriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age?");
        String usernameString = input.nextLine();

        int age = Integer.parseInt(usernameString);

        if (age < 16){
            System.out.print("You are not old enough to legally drive.");
        }
        else {
            System.out.print("You are old enough to legally drive.");
        }
    }
}
