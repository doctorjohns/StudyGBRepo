package ru.geekbrains.lesson1;

public class MainLess1 {
    public static void main(String[] args) {
        // Задание 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte b  = 8;
        short s = 300;
        int n = 1;
        long l = -44444;
        float f = 2.5f;
        double d = 2.1;
        char ch = 'c';
        boolean bool = true;

        System.out.println(Mathematics(12,33,5,8));
        System.out.println(Range(12,4));
        CheckPlusMinus(-4);
        System.out.println(CheckMinus(-5));
        PrintHello("Валера");
        WhatYear(2200);
    }
    // Задание 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int Mathematics(int a, int b, int c, int d){
        return a * (b+ (c / d));
    }

    // Задание 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;
    public static boolean Range (int a, int b){
        if ((a + b > 10) && (a + b <= 20))
            return true;
        else
            return false;
    }
    // Задание 5.  Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали,
    // или отрицательное; Замечание: ноль считаем положительным числом.
    public static void CheckPlusMinus (int a) {
        if (a >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }
    // Задание 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static  boolean CheckMinus (int a) {
        if (a < 0)
            return true;
        return false;
    }
    // Задание 7.  Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void PrintHello (String s) {
        System.out.println("Привет, " + s);
    }
    // Задание 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void WhatYear (int a) {
        if (a % 400 == 0)
            System.out.println("Год високосный");
        else if (a % 100 == 0)
            System.out.println("Год не високосный");
        else if (a % 4 == 0)
            System.out.println("Год високосный");
        else
            System.out.println("Год не високосный");
    }
}

