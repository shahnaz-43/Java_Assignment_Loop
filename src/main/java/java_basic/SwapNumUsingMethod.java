package java_basic;

public class SwapNumUsingMethod {

        public static void main(String[] args) {
            int a=4;int b=5;
            System.out.println(a + ", " + b);
            swap(a,b);
        }

    public static void swap(int a, int b) {
            
            int temp = a;
            a = b;
            b = temp;

        System.out.println("after"+a+" ,"+b);
        }
    }


