package OOPS.Keywords;

public class Task1 {
    int a = 10;
    static int b = 20;

    public Task1() {
//        this.a = a;
        System.out.println("Hello from constructor");
    }

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance block");
    }
    static {
        System.out.println("Static block 2");
    }
    {
        System.out.println("Instance block 2");
    }
    static void display(){
        System.out.println("Display method");
    }
    void show(){
        System.out.println("Show method");
    }
    public static void main(String[] args) {
        Task1 obj = new Task1();
    }
}
