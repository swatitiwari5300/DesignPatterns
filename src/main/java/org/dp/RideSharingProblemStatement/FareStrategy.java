package org.dp.RideSharingProblemStatement;

public interface FareStrategy {

    double calcFare(Vehicle vehicle, double distance);
}

class StandardStrategy implements FareStrategy{

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.calcFair()*distance;
    }
}

class SharedStrategy implements FareStrategy{

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.calcFair()*distance*0.5;
    }
}

class LuxuryStrategy implements FareStrategy{

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.calcFair()*distance*1.5;
    }
}
