package ru.geekbrains.lesson3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        //Задание 2. * Создать массив из слов
        //String[]  words  =  {"apple",  "orange",  "lemon",  "banana",  "apricot",  "avocado",  "broccoli",  "carrot",
        //"cherry",  "garlic",  "grape",  "melon",  "leak",  "kiwi",  "mango",  "mushroom",  "nut",  "olive",  "pea",
        //"peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
        //При  запуске  программы  компьютер  загадывает  слово,  запрашивает  ответ  у  пользователя,
        //сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если
        //слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно можно пользоваться:
        //String str = "apple";
        //char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово.
        //Используем только маленькие буквы.
        String[]  words  =  {"apple",  "orange",  "lemon",  "banana",  "apricot",  "avocado",  "broccoli",  "carrot",
                "cherry",  "garlic",  "grape",  "melon",  "leak",  "kiwi",  "mango",  "mushroom",  "nut",  "olive",  "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rnd = new Random();
        String wordX = words[rnd.nextInt(words.length)];
        Scanner sc = new Scanner(System.in);
        String wordUser="";
        char[] wordPrint = {
          '#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'
        };


        while (true) {
            System.out.println("Какое слово я загадал?");
            wordUser = sc.nextLine();
            if (wordX.equals(wordUser)) {
                System.out.printf("Слово угадано! %s\n", wordX);
                break;
            }
            for (int i = 0; i < wordX.length(); i++) {
                if (i < wordUser.length() && wordX.charAt(i)==wordUser.charAt(i)) {
                    wordPrint[i] = wordX.charAt(i);
                }
            }
            System.out.printf("Вы угадали буквы: %s",Arrays.toString(wordPrint));


        }

    }
}
