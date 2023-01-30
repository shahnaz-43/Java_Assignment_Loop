package java_basic;

import java.util.Arrays;

public class StrLengthWithoutMethod {
    public static void main(String[] args) {

        String str="Java practice";
        char[] ch = str.toCharArray();
        int ln = 0;

        for (char c: ch) {
            ln++;
            }
        System.out.println(Arrays.toString(ch));
        System.out.println("String length > " + ln);

    }
}
