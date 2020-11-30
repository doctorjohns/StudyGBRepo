package ru.geekbrains2.lesson1;

public class People implements Abilities {
    private final static int MAX_DISTANCE = 1500;
    private final static double MAX_HIGH = 1.5;

    private String name;
    private int distance;
    private double high;


    People() {
        this.name = "Безымянный";
    }
    People(String name) {
        this.name = name;
        this.distance = MAX_DISTANCE;
        this.high = MAX_HIGH;
    }
    People(String name, int dist, double high) {
        this(name);
        this.distance = dist;
        this.high = high;
    }
    public String getName() {
        return this.name;
    }
    public int getDistance() {
        return this.distance;
    }
    public double getHigh() {
        return this.high;
    }
    public void run() {
        System.out.println(this.name + " бежит");
    }
    public void jump() {
        System.out.println(this.name + " прыгает");
    }
    @Override
    public int canRun() {
        return this.getDistance();
    }
    @Override
    public double canJump() {
        return this.getHigh();
    }


}
