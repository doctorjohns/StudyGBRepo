package ru.geekbrains.lesson6;

public class Dogs extends Animals {
    private static int counterDogs=0;
    public Dogs() {
        super();
        counterDogs++;
        counter++;
    }
    public Dogs(String name) {
        super(name);
        counterDogs++;
        counter++;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 500) {
            String heshe = (checkName(this.name)) ? " пробежал " : " пробежала ";
            System.out.println(this.getName() + heshe + distance + " " + checkDist(distance) + ".");
        }

        else
            System.out.println("Песик очень устал");
    }
    @Override
    public void swim(int distance) {
        if (distance > 0 && distance <= 10) {
            String heshe = (checkName(this.name)) ? " проплыл " : " проплыла ";
            System.out.println(this.getName() + heshe + distance + " " + checkDist(distance) + ".");
        }

        else
            System.out.println("Песик очень устал");
    }
    @Override
    public void isCount() {
        System.out.printf("Всего собак: %d\nВсего животных: %d\n",counterDogs,counter);
    }
}
