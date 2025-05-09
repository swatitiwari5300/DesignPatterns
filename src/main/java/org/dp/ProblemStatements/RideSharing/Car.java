package org.dp.ProblemStatements.RideSharing;

public class Car extends Vehicle{

    public Car(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public double calcFair() {
        return 20;
    }
}
