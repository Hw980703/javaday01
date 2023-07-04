package com.kh.day07.oop.point;

public class point{
	
	public int pub;
	int def;
	protected int pro; 
	//protected 다른 패키지의 자식도 접근을 가능하게 해줌
	private int pri;
	
	private int x,y;
	public point() {}
	public point(int x,int y) {
		this.x =x;
		this.y =y;
		
	}
	public void showPoint() {
		System.out.printf("%d ,%d",x,y);
	}
}