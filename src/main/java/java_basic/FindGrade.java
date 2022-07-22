//02.Write a program to calculate GPA and find grade

package java_basic;

import java.util.Scanner;

public class FindGrade {

    public static void main(String[] args) {

        float Percentage;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the Three Subject's Marks : ");
        System.out.println("Marks of Subject 1 : ");
        int Subject1 = input.nextInt();
        System.out.println("Marks of Subject 2 : ");
        int Subject2 = input.nextInt();
        System.out.println("Marks of Subject 3 : ");
        int Subject3 = input.nextInt();

        float total = Subject1 + Subject2 + Subject3;
        Percentage = (total / 300) * 100;

        System.out.println("Total Marks =  " + total);
        System.out.println("Marks Percentage =  " + Percentage);
        if (Percentage >= 90) {
            System.out.println("\nGrade A");
        } else if (Percentage >= 80) {
            System.out.println("\nGrade B");
        } else if (Percentage >= 70) {
            System.out.println("\nGrade C");
        } else if (Percentage >= 60) {
            System.out.println("\nGrade D");
        } else if (Percentage >= 40) {
            System.out.println("\nGrade E");
        } else {
            System.out.println("\nFail");
        }
    }
}