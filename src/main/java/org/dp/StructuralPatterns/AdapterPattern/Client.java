package org.dp.StructuralPatterns.AdapterPattern;

public class Client {

    public static void main(String[] args) {
        Notification notification = new AdapterService(new SendGridService());
        notification.send("swatitiwari@yaho.com", "Design pattern concepts", "Learn more..");
    }
}
