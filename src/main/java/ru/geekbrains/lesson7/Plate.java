package ru.geekbrains.lesson7;

public class Plate {
    private int food=0;

    public void addFood (int food) {
        if (food > 0) this.food += food;
        else System.out.println("Мы здесь накладываем еду на тарелку, а не забираем)");
    }
    public int getFood() {
        return food;
    }
    public void decreaseFood(int food) {
        if (this.food-food > 0) this.food -= food;
        else System.out.println("Прежде чем что-то съесть, нужно что-то наложить");
    }

}
