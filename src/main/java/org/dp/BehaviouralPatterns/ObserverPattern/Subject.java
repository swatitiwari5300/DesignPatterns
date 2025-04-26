package org.dp.BehaviouralPatterns.ObserverPattern;

public interface Subject {

    void notifyObserver();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
