package Generate;

import java.util.Random;
import java.util.Scanner;

public class OTP {

    int otp_Digit_Length = 8;
    int otp_alpha_length = 6;

    public OTP() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";

        String value = capitalLetters + smallLetters;
        String digits = "1234567890";

        System.out.println("PRESS:\n 1) OTP in Alphabets\n 2) OTP in Digits");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        char[] alphaArr = new char[value.length()];
        char[] digitArr = new char[digits.length()];

        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("A random OTP will be generated for use:");
                for (int i = 0; i < otp_alpha_length; i++) {
                    int select = random.nextInt(value.length());
                    alphaArr[i] = value.charAt(select);
                }
                for (char x : alphaArr) {
                    System.out.print(x);
                }
                break;
            }
            case 2: {
                System.out.println("A random OTP will be generated for use:");
                for (int i = 0; i < otp_Digit_Length; i++) {
                    int select = random.nextInt(digits.length());
                    digitArr[i] = digits.charAt(select);
                }

                for (char y : digitArr) {
                    System.out.print(y);
                }
                break;
            }
            default:
                System.out.println("Invalid Choice\nRequest Terminated....");
        }
    }
}
