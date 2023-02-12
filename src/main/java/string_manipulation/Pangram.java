package string_manipulation;

public class Pangram {
    public static void main(String[] args) {
        String str = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
        str = str.replace(" ", "");
        char[] y = str.toCharArray();

        int[] a = new int[26];
        int i = 0;
        while (i != y.length) {
            int index = y[i] - 65;
            a[index] = 1;
            i++;
        }
        i = 0;
        while (i != 26) {
            if (a[i] == 1) {
                i++;
            } else {
                System.out.println("Non panagram");
                System.exit(0);
            }
        }
        System.out.println("Is Panagram");

    }
}
