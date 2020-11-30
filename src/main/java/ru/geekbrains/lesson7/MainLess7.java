package ru.geekbrains.lesson7;

import java.util.Random;

public class MainLess7 {
    public static void main(String[] args) {
        final int CATS_APPETITE = 15; // максимально разрешенная порция для котика
        Random rnd = new Random();

        Cats []cats = new Cats[5];
        cats[0] = new Cats("Шарфик");
        cats[1] = new Cats("Кот в сапогах");
        cats[2] = new Cats("Маркиз");
        cats[3] = new Cats("Коткомпот");
        cats[4] = new Cats("Барсик");

        Plate plate = new Plate();
        plate.addFood(50);

        for (Cats c: cats) c.eat(plate,rnd.nextInt(CATS_APPETITE)+1);
        System.out.println();
        for (Cats c: cats) System.out.println(c.toString());

    }
}
