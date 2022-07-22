// 03.Input 2 decimal numbers and check if they are both same or different up to two decimal places .

package java_basic;

import java.util.Scanner;

public class CompareDecimalPlaces {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Input First number: ");
            float num1 = input.nextFloat();
            System.out.print("Input Second number: ");
            float num2 = input.nextFloat();
            input.close();

            if (Math.abs(num1 - num2) <= 0.01) {
                System.out.println("These numbers are same .");
            } else {
                System.out.println("These numbers are different up to two decimal places.");
            }
        } catch (Exception e) {
            System.out.println("Enter valid number");
        }
    }
}