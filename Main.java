package Generate;

import java.util.Scanner;

public class Main {

    public Main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PRESS:\n 1) For generating temporary password\n 2) For generating OTP");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("A Random password will be generated for one time use:");
                Password pass = new Password();
                break;
            }
            case 2: {
                OTP otp = new OTP();
                break;
            }
            default:
                System.out.printf("Your request is Invalid");
        }
    }

    public static void main(String[] args) {
        Main n = new Main();
    }
}
