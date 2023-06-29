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
	
	
	//문자를 입력받은 경우 다시 받을 수 있게 해준다..!!ㅋㅋㅋ^^
public void exercise2() {		// 3개의 정수를 입력 받아 합을 구하는 프로그램을 작성하여라.
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 inputMismatchExceiption 예외를
		// 처리하여 다시 입력 받도록 하여라.
		int sum =0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<3; i++) {
			System.out.print(i+">>");
		try {
			sum+=sc.nextInt();
		}catch(InputMismatchException e){
			System.out.println("정수가 아닙니다.다시 입력하세요!");
			sc.next(); //입력한 문자를 제거
			i--; // i를 줄이고 전단계로 돌아간다.
			continue; // i++로 가게 해줌.진행
		}
		
		
		} System.out.println(sum);
		
	}





public void exercise3() {
		//범위를 벗어난 배열의 접근
	
	
	
		int [] intArrs=new int[5];
		
		try {
			
			System.out.println(intArrs[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어났음!!");
		}
}

public void exercise4() {
	//정수가 아닌 문자열을 정수로 변환 할 때 예외 발생
	// (NumberFormatException)
	String[] str = new String[2];
	str[0]="1026";
	str[1]="5.15";
	
	//String - int
	
	try {
	int result  =Integer.parseInt(str[0]);
	System.out.println(result);
	
	int check = Integer.parseInt(str[1]);
	System.out.println(check);}
	
	catch(NumberFormatException e) {
		System.out.println("정수로 변환 할 수 없습니다.");
	}
	
}
	

	
	
	
	
}
