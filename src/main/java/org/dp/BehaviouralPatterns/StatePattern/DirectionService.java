package org.dp.BehaviouralPatterns.StatePattern;

public class DirectionService {

    State state;


    public DirectionService(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void getETA(){
        state.getETA();
    }

    public void getDirection(){
        System.out.println(state.getDirection());
    }
}
