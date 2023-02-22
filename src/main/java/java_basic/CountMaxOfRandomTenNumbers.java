package java_basic;

public class CountMaxOfRandomTenNumbers {
    public static void main(String[] args) {
        int max = 0;
        int i=0;
        for (i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100);
            System.out.println(num);
            if (num > max) {
                max = num;
            } }
        System.out.println("Max number is: " + max);
    }
}

