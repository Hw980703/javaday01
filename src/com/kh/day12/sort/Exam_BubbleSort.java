package com.kh.day12.sort;

public class Exam_BubbleSort {
	public static void main(String[] args) {

		int[] nums = { 5, 7, 2, 1, 4 };

		// 첫번째 비교
		// {5,7,2,1,4}
		// 두번째 비교
		// {5,2,7,1,4}

		for (int i = 0; i < nums.length ; i++) {

			for (int j = 0; j < nums.length-1 ; j++) {
				if ( nums[j] > nums [ j+1]) {
						int temp = nums[j+1];
						nums[j+1] = nums[j];
						nums[j] = temp;
					
					
				}
			}
			
		}
		
		for ( int i=0; i< nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		// {1,2,4,5,7}

	}
}
