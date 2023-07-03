package com.kh.day06.oop.exercise;

public class Student2 {
	String name;
	 int koScore;
	 int engScore;
	int mathScore;
	int sum;
	double avg;

	public Student2() {
		name = "";
		koScore = 0;
		engScore = 0;
		mathScore = 0;
		sum=0;
		avg=0;

	}
	
	public Student2 ( String name) {
		this.name = name;
	}

	public Student2(int kor, int eng, int math) {
		this.koScore = kor;
		this.engScore = eng;
		this.mathScore = math;

	}
	
	public Student2(String name , int kor , int eng , int math) {
		this.name =name;
		this.koScore = kor;
		this.engScore = eng;
		this.mathScore = math;
	}
	
	public int getTotal() {
		int total = this.koScore + this.engScore + this.mathScore;
		return total;
		
	}
	public double getAvg() {
		double Avg = this.getTotal()/3;
		return Avg;
	}
}
