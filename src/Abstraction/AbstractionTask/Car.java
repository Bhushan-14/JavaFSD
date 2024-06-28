package Abstraction.AbstractionTask;

import java.util.Scanner;

public class Car implements Vehicle{

    @Override
    public void engine(int capacity) {
        System.out.println("Car capacity: "+capacity);
    }

    public static void main(String[] args) {
        Car car = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter capacity of Car: ");
        int capacity = sc.nextInt();
        car.engine(capacity);
    }
}
