package com.kh.day08.oop.abstractpkg.exercise;

public  class GoodCalc extends Calculator{

		int result;
		int[] resultArrs;
		double avg;
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		result  = a+b;
		return result;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		result = a-b;
		return result;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[] arrs = a;
		for (int i=0; i<a.length; i++) {
			sum+=arrs[i];
		}
		avg = sum/arrs.length;
		
		return avg;
	}
		
}
