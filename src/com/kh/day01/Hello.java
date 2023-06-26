package com.kh.day01;

public class Hello {
	public static int sum(int num1, int num2) {
		//void는 반환형이 아니어서 return 을 안써도 되지만
		// int는 반환해야해서 return 을 작성해야함.
		return num1 + num2;
	}
	public static void main(String[] args) {
	
		int i;
		i = 21;
		System.out.println(i);
		char a;
		a ='?';

		
				System.out.println(a);
				System.out.println("Hello");
				System.out.println(sum(2,4));
			
				switch (i) {
				case 20 : System.out.println("i는 20입니다");
				default : System.out.println("i는 몇인지 모릅니다");
				break;
				}
				
	}
	
	
}
