//6. Write  a program to find the factorial of a given number

package java_basic;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNumbers {

    public static void main(String args[]) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number: ");

            int i;
            int num = sc.nextInt();

            BigInteger fact = BigInteger.valueOf(1);

            for (i = 1; i <= num; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Factorial of" + " " + num + " " + "is : " + fact);

        } catch (Exception e) {
            System.out.println("Plz. Enter only number");
        }

    }
}
