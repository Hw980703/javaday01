package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String[] args) {
		System.out.println("테스트");
		//구구단 출력
		//1단부터 9단까지
		
		
		for (int i=1; i<10; i++) {
		
			for (int j=2; j<10; j++) {
				System.out.print(j +"*"+i+"="+i*j+"	");
			}System.out.println();
		}
	}

}
