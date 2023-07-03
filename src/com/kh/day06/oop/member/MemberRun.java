package com.kh.day06.oop.member;

public class MemberRun {

	public static void main(String[] args) {
		
		Member[] memArr=new Member[3];
		
		finish :
			while(true) {
				int choice = printMenu();
				switch(choice) {
				case 1 : 
					inputScore(memArr);
					break;
				case 2 :
					printScore(memArr);
					break;
				case 3 : 
					checkPass(memArr);
					break;
				case 4 : 
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				}
			}
		
		
	}

	private static int printMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

}
