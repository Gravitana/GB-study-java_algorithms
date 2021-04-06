package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] mArray;
        int[] mArrayCopy;
        mArray = new int[10];

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            mArray[i] = rand.nextInt(15);
        }

        mArrayCopy = Arrays.copyOf(mArray, mArray.length);

        System.out.println("Not arrays: " + mArray.toString());
        System.out.println("Arrays: " + Arrays.toString(mArray));
        System.out.println("Copy Arrays: " + Arrays.toString(mArrayCopy));
        System.out.println("Equals: " + mArray.equals(mArrayCopy));
        System.out.println("Equals Arrays: " + Arrays.equals(mArray, mArrayCopy));
    }
}
