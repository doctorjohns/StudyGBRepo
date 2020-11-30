package ru.geekbrains.lesson6;

public class MainLess6 {
    public static void main(String[] args) {
        Animals cat1 = new Cats("Барсик");
        Animals cat2 = new Cats("Чучундра");
        Animals cat3 = new Cats("Пуфик");
        Animals dog1 = new Dogs("Фуксик");
        Animals dog2 = new Dogs("Фасолька");

        dog1.run(1000);
        dog2.swim(5);
        cat1.swim(100);
        cat2.run(12);
        cat3.run(200);

        cat2.isCount();
        dog1.isCount();

    }

}
