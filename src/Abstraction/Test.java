package Abstraction;

public abstract class Test {
    int a = 10;
    static int b = 10;
    public Test(){
        System.out.println("Abstract class constructor");
    }
    void display(){
        System.out.println("display method of abstract class");
    }
    static void show(){
        System.out.println("Static method os abstract class");
    }
}
