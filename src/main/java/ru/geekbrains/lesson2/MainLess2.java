package ru.geekbrains.lesson2;

import java.util.Arrays;

public class MainLess2 {
    public static void main(String[] args) {
        // Задание1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        {
            int[] m = {
                    1, 1, 0, 0, 1, 0, 1, 1, 0, 0
            };
            for (int i = 0; i < m.length; i++) {
                if (m[i] == 0)
                    m[i] = 1;
                else
                    m[i] = 0;
            }
            System.out.printf("Задание 1. %s\n",Arrays.toString(m));
        }
        //Задание2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        {
            int j = 0;
            int[] m = new int[8];
            for (int i = 0; i <= 21; i=i+3) {
                m[j] = i;
                j++;
            }
            System.out.printf("Задание 2. %s\n",Arrays.toString(m));
        }
        //Задание3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        {
            int[]m = {
                    1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1
            };
            for (int i = 0; i < m.length; i++) {
                if (m[i] < 6)
                    m[i] *= 2;
            }
            System.out.printf("Задание 3. %s\n",Arrays.toString(m));
        }
        //Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        {
            int[][]m =new int[5][5];
            int x=1;
            for (int i = 0; i < m.length ; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (i == j)
                        m[i][j] = 1;
                }
                m[i][m.length-x] = 1;
                x++;
            }
            // Здесь вопрос? На сколько адекватное решение.. вот так несколько методов .replace использовать?
            System.out.printf("Задание 4.\n %s\n",Arrays.deepToString(m).replace("],","]\n").replace("[[","[").replace("]]","]"));

        }
        //Задание 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы.
        {
            int []m = new int[10];
            for (int i = 0; i < m.length; i++) {
                m[i] = (int) (Math.random() * 100);
            }
            int max = m[0];
            int min = m[0];

            for (int i = 1; i < m.length; i++) {
                if (m[i] > max)
                    max = m[i];
                else if (m[i] < min)
                    min = m[i];
            }
            System.out.printf("Задание 5. Массив: %s Минимум: %d, Максимум %d\n",Arrays.toString(m),min,max);

        }
        //Задание 6. Написать метод, в который передается не пустой одномерный целочисленный массив,
        //метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
        //массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, ||
        //2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        {
            int []m = {
                    2,2,2,1,2,2,10,1
            };
            int []m2 = {
                    1,1,1,2,1
            };
            int []mBad = {
                    2,2,2,5,6,7,8,9
            };
            System.out.printf("Задание 6. Левая и правая части массива равны? - %s\n",checkBalance(m));
        }
        // Задание 7. Написать метод, которому на вход подается одномерный массив и число n (может быть
        //положительным,  или  отрицательным),  при  этом  метод  должен  сместить  все  элементы
        //массива  на  n  позиций.  Элементы  смещаются  циклично.  Для  усложнения  задачи  нельзя
        //пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) ->
        //[ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг
        //можете выбирать сами.
        {
            int []m = {
                    1,2,3
            };
            int n=1;
            System.out.printf("Задание 7. \nМассив: %s\nСмещение: %d\n", Arrays.toString(m),n);
            moveArray(n,m);
            System.out.printf("Результат: %s\n",Arrays.toString(m));
        }
    }
    private static boolean checkBalance(int[] m)
    {
        int sum1=0;
        int sum2=0;

        for (int i = 0; i < m.length; i++) {
            for (int k = 0; k < (m.length-i); k++) {
                sum1 += m[k];
            }
            for (int j = m.length-1;j > (m.length-1-i) ; j--) {
                sum2 +=m[j];
            }
            if (sum1 == sum2)
                return true;
            sum1 = 0;
            sum2 = 0;
        }
        return false;
    }


    private static void moveArray(int n, int []m) {
        int tmp;
        for (int i = 0; i < m.length; i++) {

            tmp = m[i+n];
            m[i+n] = m[n];
            m[n] = tmp;
        }
    }


}
