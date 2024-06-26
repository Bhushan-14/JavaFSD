package Inheritance;

public class Car extends Vehicles {
    void wheels(){
        System.out.println("Car have four wheels");
    }
    public static void main(String[] args) {
        Vehicles obj = new Vehicles();
        Car obj1 = new Car();
        obj1.wheels();
    }
}
