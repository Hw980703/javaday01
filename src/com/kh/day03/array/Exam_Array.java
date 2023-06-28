package com.kh.day03.array;

public class Exam_Array {
	public static void main(String[] args) {
		System.out.println("테스트");
		
		int num; // 변수 선언
		num = 0; // 변수 초기화
		//int num=0; //합치면
		int nums[]; //배열의 선언 int[] nums; 도 가능하다.
		nums = new int[10]; //배열의 할당
		//nums 는 배열의 주소이다, []는 연산이고 숫자가 들어가서 값을 찾는다. 0부터 시작
		nums[0] = 2;// nums 첫번째 값, 인덱스, 배열 초기화
	
		System.out.println(nums[0]);
		System.out.println(nums.length);
		
		// 배열의 할당 후 값을 학인하기
		// int의 기본 값 : 0
		// String 의 기본 값은 null
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
