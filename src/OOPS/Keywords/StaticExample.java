package OOPS.Keywords;

public class StaticExample {
    int a =10;
    static int b=20;
    String name;
    double marks;
    int roll;
    static String college_name = "RCPIT";

    static int count=0;
    StaticExample(){}

    StaticExample(String name,int roll,double marks){
        this.name=name;
        this.roll=roll;
        this.marks=marks;
        count =count+1;
    }
    void print(){
        System.out.println("name:"+this.name+" roll No:"+this.roll+" marks:"+this.marks+" College name:"+college_name);
    }
    void show(){
        System.out.println("this is show Method");
    }

    @Override
    public String toString() {
        return "StaticExample{" +
                "a=" + a +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", roll=" + roll +
                ", college_name=" + college_name +
                '}';
    }
    static void  dispaly(){
        System.out.println("this is static method");
    }
    public static void main(String[] args) {
        StaticExample st =new StaticExample();
        System.out.println(st.a);
        System.out.println(b);
        st.show();
        dispaly();

        StaticExample k = new StaticExample("bhushan",11,99.9);
        k.print();
        System.out.println(count);
        StaticExample m = new StaticExample("Sager",15,98.9);
        m.print();
        System.out.println(count);
        StaticExample n = new StaticExample("Sandip",17,94.9);
        n.print();
        System.out.println(count);
        System.out.println(k.toString());
    }
}