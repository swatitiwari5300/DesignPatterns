package org.dp.BehaviouralPatterns.StatePattern;

public class DirectionClient {

    public static void main(String[] args) {

        DirectionService directionService = new DirectionService(new Walking());
        directionService.getETA();
        directionService.getDirection();

        directionService.setState(new Car());
        directionService.getETA();
        directionService.getDirection();

    }
}
