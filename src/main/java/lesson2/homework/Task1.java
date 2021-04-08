package lesson2.homework;

import java.util.Arrays;

public class Task1 {
    /*
        Задание 2.1
        На основе программного кода из домашнего задания №1 реализуйте
        массив на основе существующих примитивных или ссылочных типов
        данных.
        Выполните обращение к массиву и базовые операции класса Arrays.
        Оценить выполненные методы с помощью базового класса
        System.nanoTime().










        Задание 2.6
        На основе массива данных из задания 2.3 реализуйте алгоритм
        сортировки методом вставки.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните с временем выполнения алгоритмов сортировки из прошлых
        заданий 2.3, 2.4 и 2.5.
     */
    public static void main(String[] args) {

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


    }
}
