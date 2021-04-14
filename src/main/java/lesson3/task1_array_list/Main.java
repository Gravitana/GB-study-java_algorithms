package lesson3.task1_array_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mArray = new ArrayList<>();

        ArrayList<String> mArrayCopy = new ArrayList<>(mArray);

//        mArrayCopy.addAll(0, mArray);
//        Collections.copy(mArrayCopy, mArray);

        mArray.add("One");
        mArray.add("Two");
        mArray.add("Three");

        System.out.println(mArray);

        mArray.add(1, "Four");
        mArray.set(2, "Set");

        System.out.println(mArray);
        System.out.println("======================================================");

        ArrayList<ArObj> mArrayObj = new ArrayList<>();

        mArrayObj.add(new ArObj(1, 2));
        mArrayObj.add(new ArObj(3, 2));
        mArrayObj.add(new ArObj(5, 8));

        mArrayObj.set(2, new ArObj(1, 2));

        System.out.println(mArrayObj.get(1));
        System.out.println(mArrayObj);

        System.out.println("======================================================");

        for (ArObj number : mArrayObj) {
            number.print();
            System.out.println(number.getX() + " " + number.getY());
        }
    }
}
