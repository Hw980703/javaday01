package com.kh.day08.oop.abstractpkg;

class Line extends Shape{
	//4.The type Line must implement the inherited abstract method Shape.draw()
	//=>추상 메소드 오버라이딩해, 안할거면 class에 abstract 붙여
	@Override
	 public void draw();{
		 
	 }
	
}

public abstract class Shape {
	public Shape () {}
	
	public void paint() {}
	abstract public void draw();
	
	//Abstract methods do not specify a body
	//몸체가 있으면 안돼. {} 지우고 세미콜론 ; 붙이기
	//The abstract method draw in type Shape can only be defined by an abstract class
	


}
