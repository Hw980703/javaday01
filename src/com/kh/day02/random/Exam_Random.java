package com.kh.day02.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String[] args) {
		System.out.println("테스트");
		Random rand = new Random();
		
	System.out.println(rand.nextInt(10));
		
		for (int i=0; i<10; i++){
			System.out.println(rand.nextInt(10));
		}
		
		//1부터 10까지의 수 중에 랜덤한 값을 출력하고 싶으면?
		//0부터 9까지 값이 된다.
		// 0부터 9까지 -> nextInt(;
		//1부터 10일까지 -> nextInt(10) +1;
		//25부터 35 사이의 랜덤한 수 출력하기
		//0부터 10사이 -> nextInt();
		// 25부터 35 - >nextInT(11)+25;
		
	}	
}
