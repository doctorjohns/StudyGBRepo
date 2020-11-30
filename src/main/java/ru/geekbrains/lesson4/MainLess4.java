package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainLess4 {
    public static final int SIZE = 5;
    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = '0';
    public static char [][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rnd = new Random();

    // над логикой AI и проверкой коротких диагоналей, если можно, еще подумаю, с этим пока не справился, не выходит пока каменный цветок)


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            turnUser();
            printMap();
            if (checkWin (CROSS)) {
                System.out.println("Выиграл человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            turnAI();
            printMap();
            if (checkWin (ZERO)) {
                System.out.println("Выиграл робот");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Game over");
    }

    private static boolean checkWin(char tictac) {
        int counterG = 0;
        int counterV = 0;



        for (int i = 0; i < SIZE; i++) {
            counterG = 0;
            counterV = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == tictac) counterG++;
                else counterG = 0;
                if (map[j][i] == tictac) counterV++;
                else counterV = 0;
                if (counterG > 3 || counterV > 3) return true;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == tictac) counterG++;
            else counterG = 0;
            if (map[i][SIZE - 1 - i] == tictac) counterV++;
            else counterV = 0;
            if (counterG > 3 || counterV > 3) return true;
        }


        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY)
                    return false;
            }
        }
        return true;
    }

    private static void turnAI() {
        int x,y;
        do {
            x = rnd.nextInt(SIZE);
            y = rnd.nextInt(SIZE);
        } while (!isCellValid(x,y));
        System.out.println("Робот сходил сюда: " + (x+1) + " " + (y+1));
        map[x][y] = ZERO;
    }

    private static void turnUser() {
        int x,y;
        do {
            System.out.println("Ваш ход в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x,y));
        map[x][y] = CROSS;

    }

    private static boolean isCellValid(int x, int y) {
        if (x<0 || x >= SIZE || y < 0 || y >= SIZE)
            return false;
        if (map[x][y] == EMPTY) return true;
        return false;
    }

    public static void initMap () {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY;
            }
        }
    }
    public static void printMap () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + map[i][j]);
            }
            System.out.println();
        }
    }
}
