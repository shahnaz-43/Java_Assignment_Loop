package string_manipulation;

public class EncryptWord {
    public static void main(String[] args) {
        System.out.println("Input Word");
        String word = "Apple";
        char[] chars = word.toCharArray();
        for (char c : chars) {
            c += 5;
            System.out.print(c);
        }
    }
}
