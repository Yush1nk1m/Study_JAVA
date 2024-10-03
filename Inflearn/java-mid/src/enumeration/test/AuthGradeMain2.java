package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String input = scanner.nextLine();
        AuthGrade grade = AuthGrade.valueOf(input);

        System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");
        switch (grade) {
            case AuthGrade.GUEST:
                System.out.println("- 메인 화면");
                break;
            case AuthGrade.LOGIN:
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");
                break;
            case AuthGrade.ADMIN:
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");
                System.out.println("- 관리자 화면");
                break;
        }
    }
}
