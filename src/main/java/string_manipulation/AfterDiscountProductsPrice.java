/*2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee,
 then 400 tk will be discounted.
After your purchase what will be your total cost?*/

package string_manipulation;

import java.util.Scanner;

public class AfterDiscountProductsPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int shirtprice = 1200;
        int shareePrice = 3500;
        int discount = 400;
        int totalAmount;
        int totalAmountafd;

        System.out.println("Enter how many shirt do u want to buy");
        int shirt = input.nextInt();
        int shirtTp = shirtprice * shirt;
        System.out.println("total price of shirt is :" + shirtTp);

        System.out.println("Enter how many sharee do u want to buy");
        int sharee = input.nextInt();
        int shareeTp = shareePrice * sharee;
        System.out.println("total price of sharee is :" + shareeTp);

        totalAmount = shirtTp + shareeTp;

        if (shirt == 2 && sharee == 1) {
            totalAmountafd = totalAmount - discount;
            System.out.println("Total products prics is :"+ totalAmount+"tk");
            System.out.println("After discount Total product price is : " + totalAmountafd+"tk");
        } else {
            System.out.println("Sorry  without discount Total product price is : " + totalAmount+"tk");
        }
    }

}
