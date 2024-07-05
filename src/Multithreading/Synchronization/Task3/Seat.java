package Multithreading.Synchronization.Task3;

public class Seat {
    private String type;
    private int price;
    private int availableSeats;

    public Seat(String type, int price, int availableSeats) {
        this.type = type;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeats(int seatsToBook) throws NotEnoughSeatsException {
        if (seatsToBook > availableSeats) {
            throw new NotEnoughSeatsException("Not enough " + type + " seats available.");
        }
        availableSeats -= seatsToBook;
    }
}
