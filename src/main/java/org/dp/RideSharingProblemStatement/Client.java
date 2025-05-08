package org.dp.RideSharingProblemStatement;

public class Client {

    public static void main(String[] args) {
        Location loc1 = new Location(12.9716, 77.5946);  // Bangalore
        Location loc2 = new Location(12.9352, 77.6245);  // Near Bangalore
        Location loc3 = new Location(13.0352, 77.6175);  // Another place near Bangalore

        Vehicle car = new Car("AB123CD");
        Vehicle bike = new Bike("XY987Z");

        Driver driver1 = new Driver("Alice", "alice@rideshare.com", loc2, car);
        Driver driver2 = new Driver("Bob", "bob@rideshare.com", loc3, bike);

        Passenger passenger1 = new Passenger("John", "john@rideshare.com", loc1);


        RideSharingService rideMatchingSystem = new RideSharingService();
        rideMatchingSystem.addDriver(driver1);
        rideMatchingSystem.addDriver(driver2);

        rideMatchingSystem.requestRide(passenger1, 10, new SharedStrategy());
    }


}
