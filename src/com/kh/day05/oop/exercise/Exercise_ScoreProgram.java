package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	Scanner sc = new Scanner(System.in);
	static int koScore = 0;
	static int engScore = 0;
	static int mathScore = 0;
	static int select;
	static int sum;
	static double avg;
	
	public static void main(String[] args) {

		

	// while문을 부시는 방법은
	// wihle 문위에 finish : 작성 후 break finish;를 한다

	// finish :
	// while() {
	// break finish;}
	
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
//		System.out.println("=== 성적 입력 ===");
//		System.out.println("1. 성적입력");
//		System.out.println("2. 성적출력");
//		System.out.println("3. 종료");
		
		for (;;) {
			sum = koScore + engScore + mathScore;
			avg = sum / 3;
			System.out.println();
			printMenu();
			int select = sc.nextInt();
			if (select >= 1 && select <= 3) {
				inputScore();
				if (select == 2) {
					printScore();
				}
				if (select == 3) {
					showGoodBye();
					break;
				}

				}
//				sum = koScore + engScore + mathScore;
//				avg = sum / 3;
//				if (select == 2) {
//					printScore();
//				}
//				if (select == 3) {
//					showGoodBye();
//					break;
//				}

			
		}
	}
		
		
		

	
	
	
	
	public static void printMenu() {
		System.out.println("=== 메인 메뉴 ===");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
	
	}
	
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		if (select == 1) {
			System.out.println("국어 :");
			koScore = sc.nextInt();
			if (koScore >= 0 && koScore <= 100) {
				System.out.println("영어 :");
				engScore = sc.nextInt();

				if (engScore >= 0 && engScore <= 100) {
					System.out.println("수학 :");
					mathScore = sc.nextInt();

					if (mathScore < 0 && mathScore > 100) {
						System.out.println(" 수학 점수를 0에서 100사이로 입력하세요.");
					}

				} else {
					System.out.println(" 영어 점수를 0에서 100사이로 입력하세요.");
				}
			} else {
				System.out.println(" 국어 점수를 0에서 100사이로 입력하세요.");
			}
	}
		 else {
				printException();
			}
	}
	
	
	
	
	
	public static void printScore() {
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);
		System.out.println();
	}
	
	
	
	public static void showGoodBye() {
		System.out.println("성적 계산기를 종료합니다");
	}
	
	public static void printException() {
		System.out.println("1~3사이 숫자를 입력해주세요.");
	}
}



