package com.kh.day08.oop.abstractpkg.exercise;

public class CalcRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new GoodCalc();
		//추상 클래스는 객체 생성이 안됨.
		
		int [] a= {1,2,33,44,22,131,214};
		
		System.out.printf("평균 : %.2f",calc.average(a));
		System.out.println();
		System.out.println("합 : " +calc.add(1, 3));
		System.out.println("차 : " + calc.substract(3,4));
		
	}

}
