package javafundamentals;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double c = 15.5;
        float d = 20.5f;
//        System.out.println(a++);
//        System.out.println(++b);

//        System.out.println(--a);
//        System.out.println(b--);
        float x = (float) (a++ +(--d));
        System.out.println(a);
        System.out.println(d);
        System.out.println(x);
        System.out.println(a++ +(--d));
        System.out.println(a);
        System.out.println(d);
//        System.out.println((++a)-(b++)*(++c));
//        System.out.println(c*(d++)-(--a));
//        System.out.println(a++ +(a++)/(d--));
    }
}

