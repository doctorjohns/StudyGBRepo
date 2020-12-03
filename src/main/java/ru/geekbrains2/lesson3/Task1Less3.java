package ru.geekbrains2.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task1Less3 {
    public static void main(String[] args) {
        ArrayList <String> vendors = new ArrayList<>();
        vendors.add("D-Link");
        vendors.add("Cisco");
        vendors.add("Mikrotik");
        vendors.add("Huawei");
        vendors.add("Asus");
        vendors.add("D-Link");
        vendors.add("Mikrotik");
        vendors.add("Cisco");
        vendors.add("Cisco");
        vendors.add("HP");
        vendors.add("ZyXEL");
        vendors.add("Mikrotik");
        vendors.add("LinkSys");
        vendors.add("NetGear");
        vendors.trimToSize(); // вопрос... я так понял если массив не будет менять размер.. лучше делать так? для оптимизации

        System.out.println("Массив: " + vendors.toString());
        Set<String> unique = new HashSet<>(vendors);
        System.out.println("Уникальные вендоры в массиве: " + unique.toString());
        for (String u :unique) {
            System.out.println(u + " встречается " + Collections.frequency(vendors,u) + " раз/а");
        }




    }
}
