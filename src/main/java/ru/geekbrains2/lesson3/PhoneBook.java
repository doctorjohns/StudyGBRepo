package ru.geekbrains2.lesson3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> telBook = new HashMap<>();

    PhoneBook() {

    }

    public void add(String phone, String name) {
        if (telBook.containsKey(phone))
            System.out.println("Телефон " + phone + " уже есть в базе, не добавлен!");
        else
            telBook.put(phone, name);
    }

    public void get(String name) {
        for (Map.Entry<String,String> o : telBook.entrySet()) {
            if (o.getValue() == name)
                System.out.println(o.getValue() + " : " + o.getKey());
        }
    }
}
