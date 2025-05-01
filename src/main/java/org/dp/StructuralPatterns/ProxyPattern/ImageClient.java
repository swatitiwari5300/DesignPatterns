package org.dp.StructuralPatterns.ProxyPattern;

public class ImageClient {

    public static void main(String[] args) {

        Image image = new ProxyImage("dog.png");
        Image image1 = new ProxyImage("cat.png");

        image.display();

    }
}
