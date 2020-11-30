package ru.geekbrains2.lesson1;

public class Robot implements Abilities{
    private final static int MAX_DISTANCE = 3000;
    private final static double MAX_HIGH = 2.0;
    private String name;
    private int distance;
    private double high;


    Robot () {
        this.name = "Безымянный";
        this.distance = MAX_DISTANCE;
        this.high = MAX_HIGH;

    }
    Robot (String name) {
        this.name = name;
    }
    Robot (String name, int dist, double high) {
        this(name);
        this.distance = dist;
        this.high = high;
    }

    public String getName () {
        return this.name;
    }
    @Override
    public void run() {
        System.out.println(this.name + " бежит");
    }
    public void jump() {
        System.out.println(this.name + " прыгает");
    }
    public int getDistance() {
        return this.distance;
    }
    public double getHigh() {
        return this.high;
    }
    @Override
    public int canRun() {
        return getDistance();
    }
    @Override
    public double canJump() {
        return getHigh();
    }

}
