package com.kh.day09.objectpkg;

public class Eaxm_PointEquals {
	private int x,y;
	public Eaxm_PointEquals() {}
	public Eaxm_PointEquals(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	@Override
	public String toString() {
		return " x : " + this.x +", y : " + this.y;
	}
	
	public boolean equals(Object obj) {
		point p =(point)obj;
		if(x == p.x && y == p.y) {
			return true;
		}else {
			return false;
		}
	}
} 

//
//  /\
// /   \ㅡ
///  \ㅡ 
/// /
///