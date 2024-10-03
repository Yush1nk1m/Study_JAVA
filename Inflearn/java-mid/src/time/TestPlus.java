package time;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime from = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime to = from.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println("기준 시각: " + from);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + to);
    }
}
