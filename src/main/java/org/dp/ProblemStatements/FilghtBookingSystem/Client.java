package org.dp.ProblemStatements.FilghtBookingSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Client {

    public static void main(String[] args) {
        //Client interface for booking the logic
        FlightBookingSystem flightBookingSystem = new FlightBookingSystem();
        flightBookingSystem.getFlights("Delhi", "Bangalore", LocalDateTime.of(2025, 5, 20, 10, 30));
        flightBookingSystem.bookFlight(null, null);
    }
}
