package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Create new instance of the Random class
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        //get random number
        int num = rand.nextInt(10)+1;

        System.out.println("I have choosen a number between 1 and 10. try to guess it. ");
        System.out.println("Enter number: ");
        int guess = keyboard.nextInt();

        while (guess != num){
            System.out.println("that is incorrect. Guess again");
            guess =  keyboard.nextInt();




        }

    }
}
