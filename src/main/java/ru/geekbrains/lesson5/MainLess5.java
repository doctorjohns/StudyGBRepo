package ru.geekbrains.lesson5;

public class MainLess5 {
    public static void main(String[] args) {
        Person []persons = new Person[5];
        persons[0] = new Person("Андрей Иванов","Разносчик кофе","andrey@mail.ru",324,50000,25);
        persons[1] = new Person("Василий Пупкин","Босс","vasya@mail.ru",301,300000,42);
        persons[2] = new Person("Алена Рихтер","Секретарь","alena@mail.ru",300,45000,20);
        persons[3] = new Person("Александр Вишенка","Системный администратор","admin@mail.ru",305,60000,37);
        persons[4] = new Person("Иван Приблуда","Главный по тарелочкам","ivan@mail.ru",333,150000,48);

        for (Person p:persons) {
            if (p.getAge()>40) p.toPrint();
        }
    }
}
