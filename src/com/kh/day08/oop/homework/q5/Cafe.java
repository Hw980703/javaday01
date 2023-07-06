package com.kh.day08.oop.homework.q5;

public class Cafe {
	String name;
	String coffee;
	int money;
	
	
	public Cafe() {}
	public Cafe(String name) {
		this.name = name;
	}
	
	public void makeCoffee(int money) {
		if(money ==4000) {
			System.out.println("주문하신 아이스 아메리카노 한잔 나왔습니다.");
		}else if (money==4500) {
			System.out.println("주문하신 아이스라떼 한잔 나왔습니다.");
		}
	}
}
