package org.dp.ProblemStatements.FilghtBookingSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

// ENUM for Flight Status
enum Status {
    DELAY, ONTIME, CANCELLED
}

enum SeatStatus{
    BOOKED,OPEN;
}

// SEAT CLASS
class Seat {
    private String number;
    private String className;

    public Seat(String number, String className) {
        this.number = number;
        this.className = className;
    }
}

// AIRPORT CLASS
class Airport {
    private String name;
    private String location;
    private List<Flight> flights;

    public Airport(String name, String location, List<Flight> flights) {
        this.name = name;
        this.location = location;
        this.flights = flights;
    }
}

    // USER CLASS
    class User {
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }




