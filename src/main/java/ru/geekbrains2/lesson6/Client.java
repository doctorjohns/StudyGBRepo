package ru.geekbrains2.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 8080);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

        Thread t1 = new Thread( () -> {
            try {
                while (true) {
                    String newMessage = dataInputStream.readUTF();
                    System.out.println("Сервер: " + newMessage);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Scanner sc = new Scanner(System.in);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        Thread t2 = new Thread( () -> {
            try {
                while (true) {
                    String newMessage = sc.nextLine();
                    dataOutputStream.writeUTF(newMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }
}
