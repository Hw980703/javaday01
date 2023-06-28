package com.kh.day03.array;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		System.out.println("실행 테스트");
		
		// 삽입정렬이란?
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘!!
		// 배열의 N번 인덱스값을 0번에서 n-1번 인덱스 까지 비교~!
		// {2,5,4,1,3}
		// 1번 : 2하고 5 비교 -> X
		// {2,5,4,1,3}
		// 2번 : 5하고 4 비교 -> 교환이 일어남
		// {2,4,5,1,3}
		// 3번 : 5하고 1 비교 -> 교환이 일어남
		// {2,4,1,5,3}
		// 4번 : 4하고 1 비교 -> 교환이 일어남
		// 5번 : 2하고 1 비교 -> 교환이 일어남
		// 6번 : 5하고 3 비교 ->교환
		// {1,2,4,3,5}
		// 4하고 3 비교->교환
		// {1,2,3,4,5} -> 네번째 결과
		// j = 1
		
		int[] arrs= {2,5,4,1,3};
		//{2,4,5,1,3}
		int num1 = arrs[1];
		int num2 = arrs[0];
		
		for(int i=1; i<arrs.length; i++) {
		
		for (int j=i; j > 0; j--) {

			if (arrs[j-1] > arrs[j]) {
			int temp = arrs[j];
			arrs[j] = arrs[j-1];
			arrs[j-1]  = temp;
			}
		}}
		
		for (int i=0; i<arrs.length; i++) {
			System.out.println(arrs[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int nums2[] = {2,3,5,1,5,6,};
//		
//		for (int i=1; i<nums2.length; i++) {
//			for (int j=i; j>0; j--) {
//				if(nums[i]>)
//			}
//		}
//	
//		
//		if (arrs[1] > arrs[2]) {
//		int temp = arrs[2];
//		arrs[2] = arrs[1];
//		arrs[1]  = temp;
//		}
//
//		if (arrs[0] > arrs[1]) {
//		int temp = arrs[1];
//		arrs[1] = arrs[0];
//		arrs[0]  = temp;
//		}
//		
//		//{2,4,5,1,3}
//		if (arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2]  = temp;
//			}
//		//{2,4,1,5,3}
//		if (arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1]  = temp;
//			}
//		// {2,1,4,5,3}
//		if (arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0]  = temp;
//			}
//		
//		//{1,2,4,5,3}
		// j=4
		
		if (arrs[3] > arrs[4]) {
			int temp = arrs[3];
			arrs[4] = arrs[3];
			arrs[3] = temp;
		}
		
		//{1,2,3,4,5}
		if (arrs[2] > arrs[3]) {
			int temp = arrs[3];
			arrs[3] = arrs[2];
			arrs[2] = temp;
		}
		
		
		
		//강사님 코드
		// 삽입정렬이란?
					// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘!!
					// 배열의 N번 인덱스값을 0번에서 n-1번 인덱스까지 비교~!
					// {2, 5, 4, 1, 3}
					// 1 : 2하고 5 비교 -> X
					// {2, 5, 4, 1, 3} => 1번째 결과
					// 2 : 5하고 4 비교 -> 교환
					// {2, 4, 5, 1, 3} => 2번째 결과
					// 3 : 5하고 1 비교 -> 교환
					// {2, 4, 1, 5, 3}
					// 4하고 1 비교 -> 교환
					// {2, 1, 4, 5, 3}
					// 2하고 1 비교 -> 교환
					// {1, 2, 4, 5, 3} => 3번째 결과
					// 4 : 5하고 3 비교 -> 교환
					// {1, 2, 4, 3, 5}
					// 4하고 3 비교 -> 교환
					// {1, 2, 3, 4, 5} => 4번째 결과
					
//					int [] arrs = {2, 5, 4, 1, 3};
//					//{2, 5, 4, 1, 3}
//					// j = 1
//					for(int j = 1; j < 1; j++) {
//						if(arrs[j-1] > arrs[j]) {
//							int temp = arrs[j];
//							arrs[j] = arrs[j-1];
//							arrs[j-1] = temp;
//						}
//					}
//					// j = 2
////					//{2, 4, 5, 1, 3}
////					if(arrs[1] > arrs[2]) {
////						int temp = arrs[2];
////						arrs[2] = arrs[1];
////						arrs[1] = temp;
////					}
////					if(arrs[0] > arrs[1]) {
////						int temp = arrs[1];
////						arrs[1] = arrs[0];
////						arrs[0] = temp;
////					}
//					// j = 3
////					//{2, 4, 5, 1, 3}
////					if(arrs[2] > arrs[3]) {
////						int temp = arrs[3];
////						arrs[3] = arrs[2];
////						arrs[2] = temp;
////					}
////					//{2, 4, 1, 5, 3}
////					if(arrs[1] > arrs[2]) {
////						int temp = arrs[2];
////						arrs[2] = arrs[1];
////						arrs[1] = temp;
////					}
////					//{2, 1, 4, 5, 3}
////					if(arrs[0] > arrs[1]) {
////						int temp = arrs[1];
////						arrs[1] = arrs[0];
////						arrs[0] = temp;
////					}
////					//{1, 2, 4, 5, 3}
//					
//					//{2, 5, 4, 1, 3}
//					// j = 1
//					if(arrs[0] > arrs[1]) {
//						int temp = arrs[1];
//						arrs[1] = arrs[0];
//						arrs[0] = temp;
//					}		
//					// j = 2
////							//{2, 4, 5, 1, 3}
//					if(arrs[1] > arrs[2]) {
//						int temp = arrs[2];
//						arrs[2] = arrs[1];
//						arrs[1] = temp;
//					}
//					if(arrs[0] > arrs[1]) {
//						int temp = arrs[1];
//						arrs[1] = arrs[0];
//						arrs[0] = temp;
//					}
//					
//					// j = 3
////					//{2, 4, 5, 1, 3}
//			if(arrs[2] > arrs[3]) {
//				int temp = arrs[3];
//				arrs[3] = arrs[2];
//				arrs[2] = temp;
//			}
////					//{2, 4, 1, 5, 3}
//			if(arrs[1] > arrs[2]) {
//				int temp = arrs[2];
//				arrs[2] = arrs[1];
//				arrs[1] = temp;
//			}
////					//{2, 1, 4, 5, 3}
//			if(arrs[0] > arrs[1]) {
//				int temp = arrs[1];
//				arrs[1] = arrs[0];
//				arrs[0] = temp;
//			}
////					//{1, 2, 4, 5, 3}
//			// j = 4
//			if(arrs[3] > arrs[4]) {
//				int temp = arrs[3];
//				arrs[4] = arrs[3];
//				arrs[3] = temp;
//			}
//			//{1, 2, 4, 3, 5}
//			if(arrs[2] > arrs[3]) {
//				int temp = arrs[3];
//				arrs[3] = arrs[2];
//				arrs[2] = temp;
//			}
//			//{1, 2, 3, 4, 5}
//			if(arrs[1] > arrs[2]) {
//				int temp = arrs[2];
//				arrs[2] = arrs[1];
//				arrs[1] = temp;
//			}
//			//{1, 2, 3, 4, 5}
//			if(arrs[0] > arrs[1]) {
//				int temp = arrs[1];
//				arrs[1] = arrs[0];
//				arrs[0] = temp;
//			}
		
}
}
