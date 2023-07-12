package com.kh.day12.sort;

public class Exam_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 7, 2, 1, 4 };
		// 선택 정렬

		// 5,7,2,1,4
		// 첫번째값하고 비교를 해서 가장 작은놈을 넘긴다

		// 1,7,2,5,4
		// 첫번째 결과

		// 1,2,7,5,4
		// 두번째 결과

		// 1,2,4,5,7
		int min;

		for (int i = 0; i < nums.length; i++) {
			min = i;

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[min] > nums[j]) {
					min = j;

				}
			}
			int temp = nums[min];
			nums[min] = nums[i];
			nums[i] = temp;
		}
		for (int i : nums) {
			System.out.println(i + " ");
		}

	}

}
