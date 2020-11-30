package ru.geekbrains2.lesson1;

public class Wall implements Obstacles{
    private double high;

    Wall(double h) {
        this.high = h;
    }
    public double getHigh() {
        return this.high;
    }
    @Override
    public boolean isObstacle(Abilities a) {
        if (this.high < a.canJump()) return true;
        return false;
    }
}
