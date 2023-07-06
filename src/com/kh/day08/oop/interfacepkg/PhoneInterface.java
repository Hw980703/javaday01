package com.kh.day08.oop.interfacepkg;

public interface PhoneInterface {
		
	// 2. The blank final field name may not have been initialized
	
	public String name ="";
	public static final int time_out = 10000;
	public abstract void receiveCall();
	//Abstract methods do not specify a body 몸체 없애라
	
	void sendCall();
	public default void printLogo(){
		
		//	디폴트 메소드
		// 하위 호환성을 위해서 작성함
		// 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
		
		
	}
	}
	
	
	

