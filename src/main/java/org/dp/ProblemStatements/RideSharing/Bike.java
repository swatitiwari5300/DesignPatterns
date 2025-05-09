package org.dp.ProblemStatements.RideSharing;

public class Bike extends Vehicle{
    public Bike(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public double calcFair() {
        return 10;
    }
}
