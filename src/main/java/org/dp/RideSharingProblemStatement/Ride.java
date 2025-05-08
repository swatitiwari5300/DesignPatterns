package org.dp.RideSharingProblemStatement;

enum RideStatus{
    ONGOING, SCHEDULED, COMPLETED;
}

public class Ride {

    private Passenger passenger;
    private Driver driver;
    private double distance;
    private FareStrategy fareStrategy;
    private double fare;
    private RideStatus rideStatus;

    public Ride(Passenger passenger, Driver driver, double distance, FareStrategy fareStrategy) {
        this.passenger = passenger;
        this.driver = driver;
        this.distance = distance;
        this.fareStrategy = fareStrategy;
        this.rideStatus = RideStatus.SCHEDULED;
    }

    public void calcFare(){
        this.fare = fareStrategy.calcFare(driver.getVehicle(), distance);
    }

    public double getFare() {
        return fare;
    }

    public void updateStatus(RideStatus status){
        this.rideStatus = status;
        notifyUsers(status);
    }
    private void notifyUsers(RideStatus status){
        passenger.notify("Your ride is "+status);
        driver.notify("Ride Status : "+status);
    }
}
