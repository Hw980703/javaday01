package com.kh.day04.dimarray.exercise;
import java.util.*;
public class Exercise_DimArray {

	public void exercise1() {
		System.out.println("1번 문제");
		int[][] nums = new int[5][5];
		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = (5 * (i + 1)) - j;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void exercise2() {

		System.out.println();
		System.out.println("2번 문제");
		int sum = 0;
		int[][] nums = new int[5][5];
		for (int i = 0; i < nums.length; i++) {
			sum = i + 1;

			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = sum;
				sum += 5;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {

				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void exercise3() {
		System.out.println();
		System.out.println("3번 문제");
		int sum = 5;
		int sum2 = 5;
		int[][] nums = new int[5][5];
		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = sum * (j + 1) - i;

			}
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {

				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void exercise4() {
		System.out.println();
		System.out.println("4번 문제");
		int sum = 1;

		int[][] nums = new int[5][5];
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
			} else {
				if (nums[i][4] % 5 == 0) {
					sum = nums[i - 1][4] + 5;
				} else if (nums[i][4] % 2 == 0) {
					sum = nums[i - 1][4] + 1;
				}
			}

			for (int j = 0; j < nums[i].length; j++) {
				if (sum % 5 == 0 && sum != 0) {
					nums[i][j] = sum - j;
				} else if (sum % 5 != 0 || sum == 0) {
					nums[i][j] = sum + j;
				}

			}
		}

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[i].length; j++) {

				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		
			double[][] nums = new double[4][2];
			Random rand = new Random();
			
			for (int i=0; i<nums.length; i++) {
				for (int j=0; j<nums[i].length; j++) {
					
						nums[i][j] = ((double)rand.nextInt(4) + (double)rand.nextInt(9)/10)+1;
					}
					
				}
			double sum=0;
			System.out.println();
			System.out.println("평점");
			for (int i = 0; i < nums.length; i++) {

				for (int j = 0; j < nums[i].length; j++) {
					sum +=nums[i][j];
					System.out.print(nums[i][j] + " ");
					
				}System.out.println();
			
			} System.out.printf("4년간 전체 평점의 평균은 : %.1f",sum/8);
		
		

	}

	public static void main(String[] args) {
		System.out.println("실행테스트");
	}
}
