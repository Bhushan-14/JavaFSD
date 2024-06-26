package OOPS.Methods;
import java.util.Scanner;

public class PasswordValidator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Password should start with a capital letter and only contain alphanumeric values, '@', '_', or '$'.");
        System.out.println("Enter a password: ");
        String pass = sc.nextLine();
        int result = isValid(pass);
        if(result == 1){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }

    public static int isValid(String pass){
        if(pass.length() >= 8){
            if(Character.isUpperCase(pass.charAt(0))){
                for (int i = 0; i < pass.length(); i++){
                    char passwordChar = pass.charAt(i);
                    if(!Character.isLetterOrDigit(passwordChar) && passwordChar != '@' && passwordChar != '_' && passwordChar != '$'){
                        return 0;
                    }
                }
                return 1;
            } else {
                System.out.println("Password should start with a capital letter");
                return 0;
            }
        } else {
            System.out.println("Password should be a minimum of 8 characters");
            return 0;
        }
    }
}
