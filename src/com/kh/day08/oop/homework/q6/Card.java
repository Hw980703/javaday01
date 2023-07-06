package com.kh.day08.oop.homework.q6;

public class Card {
	//소유자이름
	//카드번호
	//유효기간
	//CVC
	//비밀번호
	
	int cardNumber;
	static int serialNum = 10000;
	
	public Card() {
		cardNumber = serialNum;
		serialNum++;
	}
	
	public void printCardInfo() {
		System.out.println(this.cardNumber);
	}
}
