package ru.geekbrains2.lesson3;

public class Task2Less3 {
    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();
        pb.add( "89262362452","Копытцев");
        pb.add( "196","Копытцев");
        pb.add("89266541078","Иванов");
        pb.add("89267236567","Хорстманн");
        pb.add("192","Иванов");
        pb.add("89260264563","Страуструп");
        pb.add("89266234567","Сикорский");
        pb.add("89260294567","Сидоров");
        pb.add("89260294567","Сидоров");
        pb.add("89291294567","Дункан");



        pb.get("Копытцев");
        pb.get("Дункан");


    }
}
