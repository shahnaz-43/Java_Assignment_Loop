/*8. Write a program to convert each 1st char to uppercase from a string
Input: rahim lives in sylhet
Output: Rahim Lives in Sylhet*/

package string_manipulation;

//import java.util.Scanner;

import java.util.Scanner;

public class CharUppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your words");

        String string = input.nextLine();
        String[] words = string.split(" ");


        for (String word : words) {
            char FirstL = word.charAt(0);
            String flup = String.valueOf(FirstL).toUpperCase();
            String rlc = word.substring(1);

            System.out.print(flup + rlc + " ");

        }
    }


}


