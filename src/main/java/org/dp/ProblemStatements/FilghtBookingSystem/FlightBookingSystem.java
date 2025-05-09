package org.dp.ProblemStatements.FilghtBookingSystem;

import org.dp.ProblemStatements.FilghtBookingSystem.*;
import org.dp.ProblemStatements.RideSharing.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlightBookingSystem {

    private List<Flight> flights = new ArrayList<>();
    private List<BookingDetails> bookings = new ArrayList<>();

    public FlightBookingSystem() {
        //Flight Booking instantiation Logic
        System.out.println("Flight Booking System if turned on");
    }

    public List<Flight> getFlights(String source, String destination, LocalDateTime date) {
        //Logic for getting the flight list
        System.out.println("The flights are listed");
        return null;
    }

    public void bookFlight(Flight flight, User user) {
        //Logic for booking the flight
        System.out.println("The flight is booked as per need");
    }

    public void confirmBooking(BookingDetails details) {
        bookings.add(details);
        System.out.println("✅ Booking Confirmed:");
        System.out.println(details);
    }
}
