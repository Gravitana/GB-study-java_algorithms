package lesson3;

import java.util.ArrayList;
import java.util.Collections;

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

class ArObj {
    private int x;
    private int y;

    public ArObj(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("X: " + x + "; Y: " + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
