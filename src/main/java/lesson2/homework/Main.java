package lesson2.homework;

import java.util.Arrays;

public class Main {
    /*
        Задание 2.1
        На основе программного кода из домашнего задания №1 реализуйте
        массив на основе существующих примитивных или ссылочных типов
        данных.
        Выполните обращение к массиву и базовые операции класса Arrays.
        Оценить выполненные методы с помощью базового класса
        System.nanoTime().

        Задание 2.2
        На основе написанного кода в задании 2.1 реализуйте линейный и
        двоичный поиск.
        Оценить алгоритмы линейного и двоичного поиска с помощью
        базового класса System.nanoTime(), при необходимости расширьте уже
        существующий массив данных.

        Задание 2.3
        Создайте массив размером 400 элементов.
        Выполните сортировку с помощью метода sort().
        Оцените сортировку с помощью базового класса System.nanoTime().

        Задание 2.4
        На основе существующего массива данных из задания 2.3 реализуйте
        алгоритм сортировки пузырьком.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните время выполнения алгоритмы сортировки методом sort() из
        задания 2.1 и сортировку пузырьком.

        Задание 2.5
        На основе массива данных из задания 2.3 реализуйте алгоритм
        сортировки методом выбора.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните с временем выполнения алгоритмов сортировки из прошлых
        заданий 2.3 и 2.4.

        Задание 2.6
        На основе массива данных из задания 2.3 реализуйте алгоритм
        сортировки методом вставки.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните с временем выполнения алгоритмов сортировки из прошлых
        заданий 2.3, 2.4 и 2.5.
     */
    public static void main(String[] args) {

        /* Задание 2.1 */
        System.out.println("-------------------------- Задание 2.1 --------------------------");
        int[] numbers = new int[]{2,4,5,8,6,3,2,9,8,4,5,6,2,4,5,8,6,3,2,9,8,4,5,6,2,7,4,5,8,6,3,2,9,8,4,5,6,0,999};
        int[] numbersCopy = new int[numbers.length];

        long start = System.nanoTime();
        numbersCopy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(numbersCopy);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbersCopy));
        System.out.println(numbers[5]);
        long finish = System.nanoTime();
        System.out.println("Прошло: " + (finish - start) + " нс");

        /* Задание 2.2 */
        System.out.println("-------------------------- Задание 2.2 --------------------------");
        System.out.println(Arrays.toString(numbers));
        int needle = 7;
//        int needle = 999;

        start = System.nanoTime();
        int key = lineSearch(numbers, needle);
        finish = System.nanoTime();
        System.out.println("Линейный поиск. Прошло: " + (finish - start) + " нс");

        if (key < 0)
            System.out.println("Элемент " + needle + " не найден");
        else
            System.out.println("Элемент " + needle + " найден по индексу " + key);

        System.out.println("----------------------------------------------------");

        start = System.nanoTime();
        key = binarySearch(numbers, needle);
        finish = System.nanoTime();
        System.out.println("Двоичный поиск. Прошло: " + (finish - start) + " нс");

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
