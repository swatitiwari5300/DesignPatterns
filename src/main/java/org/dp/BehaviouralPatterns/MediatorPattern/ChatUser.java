package org.dp.BehaviouralPatterns.MediatorPattern;

public class ChatUser {

    private String name;
    private ChatRoom chatRoom;

    public ChatUser(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String msg){
        chatRoom.sendMessage(this, msg);
    }

    public void receiveMessage(ChatUser sender, ChatUser receiver, String message){
        System.out.println(sender.name+ " has messaged: "+ message + " to "+ receiver.name);
    }
}
