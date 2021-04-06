package lesson2.homework;

import java.util.Arrays;
import java.util.Random;

public class Task3and4 {
    /*
        Задание 2.3
        Создайте массив размером 400 элементов.
        Выполните сортировку с помощью метода sort().
        Оцените сортировку с помощью базового класса System.nanoTime().
     */

    public static void main(String[] args) {
        int[] mArray = new int[400];

        Random rand = new Random();
        for (int i = 0; i < mArray.length; i++) {
            mArray[i] = rand.nextInt(400);
        }

        System.out.println(Arrays.toString(mArray));

        long start = System.nanoTime();
        Arrays.sort(mArray);
        long finish = System.nanoTime();
        System.out.println("Прошло: " + (finish - start) + " нс");

        System.out.println(Arrays.toString(mArray));

    /*
        Задание 2.4
        На основе существующего массива данных из задания 2.3 реализуйте
        алгоритм сортировки пузырьком.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните время выполнения алгоритмы сортировки методом sort() из
        задания 2.1 и сортировку пузырьком.
    */


    }
}
