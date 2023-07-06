package com.kh.day09.exercise;

public class Exercise_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "230515"와 "231026"인 문자열을
		// 계산해서 출력하시오.
		
		String str1 = "230515";
		String str2 = "231026";
		
		int result;
		result = Integer.parseInt(str1) + Integer.parseInt(str2);
		System.out.println("더하기 : " + result);
		result = Integer.parseInt(str1) * Integer.parseInt(str2);
		System.out.println("곱하기 : " + result);
	}

}
