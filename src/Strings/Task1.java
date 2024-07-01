package Strings;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with allowed spaces: ");
        String input = sc.nextLine();
        int a_count = 0;
        int v_count = 0;
        int s_count = 0;
        String lowercase = input.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            char ch = lowercase.charAt(i);
            if (Character.isLetter(ch)) {
                a_count++;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v_count++;
                }
            } else if (ch == ' ') {
                s_count++;
            }
        }
        System.out.println("Number of alphabets: " + a_count);
        System.out.println("Number of vowels: " + v_count);
        System.out.println("Spaces: " + s_count);
    }
}
