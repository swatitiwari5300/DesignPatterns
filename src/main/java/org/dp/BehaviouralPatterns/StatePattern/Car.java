package org.dp.BehaviouralPatterns.StatePattern;

public class Car implements State{
    @Override
    public int getETA() {

        System.out.println("the ETA for CAR is 5 hours");
        return 5;
    }

    @Override
    public String getDirection() {
        return "Take the first right turn then the first left turn";
    }
}
