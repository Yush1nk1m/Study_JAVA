package time;

import java.time.*;

public class TestZone {

    public static void main(String[] args) {
        ZonedDateTime seoulZdt = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonZdt = seoulZdt.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYorkZdt = seoulZdt.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + seoulZdt);
        System.out.println("런던의 회의 시간: " + londonZdt);
        System.out.println("뉴욕의 회의 시간: " + newYorkZdt);
    }
}
