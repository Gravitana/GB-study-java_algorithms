package lesson1.homework;

public class Main {
    /*
        Задание 1.1
        Приведите пример алгоритмов и структур данных из жизни.
        Задание 1.2
        Приведите пример алгоритмов и структур данных в
        программировании.
        Задание 1.3
        Напишите программный код, в котором все данные хранятся только в
        переменных трех типов данных: Ссылочные, примитивные и своего класса
        содержащего: конструктор и метод отображения данных.
        Выведите написанные данные.
        Задание 1.4
        Дополните предыдущий код сравнением ваших данных с другой
        переменной, данный код должен имитировать простейший поиск перебором.
        Оцените время выполнения алгоритма с помощью базового метода
        System.nanoTime().
     */
    public static void main(String[] args) {
        int age = 5;
        String name = "Кот Матроскин";
        Cat cat = new Cat(name, age);

        System.out.println(age);
        System.out.println(name);
        cat.display();
    }
}

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    public void display() {
        System.out.println("Имя: " + name + "; Возраст: " + age);
    }
}
