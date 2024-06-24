package OOPS.MainPack;

public class AccessModifier {
    public int a = 12;
    private int b = 13;
    int c = 15;
    protected String name = "Sagar";
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println("Public Variable: "+obj.a);
        System.out.println("Private variable: "+obj.b);
        System.out.println("Default variable: "+obj.c);
        System.out.println("Protected variable: "+obj.name);
        obj.test();
    }
    protected void test(){
        System.out.println("Public Variable inside protected method: "+a);
        System.out.println("Private Variable inside protected method: "+b);
        System.out.println("Default Variable inside protected method: "+c);
        System.out.println("Protected Variable inside protected method: "+name);
    }

}
