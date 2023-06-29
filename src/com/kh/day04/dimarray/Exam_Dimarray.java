package com.kh.day04.dimarray;

public class Exam_Dimarray {
	public static void main(String[] args) {
		
		
		int num =0;
		int[] nums = new int[10];
		int[][] dimNums = new int[2][5];
		System.out.println("행의 크기는 " + dimNums.length);
		System.out.println("열의 크기는 " + dimNums[0].length);
		
		
		int[][] arrs = new int[4][4];
		arrs[0][0] = 1;
		arrs[0][1] = 2;
		arrs[0][2] = 3;
		arrs[0][3] = 4;
		
		System.out.println(arrs[0][0]);
		
		arrs[1][0] = 5;
		arrs[1][1] = 6;
		arrs[1][2] = 7;
		arrs[1][3] = 8;
		
		arrs[2][0] = 9;
		arrs[2][1] = 10;
		arrs[2][2] = 11;
		arrs[2][3] = 12;
		
		arrs[3][0] = 13;
		arrs[3][1] = 14;
		arrs[3][2] = 15;
		arrs[3][3] = 16;
		
		for (int i=0; i<arrs.length; i++) {
			for (int j=0; j<arrs[0].length; j++) {
				System.out.print(arrs[i][j] + " ");
			} System.out.println();
		}
		
		
		System.out.println();
		System.out.println(" ========= 2차원 배열 연습 ========");
		int[][] nums2 = new int[3][5];
		int sum = 0;
		
		for (int i=0; i<nums2.length; i++) {
			for (int j=0; j<nums2[0].length; j++) {
				nums2[i][j] = (sum+=1);
			}
		}
		
		for (int i=0; i<nums2.length; i++) {
			for (int j=0; j<nums2[0].length; j++) {
				System.out.print(nums2[i][j] + " ");
			}
		}
		
		
	
	}

}
