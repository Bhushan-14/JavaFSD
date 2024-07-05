package Multithreading.Synchronization.Task3;

import java.util.Scanner;

public class BookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Theater pvr = new Theater("PVR");
        pvr.addSeat(new Seat("gold", 100, 50));
        pvr.addSeat(new Seat("diamond", 150, 30));
        pvr.addSeat(new Seat("platinum", 200, 20));

        Theater imax = new Theater("IMAX");
        imax.addSeat(new Seat("gold", 120, 40));
        imax.addSeat(new Seat("diamond", 180, 25));
        imax.addSeat(new Seat("platinum", 250, 15));

        Theater playhouse = new Theater("Playhouse");
        playhouse.addSeat(new Seat("gold", 80, 60));
        playhouse.addSeat(new Seat("diamond", 130, 35));
        playhouse.addSeat(new Seat("platinum", 190, 18));

        boolean continueBooking = false;

        do {
            System.out.println("Welcome to Theater Booking System!");
            System.out.println("Choose a theater:");
            System.out.println("1. PVR");
            System.out.println("2. IMAX");
            System.out.println("3. Playhouse");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int theaterChoice = scanner.nextInt();

            Theater selectedTheater = null;
            switch (theaterChoice) {
                case 1:
                    selectedTheater = pvr;
                    break;
                case 2:
                    selectedTheater = imax;
                    break;
                case 3:
                    selectedTheater = playhouse;
                    break;
                case 4:
                    continueBooking = false;
                    continue;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    continue;
            }

            System.out.println("\n" + selectedTheater.getName() + " - Available Seats:");
            System.out.println("1. Gold seats | Price: $" + selectedTheater.getSeat("gold").getPrice() + " | Available: " + selectedTheater.getSeat("gold").getAvailableSeats());
            System.out.println("2. Diamond seats | Price: $" + selectedTheater.getSeat("diamond").getPrice() + " | Available: " + selectedTheater.getSeat("diamond").getAvailableSeats());
            System.out.println("3. Platinum seats | Price: $" + selectedTheater.getSeat("platinum").getPrice() + " | Available: " + selectedTheater.getSeat("platinum").getAvailableSeats());
            System.out.print("Enter your choice for seat type: ");
            int seatTypeChoice = scanner.nextInt();

            Seat selectedSeat = null;
            switch (seatTypeChoice) {
                case 1:
                    selectedSeat = selectedTheater.getSeat("gold");
                    break;
                case 2:
                    selectedSeat = selectedTheater.getSeat("diamond");
                    break;
                case 3:
                    selectedSeat = selectedTheater.getSeat("platinum");
                    break;
                default:
                    System.out.println("Invalid seat type choice. Exiting...");
                    continue;
            }

            System.out.println("Selected seat type: " + selectedSeat.getType() + " | Available Seats: " + selectedSeat.getAvailableSeats());
            System.out.print("\nEnter the number of seats to book: ");
            int seatsToBook = scanner.nextInt();

            Seat finalSelectedSeat = selectedSeat;
            Thread bookingThread = new Thread(() -> {
                try {
                    finalSelectedSeat.bookSeats(seatsToBook);
                    System.out.println("Successfully booked " + seatsToBook + " " + finalSelectedSeat.getType() + " seats!");
                } catch (NotEnoughSeatsException e) {
                    System.out.println(e.getMessage());
                }
            });

            bookingThread.start();

            try {
                bookingThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\nRemaining seats in " + selectedTheater.getName() + ":");
            System.out.println("Gold seats: " + selectedTheater.getSeat("gold").getAvailableSeats());
            System.out.println("Diamond seats: " + selectedTheater.getSeat("diamond").getAvailableSeats());
            System.out.println("Platinum seats: " + selectedTheater.getSeat("platinum").getAvailableSeats());

            System.out.print("\nDo you want to continue booking? (yes/no): ");
            String choice = scanner.next();
            continueBooking = choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y");

        } while(continueBooking);
        System.out.println("Thank you for using the Theater Booking System!");
        scanner.close();
    }
}
