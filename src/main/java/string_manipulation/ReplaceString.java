/*6. Replace "R" from Rahim with "F" from the given String:
Input: Ratul and Rahim lives in Rangpur
Output: Ratul and Fahim lives in Rangpur*/

package string_manipulation;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        System.out.println("Input your String Fahim to replace Rahim ");

        String str = "Ratul and Rahim lives in Rangpur";

        Scanner input = new Scanner(System.in);

        String replace = input.nextLine();

        String change = str.replace("Rahim", "Fahim");
        System.out.println(change);

    }
}
