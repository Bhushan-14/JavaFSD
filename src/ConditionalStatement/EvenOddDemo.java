package ConditionalStatement;

import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Given number is even number");
        }else{
            System.out.println("Given number is odd number");
        }
    }
}
