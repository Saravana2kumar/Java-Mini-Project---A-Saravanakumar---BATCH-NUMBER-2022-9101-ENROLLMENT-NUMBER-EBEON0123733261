package com.airline;

class AirlineReservationSystem {
    private List<Flight> flights;

    public AirlineReservationSystem() {
        flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void displayFlights() {
        System.out.println("Available flights:");
        for (Flight flight : flights) {
            System.out.println("Flight Number: " + flight.getFlightNumber());
            System.out.println("Source: " + flight.getSource());
            System.out.println("Destination: " + flight.getDestination());
            System.out.println("Available Seats: " + flight.getAvailableSeats());
            System.out.println();
        }
    }

    public void bookFlight(String flightNumber) {
        Flight selectedFlight = null;
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                selectedFlight = flight;
                break;
            }
        }

        if (selectedFlight != null) {
            selectedFlight.bookSeat();
        } else {
            System.out.println("Invalid flight number. Please try again.");
        }
    }
}
}
