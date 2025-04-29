package org.dp.CreationalPatterns.SingletonPattern;

public class SingletonClient {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println("The references of these object is identical?: "+ singleton1.equals(singleton));
    }
}
