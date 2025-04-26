package org.dp.BehaviouralPatterns.ObserverPattern;

public class WeatherClient {

    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        MobileObserver mobileObserver = new MobileObserver();
        TVObserver tvObserver = new TVObserver("Samsung TV");

        weatherSubject.addObserver(mobileObserver);
        weatherSubject.addObserver(tvObserver);

        weatherSubject.setTemp("23");
    }
}
