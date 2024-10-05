package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        int n;
        while ((n = scanner.nextInt()) != 0) {
            list.add(n);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            System.out.printf("%d, ", list.get(i));
        }
        System.out.printf("%d\n", list.get(list.size() - 1));
    }
}
