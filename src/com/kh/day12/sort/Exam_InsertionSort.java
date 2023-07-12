package com.kh.day12.sort;

public class Exam_InsertionSort {
		public static void main(String[] args) {
			
			int[] nums = { 5, 7, 2, 1, 4 };
			// 5,7,2,1,4
			// 7부터 시작해서 왼쪽이랑 비교를 함
			
			for ( int i=1; i< nums.length; i++ ) {
				for ( int j= i; j>0; j--) {
					if ( nums[j] < nums[j-1] ) {
						int temp = nums[j-1];
						nums[j-1] = nums[j];
						nums[j] = temp;
					}
				}
				
			}
			
			for ( int i=0; i<nums.length; i++) {
				System.out.println(nums[i]);
			}
			}

}
