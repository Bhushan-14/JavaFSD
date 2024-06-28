package Abstraction.InterfaceTask;

public class Bike implements Vehicles{

    @Override
    public void engine(int capacity) {
        System.out.println("Capacity of Bike Engine: "+capacity);
    }

    @Override
    public void efficiency() {
        System.out.println("Efficiency of Bike: 70Km/L");
    }

    @Override
    public void vehicleCost() {
        System.out.println("Cost of Truck: 200000.00 Rs");
    }

    @Override
    public void maintainance() {
        System.out.println("Service cost: 2000.00 Rs");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.efficiency();
        bike.vehicleCost();
        bike.engine(200000);
        bike.maintainance();
    }
}


