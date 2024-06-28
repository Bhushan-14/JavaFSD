package Polymorphism;

public class Over_load {
    void addition(int a,int b){
        System.out.println(a+b);
    }
    void addition(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void addition(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        Over_load o1 =new Over_load();
        o1.addition(1,2);
        o1.addition(1,2,3);
        o1.addition(1,2,3,4);
        o1.main("sandip");
        main();

    }

    public void main(String str){
        System.out.println("main method overload 1");
    }
    public static void main(){
        System.out.println("main method oveload2");
    }


}