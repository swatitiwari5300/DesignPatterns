package org.dp.CreationalPatterns.FactoryPattern;

public class TransportFactory {

    public static Transport getTransport(String type){
        switch (type){
            case "bus":
                return new Bus();
            case "bike":
                return new Bike();
            case "car":
                return new Car();
            default:
                throw new IllegalArgumentException();
        }
    }
}
