package com.kh.day08.oop.homework.q5;

public class person {
	String name ;
	
	int money;

	
	public void buyCoffee(Cafe caffe, int money) {
		// 돈을 가지고 커피가 나와야함.
		caffe.makeCoffee(money);
		this.money -= money;
	}
	
	public person() {}
	
	
	
	public person(String name,int money) {
		this.name = name;
		this.money = money;
		
	}
	
	public void printInfo() {
		System.out.println(this.name +"님의 잔액은 " +this.money +"원 입니다.");
	}
	
}
