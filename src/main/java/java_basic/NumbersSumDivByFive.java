//05. Write a program to sum of numbers which only divisible by 5 from 1 to 100

package java_basic;

public class NumbersSumDivByFive {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {

                sum = sum + i;
                System.out.println("Divided by five number is:" + " " + i);
            }
        }

        System.out.println("Sum of Numbers (divisible by 5 from 1 to 100) is : " + sum);
    }
}