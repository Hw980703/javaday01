package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void forexercise1() {

		System.out.println("ㅎㅇ");
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if (i!=10) {
			System.out.print(i+"+");}
			else {System.out.print(i+"=");}
			sum+=i;
		}System.out.print(sum);
	}
	
	public void forexercis2() {
		System.out.println("ㅎㅇ");
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num = sc.nextInt();
		if (num >=1 && num <=9) {
			for (int i=1; i<10; i++) {
			System.out.println(num +"x" +i+"="+num*i);
			}
		}else {System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다");}
	}
	
	public void fordoubleexercise1() {
		System.out.println("테스트");
		//구구단 출력
		//1단부터 9단까지
		
		
		for (int i=1; i<10; i++) {
		
		for (int j=2; j<10; j++) {
				System.out.print(j +"*"+i+"="+i*j+"	");
			}System.out.println();
		}
		
	}
	public void fordoubleexercise2() {

		for (int i=0; i<24; i++) {
			for (int j=0; j<60; j++) {
				System.out.printf("%2d시 %2d분\n", i, j);
			}
		}
		
	}
	
	public void fordoubleexercise3()
	{	for (int i =0; i<10; i++) {
		for (int j=0; j<i+1; j++) {
			System.out.print("*");
		}System.out.println();
	}

	}
}
