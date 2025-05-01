package org.dp.StructuralPatterns.AdapterPattern;

public interface Notification {

    void send(String to, String subject, String body);
}
