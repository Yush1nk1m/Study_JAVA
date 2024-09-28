package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }

        System.out.println("sum = " + sum);
    }
}
