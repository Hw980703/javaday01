package com.kh.day08.oop.homework.q5;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person kim = new person("김씨",10000);
		kim.buyCoffee(new StarCafe(), 5500);
//		System.out.println("김씨의 남은돈 : "+ kim.money);
		System.out.println();
		person lee = new person("이씨",10000);
		lee.buyCoffee(new CongCafe(), 4000);
//		System.out.println("이씨의 남은돈 : "+ lee.money);
		
		kim.printInfo();
		lee.printInfo();
		
		System.out.println("---------------------------------------------");
		System.out.println("레벨업 했습니다!!");
		System.out.println("************* [LEVEL] ");
		System.out.println(" 		스텟 힘 증가 +5");
		System.out.println("		현재 스텟 힘 : ");
		System.out.println("---------------------------------------------");
	}

}
