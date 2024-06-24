package ConditionalStatement;

import java.util.Scanner;

public class SubjectPercentageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject1: ");
        int s1 = sc.nextInt();
        System.out.println("Enter marks of subject2: ");
        int s2 = sc.nextInt();
        System.out.println("Enter marks of subject3: ");
        int s3 = sc.nextInt();
        System.out.println("Enter marks of subject4: ");
        int s4 = sc.nextInt();
        System.out.println("Enter marks of subject5: ");
        int s5 = sc.nextInt();

        if (s1 >= 35 && s2 >= 35 && s3 >= 35 && s4 >= 35 && s5 >= 35) {
            int total = s1 + s2 + s3 + s4 + s5;
            int numberOfSubjects = 5;
            double percentage = (double) total / numberOfSubjects;
            System.out.println("Total marks: " + total);
            System.out.println("Percentage: " + percentage + "%");
            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 80) {
                System.out.println("Grade: B");
            } else if (percentage >= 70) {
                System.out.println("Grade: C");
            } else if (percentage >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        } else {
            System.out.println("You have failed in the following subjects:");
            if (s1 < 35) {
                System.out.println("Subject 1");
            }
            if (s2 < 35) {
                System.out.println("Subject 2");
            }
            if (s3 < 35) {
                System.out.println("Subject 3");
            }
            if (s4 < 35) {
                System.out.println("Subject 4");
            }
            if (s5 < 35) {
                System.out.println("Subject 5");
            }
        }
    }
}