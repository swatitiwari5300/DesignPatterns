package org.dp.BehaviouralPatterns.MediatorPattern;

import java.util.ArrayList;

public class ChatClient {

    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();
        ChatUser c1 = new ChatUser("Amit", chatRoom);
        ChatUser c2 = new ChatUser("Meena", chatRoom);
        ChatUser c3 = new ChatUser("Arun", chatRoom);

        chatRoom.addUsers(c1);
        chatRoom.addUsers(c2);
        chatRoom.addUsers(c3);

        c1.sendMessage("Hello guys!");

    }
}
