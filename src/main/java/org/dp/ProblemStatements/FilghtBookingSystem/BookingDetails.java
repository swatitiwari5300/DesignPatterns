package org.dp.ProblemStatements.FilghtBookingSystem;

import java.time.LocalDate;

public class BookingDetails {
    private Flight flight;
    private User user;
    private String locationStart;
    private String locationDestination;
    private LocalDate date;
    private String pnr;

    // Private constructor
    private BookingDetails(Builder builder) {
        this.flight = builder.flight;
        this.user = builder.user;
        this.locationStart = builder.locationStart;
        this.locationDestination = builder.locationDestination;
        this.date = builder.date;
        this.pnr = builder.pnr;
    }

    // Static Builder class
    public static class Builder {
        private Flight flight;
        private User user;
        private String locationStart;
        private String locationDestination;
        private LocalDate date;
        private String pnr;

        public Builder setFlight(Flight flight) {
            this.flight = flight;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setLocationStart(String locationStart) {
            this.locationStart = locationStart;
            return this;
        }

        public Builder setLocationDestination(String locationDestination) {
            this.locationDestination = locationDestination;
            return this;
        }

        public Builder setDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder setPnr(String pnr) {
            this.pnr = pnr;
            return this;
        }

        public BookingDetails build() {
            return new BookingDetails(this);
        }
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "flight=" + flight +
                ", user=" + user +
                ", locationStart='" + locationStart + '\'' +
                ", locationDestination='" + locationDestination + '\'' +
                ", date=" + date +
                ", pnr='" + pnr + '\'' +
                '}';
    }
}

