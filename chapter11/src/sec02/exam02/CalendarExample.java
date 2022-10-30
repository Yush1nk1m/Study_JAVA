package sec02.exam02;

import java.util.*;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		switch (week) {
			case Calendar.MONDAY :
				strWeek = "Monday";
				break;
			case Calendar.TUESDAY :
				strWeek = "Tuesday";
				break;
			case Calendar.WEDNESDAY :
				strWeek = "Wednesday";
				break;
			case Calendar.THURSDAY :
				strWeek = "Thursday";
				break;
			case Calendar.FRIDAY :
				strWeek = "Friday";
				break;
			case Calendar.SATURDAY :
				strWeek = "Saturday";
				break;
			case Calendar.SUNDAY :
				strWeek = "Sunday";
				break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if (amPm == Calendar.AM) {
			strAmPm = "A.M.";
		} else {
			strAmPm = "P.M.";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println("Year : " + year);
		System.out.println("Month : " + month);
		System.out.println("Day of month : " + day);
		System.out.println("Day of week : " + strWeek);
		System.out.println("AM | PM : " + strAmPm);
		System.out.println("Hour : " + hour);
		System.out.println("Minute : " + minute);
		System.out.println("Second : " + second);
	}
}
