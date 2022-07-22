// 01. Write a program to check if inputted letter is small or capital.

package java_basic;

import java.util.Scanner;

public class LetterSmallCapital {
    public static void main(String args[]) {
        char ch;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Letter to find case ");
        ch = input.next().charAt(0);

        if (ch >= 65 && ch <= 90) {
            System.out.println(ch + " is a Capital case letter ");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println(ch + " is a small case letter ");
        } else {
            System.out.println(ch + " is not a Letter ");
        }
    }
}


