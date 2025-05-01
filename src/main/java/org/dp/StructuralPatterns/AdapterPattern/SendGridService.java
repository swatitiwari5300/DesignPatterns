package org.dp.StructuralPatterns.AdapterPattern;

public class SendGridService {
    
    public void sendEmail(String recipient, String title, String body){
        System.out.println("Email notification service");
        System.out.println("Receiver: "+ recipient);
        System.out.println("Subject: "+ title);
        System.out.println("Body: "+body);
    }
}
