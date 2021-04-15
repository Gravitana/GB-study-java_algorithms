package lesson3.video6_iterators;

import lesson3.video2_array_list.ArObj;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> mArray = new LinkedList<>();

        ArrayList<String> mArrayCopy = new ArrayList<>(mArray); // копируем в ArrayList

        System.out.println("================== заполняем списки ====================================");
        mArray.add("One");
        mArray.add("Two");
        mArray.add("Three");
        mArrayCopy.addAll(mArray);

        System.out.println("LinkedList: " + mArray);
        System.out.println("ArrayList:  " + mArrayCopy);

        System.out.println("================== сравниваем их ====================================");
        System.out.println(mArray.equals(mArrayCopy));

        System.out.println("================== их хэш-коды ====================================");
        System.out.println("LinkedList: " + mArray.hashCode());
        System.out.println("ArrayList:  " + mArrayCopy.hashCode());

        System.out.println("================== итерация с удалением ====================================");
        System.out.println("До прохода: " + mArray);

        Iterator<String> iterator = mArray.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("После прохода: " + mArray);

        System.out.println("======================================================");
        System.out.println("=================== Объект ===========================");

        LinkedList<ArObj> mArrayObj = new LinkedList<>();

        mArrayObj.add(new ArObj(1, 2));
        mArrayObj.add(new ArObj(3, 2));
        mArrayObj.add(new ArObj(5, 8));

        mArrayObj.set(2, new ArObj(6, 2));

        System.out.println("================== расширенный итератор (проход вперёд) ====================================");

        ListIterator<ArObj> iterList = mArrayObj.listIterator();

        ArObj current1;
        while (iterList.hasNext()) { // проход вперёд
            current1 = iterList.next();
            current1.print();
        }
        System.out.println("================== проход в обратном порядке ====================================");

        Random random = new Random();

        ArObj current2;
        while (iterList.hasPrevious()) {
            current2 = iterList.previous();
            current2.print();
            iterList.set(new ArObj(random.nextInt(10), random.nextInt(10)));
        }
        System.out.println("====================== после перезаписи случайными числами================================");

        for (ArObj number : mArrayObj) {
            number.print();
            System.out.println(number.getX() + " " + number.getY());
        }
    }
}
