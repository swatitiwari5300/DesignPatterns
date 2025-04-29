package org.dp.BehaviouralPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatInterface{

    private List<ChatUser> chatUserList = new ArrayList<>();

    @Override
    public void addUsers(ChatUser chatUser) {
        chatUserList.add(chatUser);
    }

    @Override
    public void sendMessage(ChatUser sender, String message) {
        chatUserList.stream().filter(s -> !s.equals(sender)).forEach(s -> s.receiveMessage(sender, s, message));
    }
}
