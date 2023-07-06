package com.kh.day09.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		Calendar openDate = Calendar.getInstance();
		openDate.clear();
		openDate.set(2023, 5,15);
		Calendar openDate1 = Calendar.getInstance();
		openDate1.set(2023, 7,06);
		
		Calendar openDate2 = Calendar.getInstance();
		openDate2.set(2023, 5,15);
		
		Calendar openDate3 = Calendar.getInstance();
		openDate3.set(2023, 10,26);
		
//		System.out.println(today.get(Calendar.YEAR));
//		System.out.println(today.get(Calendar.MONTH));
//		System.out.println(today.get(Calendar.DAY_OF_MONTH));
//		System.out.println(today.get(Calendar.DAY_OF_WEEK));
//		System.out.println(today.get(Calendar.HOUR_OF_DAY));
//		System.out.println(today.get(Calendar.HOUR));
//		System.out.println(today.get(Calendar.MINUTE));
//		System.out.println(today.get(Calendar.SECOND));
//		System.out.println(today.get(Calendar.MILLISECOND));
		
		System.out.println();
		
		new Exam_Calendar().printCalendar("현재",openDate1);
		
		System.out.println();
		new Exam_Calendar().printCalendar("개강일",openDate2);
		System.out.println();
		new Exam_Calendar().printCalendar("종강일",openDate3);
		
	
		
		
	}
	
	public void printCalendar(String title, Calendar cal) {
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int hour =cal.get(Calendar.HOUR);
		int minute =cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		
		System.out.println(title + " ");
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print(cal.get(Calendar.MONTH)+"월 ");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH)+"일 ");
		switch(dayOfWeek) {
		case 1 : System.out.println("일요일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		case 7 : System.out.println("토요일"); break;
		}
//		System.out.print(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.print(cal.get(Calendar.HOUR_OF_DAY));
		System.out.print(cal.get(Calendar.HOUR)+"시");
		System.out.print(cal.get(Calendar.MINUTE)+"분");
		System.out.print(cal.get(Calendar.SECOND)+"초");
		System.out.print(cal.get(Calendar.MILLISECOND)+"밀리초");
		
		
	}
}