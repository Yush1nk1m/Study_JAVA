package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        int n;
        while ((n = scanner.nextInt()) != 0) {
            list.add(n);
        }

        int total = 0;
        double average = 0.0;
        for (int number : list) {
            total += number;
        }
        average = (double)total / list.size();

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 점수의 평균: " + average);
    }
}
