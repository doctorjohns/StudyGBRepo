package ru.geekbrains2.lesson1;

public class Track implements Obstacles{
    private int len;

    Track (int len) {
        this.len = len;
    }
    public int getLength() {
        return this.len;
    }
    @Override
    public boolean isObstacle(Abilities a) {
        if (this.len < a.canRun()) return true;
        return false;

    }



}
