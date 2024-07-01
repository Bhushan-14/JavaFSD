package Exception;
import java.util.Scanner;
public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age < 18){
            throw new ArithmeticException("Not Eligible..!!");
        }
        else{
            System.out.println("You are eligible for vote");
        }
    }
}