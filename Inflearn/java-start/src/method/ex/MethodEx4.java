package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------");

            System.out.printf("선택: ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.printf("입금액을 입력하세요: ");
                int money = scanner.nextInt();
                balance = deposit(balance, money);
            } else if (option == 2) {
                System.out.printf("출금액을 입력하세요: ");
                int money = scanner.nextInt();
                balance = withdraw(balance, money);
            } else if (option == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            } else if (option == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }

    public static int deposit(int balance, int money) {
        balance += money;
        System.out.println(money + "원을 입금했습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println(money + "원을 출금했습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
