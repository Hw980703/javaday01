package com.kh.day05.oop;


//접근 지정자, 접근 제한자

class Sample {
	public int a;  //모두가 사용가능 -- 모든곳에서
	private int b; //같은 클래스 -- 자신에서만
	int c; //default  //같은 클래스 같은 패키지 -- 자신과 같은 패키지

}


public class Exam_Access {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a =1;
		System.out.println(sample.a);
//		sample.b=15; // 멤버변수 b는 private 라서 보이지않아 접근할 수 없어요.
		//The field Sample.b is not visible
		//private 는 class 내에서만 사용할 수 있음.
		
		sample.c = 20;
		//default 는 접근 가능, 왜냐하면 같은 패키지이기 때문에
		System.out.println(sample.c);
	}
	}