package com.kh.day10.collection.student;

public class Student {
	// 이름
	// 점수1
	// 점수2
	
	private String name;
	private int score1;
	private int score2;
	
	public Student() {}
	public Student(String name,int score1, int score2) {
		
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	public String getName() {
		return this.name;
	}
	
	public int getScore1() {
		return this.score1;
	}
	
	public int getScore2() {
		return this.score2;
	}
	
	public String toString() {
		return "이름 : " + this.name +", 1차 점수 : "+this.score1 + ", 2차 점수 : " + this.score2;
				
	}
	
	@Override
	public int hashCode() {
		return (this.name + this.score1 +this.score2).hashCode();
	}
	
	


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return this.hashCode() == std.hashCode();
		} else {
			return false;
		}
	
	}
}