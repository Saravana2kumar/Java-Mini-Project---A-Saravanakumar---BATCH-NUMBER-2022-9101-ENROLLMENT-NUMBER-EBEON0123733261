package com.airline;

public class AirlineReservationApp {
    public static void main(String[] args) {
        AirlineReservationSystem reservationSystem = new AirlineReservationSystem();

        // Adding sample flights
        reservationSystem.addFlight(new Flight("FL001", "New York", "Los Angeles", 100));
        reservationSystem.addFlight(new Flight("FL002", "Chicago", "San Francisco", 50));
        reservationSystem.addFlight(new Flight("FL003", "Dallas", "Miami", 75));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Airline Reservation System");
            System.out.println("1. Display Available Flights");
            System.out.println("2. Book a Flight");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    reservationSystem.displayFlights();
                    break;
                case 2:
                    System.out.print("Enter the flight number: ");
                    String flightNumber = scanner.next();
                    reservationSystem.bookFlight(flightNumber);
                    break;
                case 3:
                    System.out.println("Thank you for using the Airline Reservation System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}