package org.dp.ProblemStatements.RideSharing;

import java.util.ArrayList;
import java.util.List;

public class RideSharingService {

    private List<Driver> driverList = new ArrayList<>();

    public void addDriver(Driver driver) {
        driverList.add(driver);
    }


    public void requestRide(Passenger passenger, double distance, FareStrategy fareStrategy) {

        if (driverList.isEmpty()) {
            passenger.notify("No rides to be scheduled, since there are no drivers available.");
            return;
        }

        Driver availedDriver = fetchTheNewarestDriver(passenger);
        //passenger.notify("Driver has been assigned, please find the details: " + availedDriver);

        driverList.remove(availedDriver);

        Ride ride = new Ride(passenger, availedDriver,distance,fareStrategy);
        ride.calcFare();

        passenger.notify("Ride schedued with fare + Rs"+ride.getFare());
        availedDriver.notify("You have a new ride request for "+ride.getFare());

        //update the status ongoing
        ride.updateStatus(RideStatus.ONGOING);

        //update the status completed
        ride.updateStatus(RideStatus.COMPLETED);
        driverList.add(availedDriver);
        return;
    }

    public Driver fetchTheNewarestDriver(Passenger passenger) {

        Driver assignedDriver = null;
        double minDist = Integer.MAX_VALUE;

        for (Driver d : driverList) {

            double dist = d.getLocation().calcDistance(passenger.getLocation());
            if (minDist > dist) {
                minDist = dist;
                assignedDriver = d;
            }
        }

        return assignedDriver;

    }
}
