package ru.geekbrains.lesson5;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Person() {
        this.fullName = "Неизвестый";
        this.position = "Безработный";
        this.email = "нет";
        this.phone = 0;
        this.salary = 0;
        this.age = 0;
    }
    public Person (String fullName) {
        this.fullName = fullName;
    }
    public Person (String fullName, String position) {
        this(fullName);
        this.position = position;
    }
    public Person (String fullName, String position, String email) {
        this(fullName,position);
        this.email = email;
    }
    public Person (String fullName, String position, String email, int phone) {
        this(fullName,position,email);
        this.phone = phone;
    }
    public Person (String fullName, String position, String email, int phone, int salary) {
        this(fullName,position,email, phone);
        this.salary = salary;
    }
    public Person (String fullName, String position, String email, int phone, int salary, int age) {
        this(fullName,position,email, phone, salary);
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void toPrint() {
        System.out.println(this.toString());
    }
    String breakLine = "-------------------";
    @Override
    public String toString() {
        return String.format("%s\nИмя: %s\nДолжость: %s\nЕмейл: %s\nТелефон: %d\nЗарпалата: %d\nВозраст: %d\n",
                breakLine,this.fullName,this.position,this.email,this.phone,this.salary,this.age);
    }
}
