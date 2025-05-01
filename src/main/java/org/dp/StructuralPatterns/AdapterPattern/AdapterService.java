package org.dp.StructuralPatterns.AdapterPattern;

public class AdapterService implements Notification{

    SendGridService sendGridService;

    public AdapterService(SendGridService sendGridService) {
        this.sendGridService = sendGridService;
    }

    @Override
    public void send(String to, String subject, String body) {
        sendGridService.sendEmail(to,subject,body);
    }
}
