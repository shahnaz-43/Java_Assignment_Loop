package ExceptionHandling;

public class NullPointerException {
    public static void main(String[] args) {
        String s=null;
        System.out.println(s.length());

    }
}

/*Resolution
public class NullPointerException {

    public static void main(String[] args) {
        String s=null;
        if(s!=null)
            System.out.println(s.length());
        else
        {
            System.out.println("pls provide some value");
        }
    }
}

}
*/