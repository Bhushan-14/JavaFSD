package Assignments;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String choice;

        do {
            System.out.println("Choose the shape to calculate area and perimeter:");
            System.out.println("Enter 1 for Circle");
            System.out.println("Enter 2 for Square");
            System.out.println("Enter 3 for Rectangle");
            System.out.println("Enter your choice: ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("For Circle:");
                    System.out.println("Enter radius of circle: ");
                    double radius = sc.nextDouble();
                    System.out.println("Area of Circle: " + 3.14 * radius * radius);
                    System.out.println("Perimeter of Circle: " + 2 * 3.14 * radius);
                    break;
                case 2:
                    System.out.println("For Square:");
                    System.out.println("Enter side length of square: ");
                    double side = sc.nextDouble();
                    System.out.println("Area of Square: " + side * side);
                    System.out.println("Perimeter of Square: " + 4 * side);
                    break;
                case 3:
                    System.out.println("For Rectangle:");
                    System.out.println("Enter length of rectangle: ");
                    double length = sc.nextDouble();
                    System.out.println("Enter width of rectangle: ");
                    double width = sc.nextDouble();
                    System.out.println("Area of Rectangle: " + length * width);
                    System.out.println("Perimeter of Rectangle: " + 2 * (length + width));
                    break;
                default:
                    System.out.println("Invalid choice. Please enter valid input.");
            }

            System.out.println("Do you want to continue? (y/n): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));
    }
}
