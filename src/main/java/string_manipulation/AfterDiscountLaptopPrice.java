//3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

package string_manipulation;

public class AfterDiscountLaptopPrice {
    public static void main(String[] args) {

        int lapPrice = 76000;
        double pd = lapPrice * 0.10;
        double totalp = lapPrice - pd;

        System.out.println("Laptop price is : 76000tk");
        System.out.println("Laptop Purchase price after 10% discount is: " + totalp+"tk");


    }

}
