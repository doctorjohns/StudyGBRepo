package ru.geekbrains2.lesson5;

public class MainAppLess5 {
    private static final int SIZE = 10000000;
    private static final int HALF = SIZE / 2;

    public static void main(String[] args) throws InterruptedException {

        float[] arr = new float[SIZE];

        long startTime = System.currentTimeMillis();
        method1(arr);
        System.out.println("Время выполения в 1 потоке :  " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        method2(arr);
        System.out.println("Время выполения в 2 потоках :  " + (System.currentTimeMillis() - startTime));

    }
    static void method1(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1f;
        }
        fillArray(arr);
    }
    static void method2(float[] arr) throws InterruptedException {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1f;
        }
        float[] part1 = new float[HALF];
        float[] part2 = new float[HALF];
        System.arraycopy(arr,0,part1, 0,HALF);
        System.arraycopy(arr,HALF,part2, 0,HALF);
        Thread thread1 = new Thread(() -> {
            fillArray(part1);
        });
        Thread thread2 = new Thread(() -> {
            fillArray(part2);
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
    static void fillArray(float[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5f) * Math.cos(0.2f + i / 5f) * Math.cos(0.4f + i/2f));
        }
    }

}

