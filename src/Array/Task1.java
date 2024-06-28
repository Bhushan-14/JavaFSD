package Array;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        double average = sum / (double) marks.length;
        double percentage = (sum / (double) (marks.length * 100)) * 100;
        System.out.println("Average marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
    }
}
