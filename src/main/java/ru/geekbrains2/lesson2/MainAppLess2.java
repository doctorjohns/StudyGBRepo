package ru.geekbrains2.lesson2;

import java.util.Arrays;

import static java.lang.Math.random;

public class MainAppLess2 {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String []a = {
                "1","2","3","4","5","6","7","8","9",
                "0","q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        String [][]m = new String [4][4];

        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i].length ; j++) {
                m[i][j] = a[(int)(Math.random()*a.length)];
            }
        }

        getArray(m);

    }

    public static void getArray(String[][] m) throws MyArraySizeException,MyArrayDataException{
        if (m.length != 4) throw new MyArraySizeException("Массив должен быть 4x4");
        for (int i = 0; i < m.length ; i++) {
            if (m[i].length != 4) throw new MyArraySizeException("Массив должен быть 4x4");
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                
            }
        }
        //System.out.println("ура!!!! передан шикарный массив");

    }


}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}




