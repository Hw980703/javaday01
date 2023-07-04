package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.ColorPoint;
import com.kh.day07.oop.point.point;

public class Eaxm_inheritance {
	public static void main(String [] args) {
		// (x,y)의 한점을 표현하는 Point 클래스와 이를 상속받아 색을 가진 점을 표현하는
		// ColorPoint 클래스를 만들고 활용해보자~
		point p = new point(1,2);
//		p.set(1, 2);
		p.showPoint();
		ColorPoint cp = new ColorPoint(3,4,"blue");
		System.out.println();
//		cp.set(3, 4);
		cp.showPoint();
		System.out.println();
		cp.setColor("red");
		cp.showColorPoint();
		ColorPoint cp2 = new ColorPoint(5,6,"red");
		cp2.showColorPoint();
		
	}
}




