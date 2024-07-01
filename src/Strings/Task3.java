package Strings;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int spaceCount = 0;
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Number of spaces: " + spaceCount);
        String withoutSpaces = "";
        String replace = input.replace(" ", "");
        System.out.println("String without spaces: " + replace);
    }
}
