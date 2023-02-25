package string_manipulation;

public class GeneratePassword {
    public static void main(String[] args) {
        int length = 8;
        String password = "";
        String chars ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() *
                    chars.length());
            password += chars.charAt(index);
        }
        System.out.println("Password: " + password);
    }
}

