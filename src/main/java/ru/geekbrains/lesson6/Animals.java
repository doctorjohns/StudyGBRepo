package ru.geekbrains.lesson6;

public abstract class Animals {
    protected String name;
    protected static int counter=0;
    protected Animals() {
        this.name = "Безымянный";
        counter++;
    }
    protected Animals(String name) {
        this.name = name;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
    public abstract void isCount ();

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }
    protected boolean checkName (String name)  {
        char x = name.trim().toLowerCase().charAt(name.length()-1);
        return (x == 'а') ? false : true;
    }
    protected String checkDist (int distance) {
        if (distance == 111) return "метров";
        if (distance == 1 || (distance) % 10 == 1) return "метр";
        if (distance > 1 && distance < 4 || distance % 10 > 1 && distance % 10 < 4 ) return  "метра";
        return "метров";
    }
}

