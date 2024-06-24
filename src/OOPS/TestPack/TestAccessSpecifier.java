package OOPS.TestPack;

import OOPS.MainPack.AccessModifier;

public class TestAccessSpecifier extends AccessModifier {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        TestAccessSpecifier obj1 = new TestAccessSpecifier();
        System.out.println(obj1.name);
        obj1.test();
        System.out.println(obj1.a);
        System.out.println(obj.a);
    }
}
