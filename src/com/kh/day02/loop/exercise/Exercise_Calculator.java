package com.kh.day02.loop.exercise;
import java.util.*;

import javax.swing.border.MatteBorder;

public class Exercise_Calculator {
	public static void main(String[] args) {
		System.out.println("계산기가 시작됩니다.");
		Scanner sc = new Scanner(System.in);
			int num1 = 0;
			int num2 = 0;
			String math = "";
			int result = 0;
		for (int i=0; i<3; i++) {
			System.out.print("정수 하나 입력 : ");
			num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			num2 = sc.nextInt();
			System.out.print("연산자 입력(+,-,*,/,%): ");
			math = sc.next();
			switch(math) {
			case "+":result =num1 + num2; break;
			case "-":result =num1 - num2; break;
			case "*":result =num1 * num2; break;
			case "/":result =num1 / num2; break;
			case "%":result =num1 % num2; break;
			}System.out.print(num1+math+num2+"="+result);
			System.out.println();	
		}System.out.println("계산기를 종료합니다");
	}

}
