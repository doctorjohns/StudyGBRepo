package ru.geekbrains2.lesson2;

import com.sun.javafx.binding.StringFormatter;

public class MainAppLess2 {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[] a = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "q"};
        String[][] m = new String[4][4];

        //заполняю массив рандомными значениями из массива а
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = a[(int) (Math.random() * a.length)];
            }
        }
        //смотрим размерность массива
        getArray(m);
        //считаем сумму всех членов массива
        int sumA = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                try {
                    sumA += Integer.parseInt(m[i][j]);
                } catch (RuntimeException e) {
                    throw new MyArrayDataException(String.format("\nВ массиве по координатам %d %d лежит не int! Ты не пройдешь!",i,j));
                }
            }
        }
        System.out.printf("Сумма всех членов массива = %d",sumA);

    }
    //проверяем размер массива
    public static void getArray(String[][] m) throws MyArraySizeException {
        if (m.length != 4) throw new MyArraySizeException("Разрешен массив только размером 4x4");
        for (int i = 0; i < m.length; i++) {
            if (m[i].length != 4) throw new MyArraySizeException("Разрешен массив только размером 4x4");
        }
    }
}
//мои эксепшены
class MyArraySizeException extends Exception{
    public MyArraySizeException(String message) {
        super(message);
    }
}
class MyArrayDataException extends Exception{
    public MyArrayDataException(String message) {
        super(message);
    }

}

