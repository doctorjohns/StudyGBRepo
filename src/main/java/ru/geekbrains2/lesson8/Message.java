package ru.geekbrains2.lesson8;

public class Message {
    Client client;
    String text;

    public Message(Client client, String text) {
        this.client = client;
        this.text = text;
    }
}
