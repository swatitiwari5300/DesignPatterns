package org.dp.ProblemStatements.FilghtBookingSystem;

import java.time.LocalDateTime;
import java.util.List;

// SCHEDULE CLASS
public class Schedule {
    private Flight flight;
    private Airport start;
    private Airport destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Status status;
    private List<FlightSeat> fare;

    public Schedule(Flight flight, Airport start, Airport destination, List<FlightSeat> fare, Status status, LocalDateTime arrivalTime, LocalDateTime departureTime) {
        this.flight = flight;
        this.start = start;
        this.destination = destination;
        this.fare = fare;
        this.status = status;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public String getSource() {
        return start.toString();
    }

    public String getDestination() {
        return destination.toString();
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return start + " -> " + destination + " at " + departureTime;
    }
}
