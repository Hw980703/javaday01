package com.kh.day09.objectpkg;

class Rect{
	int width;
	int height;
 
	public Rect() {}
	public Rect(int width, int height){
		this.width= width;
		this.height = height;
		
	}
	public boolean eqauls(Object obj) {
		Rect r = (Rect)obj;
		if(width* height==6) {
			return true;
		}else {return false;}
	}
}

class point{
	int x,y;
	String result;
	
	public point() {}
	public point(int x, int y){
		this.x= x;
		this.y = y;
		
	}
	public boolean eqauls(int x, int y) {
	
		if(this.x ==x && this.y == y) {
			return true;
		}else {return false;}
	}
}




public class Exam_Equals {
	public static void main(String[] args) {
		
		Rect rect1 = new Rect(2,3);
		Rect rect2 = new Rect(2,3);
		if(rect1.eqauls(rect2)) {
			System.out.println("a is equal to b");
		}
		else {
			System.out.println("a is not equal to b");
		}
		point p = new point(2,3);
		point p1 = new point(2,3);
		if(p.equals(p1)) {
			System.out.println("좌표가 같습니다.");
		}
		else {
			System.out.println("좌표가 다릅니다");
		}
		
		
		
		
		
	}
}
