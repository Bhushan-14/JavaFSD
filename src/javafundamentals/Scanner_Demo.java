package javafundamentals;

import java.util.Scanner;

public class Scanner_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter you First Name: ");
//        String f_name = sc.nextLine();
//        System.out.println("Enter you Last Name: ");
//        String l_name = sc.nextLine();
//        System.out.println("Enter you Education: ");
//        String edu = sc.nextLine();
//        System.out.println("Enter your Address: ");
//        String add = sc.nextLine();
//        System.out.println("Enter your Contact:");
//        String cont = sc.nextLine();
        System.out.println("Enter your Email:");
        String email = sc.nextLine();
        System.out.println("Enter your Password:");
        String pass = sc.nextLine();
//        System.out.println("Enter your Percentage:");
//        String perc = sc.nextLine();

//        System.out.println("User details: ");
//        System.out.println("User name is "+f_name+" "+l_name);
//        System.out.println("User Education is: "+edu);
//        System.out.println("User Address is: "+add);
//        System.out.println("User Contact is: "+cont);
//        System.out.println("User Email is: "+email);
//        System.out.println("User Password is: "+pass);
//        System.out.println("User Percentage is: "+perc);

        System.out.println("Login Page: ");
        System.out.println("Enter a email: ");
        String n_email = sc.nextLine();
        System.out.println("Enter password: ");
        String n_pass = sc.nextLine();

        if(n_email.equals(email) && n_pass.equals(pass)){
            System.out.println("Welcome to the My_web");
        }else {
            System.out.println("Invalid credentials");
        }
    }

}
