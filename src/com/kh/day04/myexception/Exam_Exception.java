package com.kh.day04.myexception;
import java.util.*;
public class Exam_Exception {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 하나 입력 :");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 입력 :");
			int num2 = sc.nextInt();
			
			System.out.println("나눠드릴게요");
			int result = num1 / num2 ;
			System.out.printf("몫은 %d 입니다.!", result);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println("0을 입력하면 안됩니다.");
		}
		
				
		
	}
}
