package org.dp.RideSharingProblemStatement;

public class Driver extends User{

    private Vehicle vehicle;

    public Driver(String name, String email, Location location, Vehicle vehicle) {
        super(name, email, location);
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void notify(String msg) {
        System.out.println("Driver: "+msg);
    }
}
