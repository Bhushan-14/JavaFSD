package OOPS.Keywords;

public class StaticsKeywordDemo {
    static int a = 12;
    int b = 22;
    void show(){
        System.out.println("This show Method");
    }
    static void display(){
        System.out.println("This is static method");
    }
    public static void main(String[] args) {
        StaticsKeywordDemo obj = new StaticsKeywordDemo();
        obj.show();
        System.out.println(obj.b);
        obj.display();
        StaticsKeywordDemo.display();
        display();
        System.out.println(a);


        StaticClass.display1();
    }
    static class StaticClass{
        static int c = 12;
        static int d = 13;
        static String Name = "Sagar";
        static int add(){
            return c + d;
        }
        static void display1(){
            System.out.println(Name);
        }

        public static void main(String[] args) {
            StaticsKeywordDemo obj1 = new StaticsKeywordDemo();
            StaticClass.add();
        }
    }
}
