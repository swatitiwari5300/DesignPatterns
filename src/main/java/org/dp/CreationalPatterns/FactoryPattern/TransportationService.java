package org.dp.CreationalPatterns.FactoryPattern;

public class TransportationService {

    public static void main(String[] args) {

        Transport transport = TransportFactory.getTransport("bus");
        transport.deliver();

    }
}
