package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {

        System.out.println("================ Задание 2.1 ===================");
        doTask1();

        System.out.println("================ Задание 2.2 ===================");
        doTask2();

        System.out.println("================ Задание 2.3 ===================");
        int[] mArrayOriginal = new int[400];

        Random rand = new Random();
        for (int i = 0; i < mArrayOriginal.length; i++) {
            mArrayOriginal[i] = rand.nextInt(400);
        }

        long timeSort = sortBySort(mArrayOriginal);

        System.out.println("================ Задание 2.4 ===================");
        long timeBubble = sortByBubble(mArrayOriginal);

        System.out.println("================ Задание 2.5 ===================");
        long timeChoose = sortByChoose(mArrayOriginal);

        System.out.println("================ Задание 2.6 ===================");
        long timeInsert = sortByInsert(mArrayOriginal);

        System.out.println();

        System.out.println("Итого:");
        System.out.println(timeSort + " - sort()");
        System.out.println(timeBubble + " - пузырёк");
        System.out.println(timeChoose + " - выбор");
        System.out.println(timeInsert + " - вставка");

    }



    /*
        Задание 2.1
        На основе программного кода из домашнего задания №1 реализуйте
        массив на основе существующих примитивных или ссылочных типов данных.
        Выполните обращение к массиву и базовые операции класса Arrays.
        Оценить выполненные методы с помощью базового класса
        System.nanoTime().
     */
    private static void doTask1() {
        int[] arrayTask1 = new int[]{2,4,5,8,6,3,2,9,8,4,5,6,2,4,5,8,6,3,2,9,8,4,5,6,2,7,4,5,8,6,3,2,9,8,4,5,6,0,999};
        int[] arrayTask1Copy = new int[arrayTask1.length];

        long start = System.nanoTime();
        arrayTask1Copy = Arrays.copyOf(arrayTask1, arrayTask1.length);
        Arrays.sort(arrayTask1Copy);

        System.out.println(Arrays.toString(arrayTask1));
        System.out.println(Arrays.toString(arrayTask1Copy));
        System.out.println(arrayTask1[5]);
        long finish = System.nanoTime();
        System.out.println("Прошло: " + (finish - start) + " нс");
    }

    /*
        Задание 2.2
        На основе написанного кода в задании 2.1 реализуйте линейный и
        двоичный поиск.
        Оценить алгоритмы линейного и двоичного поиска с помощью
        базового класса System.nanoTime(), при необходимости расширьте уже
        существующий массив данных.

     */
    private static void doTask2() {
        System.out.println("---------------- Линейный поиск -------------------");

        int[] arrayTask2 = new int[]{2,4,5,8,6,3,2,9,8,4,5,6,2,4,5,8,6,3,2,9,8,4,5,6,2,7,4,5,8,6,3,2,9,8,4,5,6,0,999};
        int needle = 7;

        long startLine = System.nanoTime();
        int key = lineSearch(arrayTask2, needle);
        long finishLine = System.nanoTime();
        System.out.println("Прошло: " + (finishLine - startLine) + " нс");

        if (key < 0)
            System.out.println("Элемент " + needle + " не найден");
        else
            System.out.println("Элемент " + needle + " найден по индексу " + key);

        System.out.println("---------------- Двоичный поиск -------------------");

        long startBinary = System.nanoTime();
        key = binarySearch(arrayTask2, needle);
        long finishBinary = System.nanoTime();
        System.out.println("Прошло: " + (finishBinary - startBinary) + " нс");

        if (key < 0)
            System.out.println("Элемент " + needle + " не найден");
        else
            System.out.println("Элемент " + needle + " найден по индексу " + key);
    }

    private static int lineSearch(int[] numbers, int needle) {
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == needle) {
                return i;
            }
        }
        return -1;
    }
    private static int binarySearch(int[] numbers, int needle) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int middle;
        int first = 0;
        int last = numbers.length - 1;

        while (last >= first) {
            middle = (last - first) / 2 + first;
            if (numbers[middle] == needle) {
                return middle;
            } else if (needle > numbers[middle]) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return -1;
    }

    /*
        Задание 2.3
        Создайте массив размером 400 элементов.
        Выполните сортировку с помощью метода sort().
        Оцените сортировку с помощью базового класса System.nanoTime().
     */
    private static long sortBySort(int[] mArrayOriginal) {
        System.out.println("---------------- сортировка с помощью метода sort() -------------------");
        int[] mArrayCopy = Arrays.copyOf(mArrayOriginal, mArrayOriginal.length);
        System.out.println(Arrays.toString(mArrayCopy));

        long start = System.nanoTime();

        Arrays.sort(mArrayCopy);

        long finish = System.nanoTime();
        System.out.println("Прошло: " + (finish - start) + " нс");

        System.out.println(Arrays.toString(mArrayCopy));

        return finish - start;
    }

    /*
        Задание 2.4
        На основе существующего массива данных из задания 2.3 реализуйте
        алгоритм сортировки пузырьком.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните время выполнения алгоритмы сортировки методом sort() из
        задания 2.1 и сортировку пузырьком.
    */
    private static long sortByBubble(int[] mArrayOriginal) {
        System.out.println("---------------- сортировка пузырьком -------------------");
        int[] mArrayCopy = Arrays.copyOf(mArrayOriginal, mArrayOriginal.length);
        System.out.println(Arrays.toString(mArrayCopy));

        long start = System.nanoTime();

        int temp;
        int lastIndex = mArrayCopy.length - 1;
        for (int i = 0; i <= mArrayCopy.length - 1; i++) {
            for (int j = 0; j < lastIndex; j++) {
                if (mArrayCopy[j] > mArrayCopy[j + 1]) {
                    temp = mArrayCopy[j];
                    mArrayCopy[j] = mArrayCopy[j + 1];
                    mArrayCopy[j + 1] = temp;
                }
            }
            lastIndex--;
        }

        long finish = System.nanoTime();
        System.out.println("Прошло: " + (finish - start) + " нс");

        System.out.println(Arrays.toString(mArrayCopy));

        return finish - start;
    }

    /*
        Задание 2.5
        На основе массива данных из задания 2.3 реализуйте алгоритм
        сортировки методом выбора.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните с временем выполнения алгоритмов сортировки из прошлых
        заданий 2.3 и 2.4.
     */

    private static long sortByChoose(int[] mArrayOriginal) {
        System.out.println("---------------- сортировка методом выбора -------------------");
        int[] mArrayCopy3 = Arrays.copyOf(mArrayOriginal, mArrayOriginal.length);
        System.out.println(Arrays.toString(mArrayCopy3));

        long start = System.nanoTime();

        int lastIndex = mArrayCopy3.length - 1;
        int maxValue;
        int indexOfMax;

        for (int n = 1; n < mArrayCopy3.length; n++) {
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

        long finish = System.nanoTime();
        System.out.println("Прошло: " + (finish - start) + " нс");

        System.out.println(Arrays.toString(mArrayCopy3));

        return finish - start;
    }

    /*
        Задание 2.6
        На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом вставки.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните с временем выполнения алгоритмов сортировки из прошлых
        заданий 2.3, 2.4 и 2.5.
     */
    private static long sortByInsert(int[] mArrayOriginal) {
        System.out.println("---------------- сортировка методом вставки -------------------");
        int[] mArrayCopy4 = Arrays.copyOf(mArrayOriginal, mArrayOriginal.length);
//        int[] mArrayCopy4 = new int[]{8,0,1,2,3,4,5,6,7,8,999};
//        int[] mArrayCopy4 = new int[]{9,8,7,6,5,4,3,2,1,0,999};
        System.out.println(Arrays.toString(mArrayCopy4));
        long start = System.nanoTime();

        int tempInsert;
        for (int n = 1; n < mArrayCopy4.length; n++) {
            for (int i = n; i > 0 && (mArrayCopy4[i] < mArrayCopy4[i - 1]); i--) {
                tempInsert = mArrayCopy4[i];
                mArrayCopy4[i] = mArrayCopy4[i - 1];
                mArrayCopy4[i - 1] = tempInsert;

            }
        }
        long finish = System.nanoTime();
        System.out.println("Прошло: " + (finish - start) + " нс");

        System.out.println(Arrays.toString(mArrayCopy4));

        return finish - start;
    }
}
