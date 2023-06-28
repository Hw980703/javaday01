package com.kh.day03.array;

public class Exam_ArraySort {
	public static void main(String[] args) {
		System.out.println("실행 테스트");
			
		// 배열의 값이 {1,3,6,10,4,7,5,2,9,8}
		// -> {1,2,3,4,5,6,7,8,9,10}
		// 정렬 알고리즘의 종류
		// 1. 삽입 정렬
		// 2. 선택 정렬
		// 3. 버블 정렬
		// 4. 퀵   정렬
		// 5. ...... 등등
		
		int num1 = 5;
		int num2 = 15;
		
		System.out.printf("num1 : %d, num2 : %d\n",num1,num2);
		num1 = num2;
		num2 = num1;
		//두개의 값을 서로 바꿔주기 위해서는 임시변수가 필요함.
		//하나에 초기화를 하는 순간 값이 바뀌기 때문
		System.out.printf("num1 : %d, num2 : %d\n",num1,num2);
		
		int nums[] = {2,1,3};
		int temp[] = new int[3];
		
		for (int i=0; i<nums.length; i++) {
			temp[i] = nums[i];
		}
		nums[0] = temp[2];
		nums[1] = temp[0];
		nums[2] = temp[1];
		
		System.out.println();
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
			
			
	//{1, 2, 3, 4, 5}
		}
	}
}
