//04. Write a program to check balance and withdraw money from ATM booth using if else or switch case

package java_basic;

import java.util.Scanner;

public class MoneyCollection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Plz. Press 1 to check your balance");
        int CheckBalance = input.nextInt();
        int deposite = 5000;
        if (CheckBalance == 1) {
            CheckBalance = deposite;
            System.out.println("Balance is : " + CheckBalance + "tk");
        }

        System.out.println("Plz. Press 2 to input your withdrawl amount");
        int num = input.nextInt();

        System.out.println("Enter ur amount to withdraw");

        int WithdrawMoney = input.nextInt();
        int restamount = deposite - WithdrawMoney;

        if (WithdrawMoney <= deposite) {
            WithdrawMoney = WithdrawMoney;

            System.out.println("Your Withdraw Amount is " + WithdrawMoney + "tk");
            System.out.println("your current balance is : " + restamount + "tk");
            System.out.println("Processing > please collect your Money");
            System.out.println("Thank You!");

        } else {
            System.out.println("Sorry : Insufficient Balance");
        }
    }
}

