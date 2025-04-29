package org.dp.BehaviouralPatterns.StatePattern;

public class Walking implements State{
    @Override
    public int getETA() {
        System.out.println("The ETA for WALKING is 15 hours");
        return 15;
    }

    @Override
    public String getDirection() {
        return "Walk straight and the take left from the T point";
    }
}
