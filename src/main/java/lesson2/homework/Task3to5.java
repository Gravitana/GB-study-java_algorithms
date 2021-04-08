package lesson2.homework;

import java.util.Arrays;
import java.util.Random;

public class Task3to5 {
    /*
        Задание 2.3
        Создайте массив размером 400 элементов.
        Выполните сортировку с помощью метода sort().
        Оцените сортировку с помощью базового класса System.nanoTime().
     */

    public static void main(String[] args) {
        int[] mArrayOriginal = new int[400];

        Random rand = new Random();
        for (int i = 0; i < mArrayOriginal.length; i++) {
            mArrayOriginal[i] = rand.nextInt(400);
        }

        System.out.println("---------------- сортировка с помощью метода sort() -------------------");
        int[] mArrayCopy1 = Arrays.copyOf(mArrayOriginal, mArrayOriginal.length);
        System.out.println(Arrays.toString(mArrayCopy1));

        long start = System.nanoTime();
        Arrays.sort(mArrayCopy1);
        long finish = System.nanoTime();
        System.out.println("Прошло: " + (finish - start) + " нс");

        System.out.println(Arrays.toString(mArrayCopy1));


    /*
        Задание 2.4
        На основе существующего массива данных из задания 2.3 реализуйте
        алгоритм сортировки пузырьком.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните время выполнения алгоритмы сортировки методом sort() из
        задания 2.1 и сортировку пузырьком.
    */
        System.out.println("---------------- сортировка пузырьком -------------------");
        int[] mArrayCopy2 = Arrays.copyOf(mArrayOriginal, mArrayOriginal.length);
        System.out.println(Arrays.toString(mArrayCopy2));

        int temp;
        int lastIndex = mArrayCopy2.length - 1;
        long startBubble = System.nanoTime();
        for (int i = 0; i <= mArrayCopy2.length - 1; i++) {
            for (int j = 0; j < lastIndex; j++) {
                if (mArrayCopy2[j] > mArrayCopy2[j + 1]) {
                    temp = mArrayCopy2[j];
                    mArrayCopy2[j] = mArrayCopy2[j + 1];
                    mArrayCopy2[j + 1] = temp;
                }
            }
            lastIndex--;
        }
        long finishBubble = System.nanoTime();
        System.out.println("Прошло: " + (finishBubble - startBubble) + " нс");

        System.out.println(Arrays.toString(mArrayCopy2));


        /*
            Задание 2.5
            На основе массива данных из задания 2.3 реализуйте алгоритм
            сортировки методом выбора.
            Оцените сортировку с помощью базового класса System.nanoTime().
            Сравните с временем выполнения алгоритмов сортировки из прошлых
            заданий 2.3 и 2.4.
         */
        System.out.println("---------------- сортировка методом выбора -------------------");
        int[] mArrayCopy3 = Arrays.copyOf(mArrayOriginal, mArrayOriginal.length);
//        int[] mArrayCopy3 = new int[]{8,0,1,2,3,4,5,6,7,8,999};
//        int[] mArrayCopy3 = new int[]{9,8,7,6,5,4,3,2,1,0,999};
        System.out.println(Arrays.toString(mArrayCopy3));

        lastIndex = mArrayCopy3.length - 1;
        long startChoose = System.nanoTime();
        int maxValue;
        int indexOfMax;

        for (int loop = 1; loop < mArrayCopy3.length; loop++) {
            maxValue = mArrayCopy3[0];
            indexOfMax = 0;

            for (int i = 0; i <= lastIndex; i++) {

                if (mArrayCopy3[i] > maxValue) {
                    maxValue = mArrayCopy3[i];
                    indexOfMax = i;
                }
            }
            mArrayCopy3[indexOfMax] = mArrayCopy3[lastIndex];
            mArrayCopy3[lastIndex] = maxValue;

            lastIndex--;
        }
        long finishChoose = System.nanoTime();
        System.out.println("Прошло: " + (finishChoose - startChoose) + " нс");

        System.out.println(Arrays.toString(mArrayCopy3));


    }
}
