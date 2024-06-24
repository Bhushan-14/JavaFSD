package ConditionalStatement;

import java.util.Scanner;

public class TableOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(5*i);
//        }

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
