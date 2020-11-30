package ru.geekbrains2.lesson1;

public class Cat implements Abilities {
    private final static int MAX_DISTANCE = 300;
    private final static double MAX_HIGH = 1.7;
    private String name;
    private int distance;
    private double high;


    Cat() {
       this.name="Безымянный";
       this.distance = MAX_DISTANCE;
       this.high = MAX_HIGH;

    }
    Cat(String name) {
        this();
        this.name=name;
    }
    Cat(String name,int dist, double high) {
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

    @Override
    public void run() {
        System.out.println(this.name + " бежит");
    }
    @Override
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
