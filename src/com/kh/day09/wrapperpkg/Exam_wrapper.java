package com.kh.day09.wrapperpkg;

public class Exam_wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0;
		Integer su = Integer.valueOf(0);
		
		
		
//		su = new Integer(0);
		
		su = Integer.valueOf(1026); //박싱
		su = 1026; //오토 - 박싱!!^^
		
		int suNum = su.intValue();
		suNum =  su; // 오토 -언박싱
		//		su=null;
		
		String openDay = "20230515";
		int openDate = Integer.parseInt(openDay);
		System.out.println(openDate);
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('B'));
		
		char c1 = '4' , c2 = 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1+"은 숫자다");
		}
		
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2+"는 영문잗");
		}
	}

}
