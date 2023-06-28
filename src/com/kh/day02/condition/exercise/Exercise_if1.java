package com.kh.day02.condition.exercise;
import java.util.*;
public class Exercise_if1 {
	public static void main(String[] args) {
		System.out.println("ㅎㅇ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int num = sc.nextInt();
		System.out.println("학년을 입력하세요 . ex) 2학년");
		int str = sc.nextInt();
		
		
		if(str==4 && num >= 70) {
				System.out.println("합격입니다.");
			}else if (str != 4 && num >= 60) {
				System.out.println("합격입니다.");
			} else {System.out.println("불합격입니다.");}
			
		
		//점수와 학년을 입력 받아 60점 이상이면 합격, 
		//미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격이다.
	}

}
