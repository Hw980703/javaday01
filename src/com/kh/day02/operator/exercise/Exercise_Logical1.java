
package com.kh.day02.operator.exercise;
import java.util.*;
public class Exercise_Logical1 {
	public static void main(String[] args) {
		System.out.println("ㅎㅇ");
		//입력한 정수가 1~100 사이의 숫자인지 확인하세요!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
			boolean result = (1<=num) && (num<=100);
			System.out.println(result);		
	}
}
