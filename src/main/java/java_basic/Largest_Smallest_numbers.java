//10.Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.

package java_basic;

import java.util.Scanner;

public class Largest_Smallest_numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ur_number;
        char choice;
        int lrgst = Integer.MIN_VALUE;
        int smlst = Integer.MAX_VALUE;

        do {
            System.out.print("Enter the number ");
            ur_number = input.nextInt();

            if (ur_number > lrgst) {
                lrgst = ur_number;
            }

            if (ur_number < smlst) {
                smlst = ur_number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Largest number is : " + lrgst);
        System.out.println("Smallest number is : " + smlst);
    }
}