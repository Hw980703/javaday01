package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	Scanner sc = new Scanner(System.in);
	Student student = new Student();
	static int select;
	static int sum;
	static double avg;
	
	public static void main(String[] args) {

		

	// while문을 부시는 방법은
	// wihle 문위에 finish : 작성 후 break finish;를 한다

	// finish :
	// while() {
	// break finish;}
	
//		Scanner sc = new Scanner(System.in);
//		select = sc.nextInt();
//		System.out.println("=== 성적 입력 ===");
//		System.out.println("1. 성적입력");
//		System.out.println("2. 성적출력");
//		System.out.println("3. 종료");
		
		for (;;) {
			sum = Student.koScore + Student.engScore + Student.mathScore;
			avg = sum / 3;
			System.out.println();
			printMenu();
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();
//			int select = sc.nextInt();
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
			 else {
					printException();
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
			Student.koScore = sc.nextInt();
			if (Student.koScore >= 0 && Student.koScore <= 100) {
				System.out.println("영어 :");
				Student.engScore = sc.nextInt();

				if (Student.engScore >= 0 && Student.engScore <= 100) {
					System.out.println("수학 :");
					Student.mathScore = sc.nextInt();

					if (Student.mathScore < 0 && Student.mathScore > 100) {
						System.out.println(" 수학 점수를 0에서 100사이로 입력하세요.");
					}

				} else {
					System.out.println(" 영어 점수를 0에서 100사이로 입력하세요.");
				}
			} else {
				System.out.println(" 국어 점수를 0에서 100사이로 입력하세요.");
			}
	}
		
	}
	
	
	
	
	
	public static void printScore() {
		System.out.println("국어점수 : " + Student.koScore);
		System.out.println("국어점수 : " + Student.engScore);
		System.out.println("국어점수 : " + Student.mathScore);
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



