package lesson3.video5_methods;


import lesson3.video2_array_list.ArObj;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> mArray = new LinkedList<>();

        ArrayList<String> mArrayCopy = new ArrayList<>(mArray); // копируем в ArrayList

        System.out.println("================== создаём список ====================================");
        mArray.add("One");
        mArray.add("Two");
        mArray.add("Three");

        System.out.println(mArray);

        System.out.println("================== добавляем \"Four\" на первый индекс, заменяем второй на \"Set\" ====================================");
        mArray.add(1, "Four");
        mArray.set(2, "Set");

        System.out.println(mArray);
        System.out.println(mArray.get(2));

        System.out.println("================= удаляем первый и \"Set\"=====================================");
        mArray.remove(1);
        mArray.remove("Set");

        System.out.println(mArray);

        System.out.println("================= добавляем в начало и в конец=====================================");
        mArray.addFirst("first");
        mArray.addLast("last");

        System.out.println(mArray);

        System.out.println("=========== получаем первый и последний ===========================================");
        System.out.println(mArray.peekFirst());
        System.out.println(mArray.peekLast());
        System.out.println(mArray);

        System.out.println("============ выдёргиваем первый и последний ==========================================");
        System.out.println(mArray.pollFirst());
        System.out.println(mArray.pollLast());
        System.out.println(mArray);

        System.out.println("============= проверяем, содержит ли \"One\" =========================================");
        if (mArray.contains("One")) {
            System.out.println("Содержит One");
        }
        System.out.println(mArray);

        System.out.println("======================================================");
        System.out.println("=================== Объект ===========================");

        LinkedList<ArObj> mArrayObj = new LinkedList<>();

        mArrayObj.add(new ArObj(1, 2));
        mArrayObj.add(new ArObj(3, 2));
        mArrayObj.add(new ArObj(5, 8));

        mArrayObj.set(2, new ArObj(1, 2));

        System.out.println(mArrayObj.get(1));   // выводит ссылки
        System.out.println(mArrayObj);          // выводит ссылки

        System.out.println("======================================================");

        for (ArObj number : mArrayObj) {
            number.print();
            System.out.println(number.getX() + " " + number.getY());
        }


        System.out.println("======================================================");


    }
}
