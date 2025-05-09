package org.dp.ProblemStatements.FilghtBookingSystem;

// FLIGHT SEAT CLASS
public class FlightSeat extends Seat {
    private int price;
    private SeatStatus status;

    public FlightSeat(String number, String className, int price, SeatStatus status) {
        super(number, className);
        this.price = price;
        this.status = status;
    }
}
