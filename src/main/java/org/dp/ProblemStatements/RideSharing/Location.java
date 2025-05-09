package org.dp.ProblemStatements.RideSharing;

public class Location {

    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double calcDistance(Location loc2){
        double x1 = this.latitude - loc2.getLatitude();
        double x2 = this.longitude - loc2.getLongitude();

        return Math.sqrt(x1*x1 - x2*x2);
    }
}
