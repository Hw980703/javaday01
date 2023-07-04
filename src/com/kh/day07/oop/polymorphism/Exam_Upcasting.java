package com.kh.day07.oop.polymorphism;

public class Exam_Upcasting {
	public static void main(String[] args) {
		student std = new student();
		person p = new person();
		
		person parent = new student("일용자");
		System.out.println(parent.name);
		parent.id = "갸갸";
		
		
		
		System.out.println(((student)parent).grade);
		//다운캐스팅 
		
	}
}
