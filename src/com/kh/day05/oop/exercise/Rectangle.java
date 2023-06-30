package com.kh.day05.oop.exercise;
import java.util.*;
public class Rectangle {
		//너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램을 작성하라
	// 너비와 높이 필드 그리고 면적 값을 제공하는 getArea()메소드를 가진
	//Rectangle 클래스를 만들어라.
	
	
	public int width;
	public int height;
	
	public Rectangle() {
	}
	//===================>기본 생성자

	
	
	
	
	
	
	
	public double sum() {
		return (width*2) + (height*2);
	}
	public double getArea() {
			return 3.14*width*height;		
	}
	
	public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle cl = new Rectangle();
		cl.width = sc.nextInt();
		cl.height = sc.nextInt();
		
		System.out.println("사각형의 합은" + cl.sum() +"입니다.");
		System.out.println("사각형의 면적은" + cl.getArea() +"입니다.");
		
	}
}
