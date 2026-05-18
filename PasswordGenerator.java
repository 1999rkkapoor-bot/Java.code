import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#";
        Random rand = new Random();

        String password = "";

        for(int i = 0; i < 8; i++) {
            int index = rand.nextInt(chars.length());
            password += chars.charAt(index);
        }

        System.out.println("Generated Password: " + password);
    }
}