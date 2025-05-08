package org.dp.RideSharingProblemStatement;

public abstract class Vehicle {

    private String numberPlate;

    public Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public abstract double calcFair();
}
