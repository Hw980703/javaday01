package com.kh.day06.oop.objectarray;

public class Exam_ObjectArray {
	public static void main(String[] args) {
		System.out.println("실행테스트");
		
//		Circle c = new Circle();
//		c.radius = 10;
//		double result = c.getArea();
//		System.out.println(result);
		
		Circle[] cArray;
		cArray = new Circle[5];
		
	
		
		cArray[0] = new Circle();
		System.out.println(cArray[0]);
		cArray[0].radius = 10;
		Circle c = cArray[0];
				System.out.println(c.radius);
				
				for (int i=0; i<cArray.length; i++) {
					cArray[i] = new Circle(i);
				}
				
				for (int i=0; i<cArray.length; i++) {
						System.out.println(cArray[i].radius);
				}
	}
}
