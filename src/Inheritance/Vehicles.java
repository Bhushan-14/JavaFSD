package Inheritance;

public class Vehicles {
    void engine(){
        System.out.println("Engine method of vehicle class");
    }
    void wheels(){
        System.out.println("Wheels method of vehicle class");
    }
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        vehicles.engine();
        vehicles.wheels();
    }
}
