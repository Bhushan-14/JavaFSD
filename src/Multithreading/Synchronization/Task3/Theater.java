package Multithreading.Synchronization.Task3;
public class Theater {
    private String name;
    private Seat[] seats;
    public Theater(String name) {
        this.name = name;
        this.seats = new Seat[3];
    }
    public String getName() {
        return name;
    }
    public Seat getSeat(String type) {
        for (Seat seat : seats) {
            if (seat != null && seat.getType().equalsIgnoreCase(type)) {
                return seat;
            }
        }
        return null;
    }
    public void addSeat(Seat seat) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == null) {
                seats[i] = seat;
                break;
            }
        }
    }
}
