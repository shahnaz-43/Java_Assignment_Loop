package string_manipulation;

public class ExtractWordFromString {

    public static void main(String[] args) {
        String str="I live in Dhaka-1212";
        String word="Dhaka";
        int index=str.indexOf(word);
        System.out.println("Index of "+word+" is  "+index);
                str=str.substring(index,6);
        System.out.println("Substring is "+str);
    }
}

