package OOPS.Keywords;

import java.util.Scanner;

public class StaticMethodDemo {
    static void greet(String name){
        System.out.println("Hello "+name);
    }
    void show(String name){
        greet(name);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        StaticMethodDemo obj = new StaticMethodDemo();
        obj.show(name);
    }
}
