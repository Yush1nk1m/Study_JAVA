package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("입력받을 숫자의 개수를 입력하세요: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println(size + "개의 정수를 입력하세요:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
