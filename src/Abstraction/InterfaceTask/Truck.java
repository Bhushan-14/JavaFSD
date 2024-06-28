package Abstraction.InterfaceTask;

public class Truck implements Vehicles{

    @Override
    public void engine(int capacity) {
        System.out.println("Capacity of Truck Engine: "+capacity);
    }

    @Override
    public void efficiency() {
        System.out.println("Efficiency of Truck: 7Km/L");
    }

    @Override
    public void vehicleCost() {
        System.out.println("Cost of Truck: 2000000.00 Rs");
    }

    @Override
    public void maintainance() {
        System.out.println("Service cost: 40000.00 Rs");
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.efficiency();
        truck.maintainance();
        truck.engine(2000);
        truck.vehicleCost();
    }
}
