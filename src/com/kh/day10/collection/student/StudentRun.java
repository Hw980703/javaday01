package com.kh.day10.collection.student;

public class StudentRun {
	
	public static void main(String[] args) {
		StudentFunction sFunc = new StudentFunction();
	
	while (true) {
		//메뉴 출력
		//메뉴 선택
		int choice = sFunc.printMenu();
		//메뉴에 따라 기능 구현
		finish:
		switch(choice) {
		case 1 : sFunc.inputInfo(); break;
		case 2 : sFunc.printInfo(); break;
		case 3 : sFunc.checkPass(); break;
		case 4 : System.out.println("프로그램이 종료 되었습니다!");break finish;
		
		
		}
		
//		public static int printMenu() { return 0;}
//		public static void inputInfo() {}
//		public static void checkPass() {}
//		public static void printInfo() {}
		
		
	}
}
}

