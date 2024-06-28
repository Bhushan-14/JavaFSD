package Abstraction.AbstractionTask;

import java.util.Scanner;

public class Bike implements Vehicle{
    @Override
    public void engine(int capcity){
        System.out.println("Bike capacity: "+capcity);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bike bike = new Bike();
        System.out.println("Enter capacity of Bike: ");
        int capacity = sc.nextInt();
        bike.engine(capacity);
    }
}
