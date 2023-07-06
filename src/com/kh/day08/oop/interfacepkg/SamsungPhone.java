package com.kh.day08.oop.interfacepkg;


// a superclass must be a class => extends 안됨!
public class SamsungPhone implements PhoneInterface{
	// 2. The type Samsung Phone must implement
	//		the inherited abstract method PhoneInterface.receiveCall(
	//		==> 오버라이딩 해야돼!!!
	
	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야~");
	}
	
	@Override
	public void sendCall() {
		System.out.println("뚜루루루루루");
	}
	
	@Override
	public void printLogo() {
		System.out.println(" ==== SAMSUNG ====");
	}

}
