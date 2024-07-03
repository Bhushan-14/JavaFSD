package Exception.Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            if (username == null || username.isEmpty()) {
                throw new UsernameException("Username cannot be null or empty");
            }
            System.out.println("Username is valid.");
        } catch (UsernameException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (password == null || password.length() < 8) {
                throw new PasswordException("Password must be at least 8 characters long");
            }
            System.out.println("Password is valid.");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
