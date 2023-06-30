package com.kh.day05.oop;

public class circle {
	public int radius;
	//원의 반지름
	
	public String name;
	//원의 이름
	
	//=================================> 필드
	
	public circle() {

	}
	//=================================>기본생성자
	//생성자 특징 : 클래스 이름과 동일, 반환값이 없다.객체 초기화.
	
	public circle(int radius,String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	//원의 넓이를 구해주는 메소드
	//=================================>메소드

		public static void main(String[] args) {
			circle circle = new circle();
			circle.radius = 44;
			System.out.println(circle.getArea());
			
			
			circle.name = "도미노피자";
			circle.radius = 10;
			
			System.out.println(circle.name + "의 면적은 " +circle.radius +"입니다"); 
		}
	
}



