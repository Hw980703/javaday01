package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.point;

class Parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {
		
	}
	
	class Child extends Parent {
		private int childMoney;
		public Child() {}
			void set() {
				super.pub =1;
				super.def =2;
				super.pro =3;
//				super.pri = 4; // 안된다
			}
		}
	}

class ShapePoint extends point {
		private String shape;
		public ShapePoint() {}
		void set() {
			
			super.pub = 1;
//			super.def = 2; //private
			super.pro = 3;
			// protected 라서 접근가능함.다른 패키지 자식도 접근허용함
//			super.pri =4 //private
		}
}

public class Exam_Protected {
	public static void main(String[] args) {
		
	}
}
