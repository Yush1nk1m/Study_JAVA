package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
        Map<String, Integer> map = new HashMap<>();

        for (String[] row : productArr) {
            map.put(row[0], Integer.valueOf(row[1]));
        }

        for (String key : map.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + map.get(key));
        }
    }
}
