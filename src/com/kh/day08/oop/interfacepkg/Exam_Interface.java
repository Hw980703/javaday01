package com.kh.day08.oop.interfacepkg;

public class Exam_Interface {
	public static void main(String[] args) {
		PhoneInterface phone = new SamsungPhone();
		
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
	}
}
