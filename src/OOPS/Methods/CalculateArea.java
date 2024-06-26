package OOPS.Methods;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Enter side of square: ");
        double side = sc.nextDouble();
        System.out.println("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        System.out.println("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.println("Enter height of triangle: ");
        double height = sc.nextDouble();
        System.out.printf("Area of Circle is: %.2f%n", areaCircle(radius));
        System.out.printf("Area of Square is: %.2f%n", areaSquare(side));
        System.out.printf("Area of Rectangle is: %.2f%n", areaRectangle(length, breadth));
        System.out.printf("Area of Triangle is: %.2f%n", areaTriangle(base, height));
    }
    public static double areaCircle(double radius){
        return (3.12*radius*radius);
    }
    public static double areaSquare(double side){
        return side * side;
    }
    public static double areaRectangle(double length, double breadth){
        return length * breadth;
    }
    public static double areaTriangle(double base, double height){
        return 0.5*base*height;
    }
}
