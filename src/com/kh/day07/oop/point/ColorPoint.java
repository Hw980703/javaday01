package com.kh.day07.oop.point;


public class ColorPoint extends point{
	private String color;
	public ColorPoint() {}
	public ColorPoint(int x, int y, String color) {
//		super.x = x;
		super(x,y);
		this.color=color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		super.showPoint(); //부모에게서 왔다 
		showPoint(); // 넌 어디에서 왔니? 난 부모에게서 왔어 super 키워스 생략되어 있음
	}

}
