package org.dp.ProblemStatements.FilghtBookingSystem;

import java.util.List;

// FLIGHT CLASS
public class Flight {
    private String flightNo;
    private Airline airlineCompany;
    private List<FlightSeat> seats;
    private Schedule schedule;

    public Flight(String flightNo, Airline airlineCompany, List<FlightSeat> seats, Schedule schedule) {
        this.flightNo = flightNo;
        this.airlineCompany = airlineCompany;
        this.seats = seats;
        this.schedule = schedule;
    }

    public String getFlightNo() { return flightNo; }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNo='" + flightNo + '\'' +
                ", airlineCompany=" + airlineCompany +
                ", schedule=" + schedule +
                '}';
    }
}