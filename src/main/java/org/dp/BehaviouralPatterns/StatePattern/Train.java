package org.dp.BehaviouralPatterns.StatePattern;

public class Train implements State{
    @Override
    public int getETA() {
        System.out.println("The ETA for TRAIN is 3 hours");
        return 3;
    }

    @Override
    public String getDirection() {
        return "The train fill follow the railway track";
    }
}
