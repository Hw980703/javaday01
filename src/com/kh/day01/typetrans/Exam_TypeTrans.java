package com.kh.day01.typetrans;

public class Exam_TypeTrans {
	public static void main(String[] args) {
		
		// int * int = int
		// double + double =double
		// int * double -> 자동 형변환이 된다.
		
		int iNum = 10;
		double dNum = 3.14;
		
		System.out.println(iNum * dNum);
		System.out.println("강제 형변환 : " + (int)iNum * (int)dNum);
		System.out.println("강제 형변환2 : " + (char)65);
		
	}

}
