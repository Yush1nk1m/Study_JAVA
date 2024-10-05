package collection.set.test;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        HashSet<Integer> set = new HashSet<>();
        for (Integer number : inputArr) {
            set.add(number);
        }

        for (int number : set) {
            System.out.println(number);
        }
    }
}
