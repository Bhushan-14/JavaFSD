package Exception;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String userName = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        String cUserName = sc.nextLine();
        System.out.println("Enter confirm password: ");
        String cPassword = sc.nextLine();
        if(userName.equals(cUserName) && password.equals(cPassword)){
            System.out.println("Valid Password");
        }else{
            throw new Demo9("Invalid credentials");
        }
    }
}
