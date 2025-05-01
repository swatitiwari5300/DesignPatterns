package org.dp.StructuralPatterns.AdapterPattern;

public class EmailNotification implements Notification {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Email notification service");
        System.out.println("Receiver: "+ to);
        System.out.println("Subject: "+subject);
        System.out.println("Body: "+body);
    }
}
