package lesson2.homework;

import java.util.Arrays;

public class Task2 {
    /*
        Задание 2.2
        На основе написанного кода в задании 2.1 реализуйте линейный и
        двоичный поиск.
        Оценить алгоритмы линейного и двоичного поиска с помощью
        базового класса System.nanoTime(), при необходимости расширьте уже
        существующий массив данных.

     */
    public static void main(String[] args) {
        int[] numbers = new int[]{2,4,5,8,6,3,2,9,8,4,5,6,2,4,5,8,6,3,2,9,8,4,5,6,2,7,4,5,8,6,3,2,9,8,4,5,6,0,999};

        System.out.println(Arrays.toString(numbers));
        int needle = 7;
//        int needle = 999;

        long startLine = System.nanoTime();
        int key = lineSearch(numbers, needle);
        long finishLine = System.nanoTime();
        System.out.println("Линейный поиск. Прошло: " + (finishLine - startLine) + " нс");

        if (key < 0)
            System.out.println("Элемент " + needle + " не найден");
        else
            System.out.println("Элемент " + needle + " найден по индексу " + key);

        System.out.println("----------------------------------------------------");

        long startBinary = System.nanoTime();
        key = binarySearch(numbers, needle);
        long finishBinary = System.nanoTime();
        System.out.println("Двоичный поиск. Прошло: " + (finishBinary - startBinary) + " нс");

        if (key < 0)
            System.out.println("Элемент " + needle + " не найден");
        else
            System.out.println("Элемент " + needle + " найден по индексу " + key);

    }

    private static int lineSearch(int[] numbers, int needle) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == needle) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] numbers, int needle) {
        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
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
}
