package Assignments;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String otp = generateOTP();
        System.out.println("Your OTP: " + otp);

        System.out.println("Enter your otp: ");
        String e_otp = sc.nextLine();
        if(e_otp == otp){
            System.out.println("Valid otp");
        }else{
            System.out.println("Invalid otp, Enter correct otp");
        }
    }
    public static String generateOTP() {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            otp.append(random.nextInt(9));
        }
        return otp.toString();
    }
}
