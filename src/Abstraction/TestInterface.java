package Abstraction;

public class TestInterface implements firstInterface{

    @Override
    public void display() {
//        System.out.println("Display method in TestInterface class");
    }
    public static void main(String[] args) {
        TestInterface obj = new TestInterface();
        obj.display();
        firstInterface.add();
    }
}
