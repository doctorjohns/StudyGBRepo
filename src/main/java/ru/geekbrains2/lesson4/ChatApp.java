package ru.geekbrains2.lesson4;

import javax.swing.*;
import java.awt.*;

public class ChatApp extends JFrame {
    public ChatApp() {
        setTitle ("ChatRoom");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,100,600,800);


        JTextArea chatText = new JTextArea();
        chatText.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(chatText);
        add(scrollPane, BorderLayout.CENTER);

        JTextField userText = new JTextField();
        userText.setColumns(2);

        JButton sendText = new JButton();
        sendText.setText("Отправить");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
        panel.add(userText);
        panel.add(sendText);
        add(panel,BorderLayout.SOUTH);

        sendText.addActionListener(e -> {
            chatText.append(userText.getText()+"\n");
            userText.setText("");
        });
        userText.addActionListener(e -> {
            chatText.append(userText.getText()+"\n");
            userText.setText("");
        });
        setVisible(true);
    }
}
