package com.kh.day06.oop.student;

public class StudentMin {
	// 이름
	// 첫번째 성적
	// 두번째 입력
	// 평균 출력
	private String name;
	private int num1;
	private int num2;
	
	public StudentMin() {}
	
	public StudentMin(String name, int firstScore, int secondScore) {
		this.name = name;
		this.num1 = firstScore;
		this.num2 = secondScore;
	}
	
	public double getAvg() {
		double avg = (double)(this.num1
				+this.num2)/2;
		return avg;
	}
	// getter 메소드
	public String getName() {
		return this.name;
	}
	
	public int getNum1() {
		return this.num1;
	}
	
	public int getNum2() {
		return this.num2;
	}
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFirstScore(int firstScore) {
		this.num1 = firstScore;
	}
	
	public void setSecondScore(int secondScore) {
		this.num2 = secondScore;
	}
	
	
}











