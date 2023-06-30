package com.kh.day05.oop;


class StaticSample {
	public int num;
	
	public static int input;
	
	public void sampleMethod() {
		
	}
	
	public void goodMethod() {
		
	}
	
	public static void originMethod() {
		input = 124245;
	}
}

public class Exam_Static {
	public static void main(String[] args) {
		StaticSample sample = new StaticSample();
		sample.num = 26;
		StaticSample.input = 50;
		System.out.println(StaticSample.input);
		
		StaticSample.originMethod();
		System.out.println(StaticSample.input);
		
	}
}
