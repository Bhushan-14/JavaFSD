package OOPS.Keywords;

public class StaticBlockDemo {
    static {
        System.out.println("Hello from static block");
    }
    static {
        System.out.println("Hello from static block 2");
    }
    static{
        int i = 10 + 15;
        System.out.println(i);
    }
    public static void main(String[] args) {
        System.out.println("Hello from main method");
    }
}
