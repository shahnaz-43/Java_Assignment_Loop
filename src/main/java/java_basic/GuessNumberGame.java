
package java_basic;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {

        try {
            int count = 0;
            int guess, i;
            int k = 10;
            Random num1 = new Random();
            int rnd1 = num1.nextInt(50);
            Random num2 = new Random();
            int rnd2 = num2.nextInt(40);

            Scanner sc = new Scanner(System.in);
            System.out.println("Please guess a number between 0 to 50 within 10 trials!");

            for (i = 0; i < k; i++) {

                System.out.println("Input Your number");
                guess = sc.nextInt();

                if (guess == rnd1 || guess == rnd2) {
                    count = count + 1;
                    System.out.println("you get one point");

                    System.out.println("Congratulations! You Guessed the number correct ");
                } else if (guess < rnd1 || guess < rnd2
                        && i != k - 1) {
                    System.out.println("The number is smaller than guess");
                } else {
                    System.out.println("The number is higher than guess");
                }
            }
            if (i == k) {
                System.out.println("Sorry! You are out of trials");

            } else {
                System.out.println("Enter a valid integer number");
            }
            System.out.println("You get" + " " + count + " " + "points");
        }
        catch (Exception e) {
            System.out.println("Enter valid numbers");
        }
    }
}

