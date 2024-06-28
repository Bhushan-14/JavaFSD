package Abstraction.InterfaceTask;

public class Car implements Vehicles{
    @Override
    public void engine(int capacity) {
        System.out.println("Capacity of car Engine: "+capacity);
    }

    @Override
    public void efficiency() {
        System.out.println("Efficiency of car: 40Km/L");
    }

    @Override
    public void vehicleCost() {
        System.out.println("Cost of car: 400000.00 Rs");
    }

    @Override
    public void maintainance() {
        System.out.println("Service cost: 5000.00 Rs");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.vehicleCost();
        car.engine(200000);
        car.efficiency();
        car.maintainance();
    }

}
