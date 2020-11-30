package ru.geekbrains.lesson7;

import java.util.Scanner;

public class Cats {

    private String name;
    private boolean appetite;
    private Scanner sc = new Scanner(System.in);


    public Cats () {
        this.name = "Безымянный";
        this.appetite = false;
    }
    public Cats(String name) {
        this();
        this.name = name;
    }
    public void eat(Plate plate, int portion) {
        int addFoodQuest=0, addFoodQuantity;
        boolean checkPlate=false;
        if (plate.getFood()-portion > 0) checkPlate = true;
        else {
            System.out.printf("На тарелке не хватает еды, там осталось: %s\n",plate.getFood());
            System.out.println("Хотите пополнить тарелку? 1-ДА/2-НЕТ");
            addFoodQuest = sc.nextInt();
            if (addFoodQuest == 1) {
                System.out.println("Сколько добавим в тарелку?");
                addFoodQuantity = sc.nextInt();
                plate.addFood(addFoodQuantity);
                if (plate.getFood()-portion > 0) checkPlate = true;
            } else System.out.println("Хорошо, но помни, что котик остался голодный!");
        }
        if (checkPlate == true) {
            plate.decreaseFood(portion);
            this.appetite = true;
            System.out.printf("Котик по имени: %s поел, он съел: %s, на тарелке осталось: %s\n",this.name, portion,plate.getFood());
        }
    }

    @Override
    public String toString() {
        return this.name + " " + (this.appetite ? "сытый" : "голодный");
    }
}
