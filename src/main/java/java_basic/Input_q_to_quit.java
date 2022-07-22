//  09. Write a program to sum of user input until users input ‘q’ from keyboard

package java_basic;

import java.util.Scanner;

public class Input_q_to_quit {

    public static void main(String[] args) {

        int i = 0;
        char choice = ' ';
        double num;
        double sum = 0;

        Scanner input = new Scanner(System.in);

        try {
            for (i = 1; i >= 1; i++) {
                System.out.println("Plz. Input a number:" + " ");

                num = input.nextDouble();
                sum = sum + num;
                i++;

                System.out.println("Do you want to exit? press q or continue press c");
                choice = input.next().charAt(0);
                if (choice == 'q') {
                    break;
                } else if (choice == 'c') {
                    continue;
                }

                input.close();
            }

        } catch (Exception e) {
            System.out.println("Please enter a valid number ");
        }

        System.out.println("Sum of user's input is : " + " " + sum);

    }
}