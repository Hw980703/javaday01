package com.kh.day05.run;

import java.util.Scanner;

import com.kh.day05.oop.Book;
import com.kh.day05.oop.circle;
import com.kh.day05.oop.exercise.Rectangle;

public class Run {
	public static void main(String[] args) {
	
		
		Book littlePrince = new Book();
		littlePrince.Title = "어린왕자";
		littlePrince.writer = "김현우";
		
		Book littlePrince2 = new Book("어린왕자","김현우");
		
		Book loveStory = new Book("춘향뎐");
		
		System.out.println(loveStory.Title+ loveStory.writer);
		System.out.println(littlePrince.Title+littlePrince.writer);
		
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		Rectangle cl = new Rectangle();
		cl.width = sc.nextInt();
		cl.height = sc.nextInt();
		
		System.out.println("사각형의 합은" + cl.sum() +"입니다.");
		System.out.println("사각형의 면적은" + cl.getArea() +"입니다.");
		
		System.out.println("실행 테스트");
		
		
		circle circle = new circle();
		circle circle2 = new circle();
		circle circle3 = new circle();
		circle circle4 = new circle();
		
		circle.radius =3;
		circle2.radius = 100;
		circle3.radius= 200;
		circle4.radius = 400;
		
		System.out.println(circle.getArea());
		System.out.println(circle2.getArea());
		System.out.println(circle3.getArea());
		System.out.println(circle4.getArea());
		
		
		circle donut = new circle(2,"청년도넛");
		
//		donut.radius = 2;
//		donut.name = "노티스도넛";
		double area = donut.getArea();
		System.out.printf("%s의 면적은 %.2f",donut.name,area);
		
		System.out.println();
		circle pizza;
		pizza = new circle(10,"청년피자");
		
		System.out.println(pizza.radius + pizza.name);
		
		
	
		
		
	}
}
