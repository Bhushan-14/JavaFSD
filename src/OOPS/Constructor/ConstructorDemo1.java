package OOPS.Constructor;

public class ConstructorDemo1 {
    private int a;
    private int b;

    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        ConstructorDemo1 obj = new ConstructorDemo1(a, b);
    }

    public ConstructorDemo1(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + b);
    }

    public ConstructorDemo1(ConstructorDemo1 obj) {
        this.a = obj.a;
        this.b = obj.b;

    }
}
