package string_manipulation;

public class Practice01 {


    public static void main(String[] args)
    {
        String str1 = "java exercises";
        String str2 = "ruby Exercise";

        // The String to check the above two Strings to see if they end with this value (se).
        String end_str = "se";


        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);


        System.out.println("\"" + str1 + "\" ends with " +
                "\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with " +
                "\"" + end_str + "\"? " + ends2);
    }
}
