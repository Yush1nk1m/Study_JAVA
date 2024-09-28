package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단수를 입력해주세요: ");
        int level = scanner.nextInt();

        System.out.println(level + "단의 구구단:");
        for (int mult = 1; mult <= 9; mult++) {
            System.out.println(level + " * " + mult + " = " + (level * mult));
        }
    }
}
