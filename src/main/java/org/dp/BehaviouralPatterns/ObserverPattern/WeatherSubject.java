package org.dp.BehaviouralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject  implements Subject{

    String temp;
    List<Observer> observerList;

    public WeatherSubject() {
        this.observerList = new ArrayList<>();
    }



    @Override
    public void notifyObserver() {
        observerList.forEach(o -> o.display(this.temp));
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void setTemp(String temp) {
        this.temp = temp;
        notifyObserver();
    }
}
