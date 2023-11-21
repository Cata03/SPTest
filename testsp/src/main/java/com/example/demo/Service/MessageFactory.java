package com.example.demo;

public class MessageFactory {
    public static Message createMessage(String content) {
        return new Message(content);
    }
}
