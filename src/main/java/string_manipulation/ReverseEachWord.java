package string_manipulation;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "This is sdet club.This is Question Answer Platform";
        String[] sentences = input.split("\\.");
        String result = "";

        for (String sentence : sentences) {
            String words[] = sentence.split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                result = result+" " + words[i];
            }
            result += ".";}
            System.out.println(result.trim());
        }
    }