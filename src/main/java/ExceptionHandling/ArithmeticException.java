package ExceptionHandling;

public class ArithmeticException {
    public static void main(String[] args) {
        int n1=10;
        int n2=0;
        int div=n1/n2;
        System.out.println(div);
    }
}

//Resolution
/*public class ArithmeticException {
    public static void main(String[] args) {
        int n1=10;
        int n2=0;
        if(n2!=0)
        {
            int div=n1/n2;
            System.out.println(div);
        }
        else
        {
            System.out.println("pls don't enter zero as denominator");
        }

    }
}
*/
