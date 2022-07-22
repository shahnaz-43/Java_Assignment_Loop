/*4. Writea program that will give following output:
Input: chattogram
Output: C8M*/

package string_manipulation;

import java.util.Scanner;

public class LetterNsum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input your word");
        String str = input.nextLine();

        String first = String.valueOf(str.charAt(0));
        String last = String.valueOf(str.charAt(str.length() - 1));

        int count = str.length() - 2;
        String firstup = first.toUpperCase();
        String lastup = last.toUpperCase();

        System.out.println(firstup + count + lastup);

    }

}
