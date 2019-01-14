package Generate;

import java.util.Random;

public class Password {

    int plength = 10;

    public Password() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String symbols = "!@#$%^&*";

        String generte = capitalLetters + smallLetters + numbers + symbols;

        char[] password = new char[plength];
        Random random = new Random();

        for (int i = 0; i < plength; i++) {
            int select = random.nextInt(generte.length());
            password[i] = generte.charAt(select);
        }

        for (char x : password) {
            System.out.print(x);
        }
    }
}
