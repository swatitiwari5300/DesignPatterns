package org.dp.BehaviouralPatterns.MediatorPattern;


public interface ChatInterface {

    void addUsers(ChatUser chatUser);
    void sendMessage(ChatUser sender, String message);
}
