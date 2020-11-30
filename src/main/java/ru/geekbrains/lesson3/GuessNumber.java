package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //Задание 1.  Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
        //попытки  угадать  это  число.  При  каждой  попытке  компьютер  должен  сообщить,  больше  ли
        //указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
        //выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        int userX = 0;
        while (true) {
            int x = rnd.nextInt(10);
            for (int i = 1; i < 4; i++) {
                System.out.printf("Введите число от 0 до 9. Попытка №%d\n",i);
                userX = sc.nextInt();
                if (userX > x)
                    System.out.println("Введенное число больше загаданного");
                else if (userX < x)
                    System.out.println("Введенное число меньше загаданного");
                else {
                    System.out.println("Число угадано!!!");
                    break;
                }
            }
            System.out.println("Хотите сыграть еще раз? 1 - да / 0 - нет");
            userX = sc.nextInt();
            if (userX == 0)
                break;
        }
    }
}
