package OOPS.MainPack;

public class AccessSpecifierTest {
    public static void main(String[] args) {
        AccessModifier obj1 = new AccessModifier();
        obj1.test();
        System.out.println(obj1.a);
//        System.out.println(obj1.b);
        System.out.println(obj1.c);
        System.out.println(obj1.name);
    }
}
