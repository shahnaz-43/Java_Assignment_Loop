package string_manipulation;/*5. Write a program that will count how many vowels in the given string:
"roadtosdet" Output: 4*/

public class CountVowel {
    public static void main(String[] args) {

        String str = "roadtosdet";
        char[] cha = str.toCharArray();
        int count = 0;
        for (char findv : cha) {

            switch (findv) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    count=count+1;
                    break;
            }
        }
        System.out.println("Total vowels in the string is" +" "+ count);

    }
}
