package com.kh.day04.myexception.exercise;

import java.util.*;

public class Exercise_Exception {

	public void exercise11() {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
		// 다시 입력받는 프로그램을 작성하여라.
		Scanner sc = new Scanner(System.in);
		for (;;) {
			try {
				
				System.out.println();
				System.out.println("정수를 입력하세요.");
				int num1 = sc.nextInt();

				System.out.println("나눌 정수를 입력하세요.");
				int num2 = sc.nextInt();
				int result;
				result = num1 / num2;
				System.out.println(num1 + "을" + num2 + "로 나누면" + "몫은 " + result + "입니다.");

			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
				System.out.println();
			} catch (InputMismatchException t) {
				System.out.println("문자 말고 정수를 입력하세요.");
				sc.next();
			}

		}
	}
	
	
	
	public void practice2() {
		
		// 3개의 정수를 입력 받아 합을 구하는 프로그램을 작성하여라.
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 inputMismatchExceiption 예외를
		// 처리하여 다시 입력 받도록 하여라.
		
		Scanner sc = new Scanner(System.in);
		for (;;) {
		try {
			System.out.println();
			System.out.println("첫번째 정수를 입력하세요.");
			int num1 = sc.nextInt();
			
			System.out.println("두번째 정수를 입력하세요.");
			int num2 = sc.nextInt();
			
			System.out.println("세번째 정수를 입력하세요.");
			int num3 = sc.nextInt();
			
			System.out.println();
			int result =  num1+num2+num3;
			System.out.println(num1+"+"+num2+"+"+num3+"의 합은"+result+"입니다.");
			
		}
		
		catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요!!");
			sc.next();
		}
		}
	}
	
	
	
	
}
