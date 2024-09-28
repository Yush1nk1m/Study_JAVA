package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생 수를 입력하세요: ");
        int students = scanner.nextInt();

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            System.out.printf("국어 점수: ");
            scores[i][0] = scanner.nextInt();

            System.out.printf("영어 점수: ");
            scores[i][1] = scanner.nextInt();

            System.out.printf("수학 점수: ");
            scores[i][2] = scanner.nextInt();
        }

        for (int i = 0; i < students; i++) {
            int total = 0;
            double average;

            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            average = (double)total / 3;

            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
