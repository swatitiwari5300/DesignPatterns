package org.dp.ProblemStatements.FilghtBookingSystem;

import java.util.List;

public class Airline {
    private String name;
    private List<Flight> flights;

    public Airline(String name, List<Flight> flights) {
        this.name = name;
        this.flights = flights;
    }
    @Override
    public String toString() {
        return "Airline{name='" + name + "'}";
    }
}