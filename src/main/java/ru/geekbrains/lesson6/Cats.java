package ru.geekbrains.lesson6;

public class Cats extends Animals {
    private static int counterCat=0;
    public Cats() {
        super();
        counterCat++;
        counter++;
    }
    public Cats(String name) {
        super(name);
        counterCat++;
        counter++;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 200) {
            String heshe = (checkName(this.name)) ? " пробежал " : " пробежала ";
            System.out.println(this.getName() + heshe + distance + " " + checkDist(distance) + ".");
        }
        else
            System.out.println("Котик очень устал");
    }
    @Override
    public void swim(int distance) {
        System.out.println("В этой вселенной котики не плавают!");
    }

    @Override
    public void isCount() {
        System.out.printf("Всего котиков: %d\nВсего животных: %d\n",counterCat,counter);
    }
}
