package javafundamentals;

public class Type_Casting_Demo1 {
    public static void main(String[] args) {
        int a = 5;
        double b = 10.5;
        int c = (int) (a + b);
        System.out.println(a+b);//implicit type casting
        System.out.println(c);//explicit type casting
        //explicit type casting might lead to lossy conversion
        long d = 60;
        int e = 5;
//        char f = d  + e;
    }
}

