package com.kh.day02.operator;
import java.util.*;

public class Exam_Triple {
	public static void main(String[] args) {
		
		System.out.println("ㅎㅇ");
		
		//삼항연산자
		// 조건식 ? 참 : 거짓
		// -조건식은 반드시 true /false 로 반환
		// -비교/논리연산자 주로 사용
		// 예제
		// 정수를 입력 받아 짝수인지 홀수 인지 판별하는
		// 프로그램을 만드시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		String str ="";
		
		str = (num%2 ==0) ? "짝수" : "홀수";
		System.out.println(str);
		
		
	}

}
