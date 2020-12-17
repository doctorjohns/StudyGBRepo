package ru.geekbrains2.lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

        Thread t1 = new Thread( () -> {
            try {
                while (true) {
                    String newMessage = dataInputStream.readUTF();
                    System.out.println("Клиент: " + newMessage);
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

