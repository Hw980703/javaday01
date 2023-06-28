package com.kh.day02.basic;

public class Exam_printSample {
	public static void main(String[] args) {
		System.out.println("개행이 포함된 출력 메소드");
		System.out.print("개행이 없이 출력 메소드");
		System.out.println("<- 바로 옆으로 붙어버림");
		
		//%d 정수
		//\n 개행
		//\t 탭크기만큼 띄우기
		//%f 실수 %.3f 는 세번째자리까지 출력
		//%s 문자열 출력
		System.out.printf("정수 출력 : %d\n", 11);
		System.out.printf("실수 출력 : %.3f\n",10.26);
		System.out.printf("문자열 출력 : %s","자바 printf 문자열 출력");
		System.out.printf("$c반 $s과정 $f개강 %f종강 입니다", 'F',"공공데이터 개발자",5.15,10.26);
	}
}
