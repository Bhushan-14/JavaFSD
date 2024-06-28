package Abstraction;

public class ChildTest extends Test{
    public static void main(String[] args) {
        ChildTest ch = new ChildTest();
        ch.display();
        show();
    }
    @Override
    void display(){
        System.out.println("display method of child class");
    }
}
