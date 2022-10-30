package sec02.verify.exam01;

import java.util.*;
import java.text.*;

public class DateAndSimpleDataFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar nowCalendar = Calendar.getInstance();
		
		SimpleDateFormat sdfFront = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");
		String strNow = sdfFront.format(now);
		
		int dayOfWeek = nowCalendar.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek = null;
		
		switch (dayOfWeek) {
			case Calendar.MONDAY :
				strDayOfWeek = "월요일";
				break;
			case Calendar.TUESDAY :
				strDayOfWeek = "화요일";
				break;
			case Calendar.WEDNESDAY :
				strDayOfWeek = "수요일";
				break;
			case Calendar.THURSDAY :
				strDayOfWeek = "목요일";
				break;
			case Calendar.FRIDAY :
				strDayOfWeek = "금요일";
				break;
			case Calendar.SATURDAY :
				strDayOfWeek = "토요일";
				break;
			case Calendar.SUNDAY :
				strDayOfWeek = "일요일";
				break;
		}
		System.out.println(strNow.substring(0, 14) + strDayOfWeek + strNow.substring(13));
	}
}
