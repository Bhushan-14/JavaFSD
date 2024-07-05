package Multithreading.Synchronization.Task2;

public class Main {
    static int totalSeats = 100;
    static int remainingSeats = totalSeats;
    static int bookedSeats = 0;
    static double totalCollection = 0;

    public synchronized static void bookSeats(int seatsToBook) throws NotEnoughSeatsException {
        if (seatsToBook > remainingSeats) {
            throw new NotEnoughSeatsException("Not enough seats available!");
        }

        bookedSeats = bookedSeats + seatsToBook;
        remainingSeats = remainingSeats - seatsToBook;
        totalCollection = totalCollection + seatsToBook * 50.0;
        System.out.println("Remaining seats: " + remainingSeats);
        System.out.println("Total seats booked: " + bookedSeats);
        System.out.println("Total collection amount: " + totalCollection);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Total seats are: "+totalSeats);

        Thread thread1 = new Thread(() -> {
            try {
                bookSeats(20);
            } catch (NotEnoughSeatsException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                bookSeats(30);
            } catch (NotEnoughSeatsException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                bookSeats(50);
            } catch (NotEnoughSeatsException e) {
                System.out.println(e.getMessage());
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
