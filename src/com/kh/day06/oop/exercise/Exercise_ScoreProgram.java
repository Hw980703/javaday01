package com.kh.day06.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {

	Student2[] stds = new Student2[3];

	Scanner sc = new Scanner(System.in);
	static int koScore = 0;
	static int engScore = 0;
	static int mathScore = 0;
	static int select;
	static int sum;
	static double avg;

	public static void main(String[] args) {
		Student2[] stds = new Student2[3];
		stds[0] = new Student2();

		// while문을 부시는 방법은
		// wihle 문위에 finish : 작성 후 break finish;를 한다

		// finish :
		// while() {
		// break finish;}

		Scanner sc = new Scanner(System.in);
//		select = sc.nextInt();
//		System.out.println("=== 성적 입력 ===");
//		System.out.println("1. 성적입력");
//		System.out.println("2. 성적출력");
//		System.out.println("3. 종료");
		Student2 stdOne = new Student2();

		for (;;) {

			System.out.println();
			printMenu();
			select = sc.nextInt();
			if (select >= 1 && select <= 3) {
				inputScore(stds);
				if (select == 2) {
					printScore(stds);
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

	public static void inputScore(Student2[] stds) {
		Scanner sc = new Scanner(System.in);
		if (select == 1) {

			for (int i = 0; i < 3; i++) {
				int count = 0;
				stds[i] = new Student2();
				System.out.println("=========== 이름 입력 ============");
				System.out.print("이름 : ");
				stds[i].name = sc.next();

				System.out.println("국어 :");
				stds[i].koScore = sc.nextInt();

				if (koScore >= 0 && koScore <= 100) {
					count++;
					System.out.println("영어 :");
					stds[i].engScore = sc.nextInt();

					if (engScore >= 0 && engScore <= 100) {
						count++;
						System.out.println("수학 :");
						stds[i].mathScore = sc.nextInt();
						count++;

						if (mathScore < 0 && mathScore > 100) {

							System.out.println(" 수학 점수를 0에서 100사이로 입력하세요.");
						}

					} else {
						System.out.println(" 영어 점수를 0에서 100사이로 입력하세요.");
					}
				} else {
					System.out.println(" 국어 점수를 0에서 100사이로 입력하세요.");
				}
				if (count == 3) {
					System.out.println();
					System.out.println(stds[i].name + "님의 점수");
					System.out.println("국어:" + stds[i].koScore);
					System.out.println("영어:" + stds[i].engScore);
					System.out.println("수학:" + stds[i].mathScore);

					System.out.println("총점:" + stds[i].getTotal());
					System.out.printf("평균:%.2f", stds[i].getAvg());
					System.out.println();
				}
			}
		}

	}

	public static void printScore(Student2[] stds) {
		for (int i = 0; i < 3; i++) {
			stds[i].sum = stds[i].koScore + stds[i].engScore + stds[i].mathScore;
			stds[i].avg = stds[i].sum / 3;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println();
			System.out.println(stds[i].name + "님의 점수");
			System.out.println("국어:" + stds[i].koScore);
			System.out.println("영어:" + stds[i].engScore);
			System.out.println("수학:" + stds[i].mathScore);

			System.out.println("총점 : " + stds[i].getTotal());
			System.out.printf("평균 : %.2f", stds[i].getAvg());
			System.out.println();
		}
	}

	public static void showGoodBye() {
		System.out.println("성적 계산기를 종료합니다");
	}

	public static void printException() {
		System.out.println("1~3사이 숫자를 입력해주세요.");
	}
}
