
package com.kh.day06.oop.member;

import java.util.Scanner;

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
					default : System.out.println("해당 메뉴는 존재하지 않습니다.");
					break;
				}
			}
		
		
	}
	
	private static void inputScore(Member[] memArrs) {
		
	}
	
private static void printScore(Member[] memArrs) {
		
	}
private static void checkPass(Member[] memArrs) {
	
}

private static void printInfo(Member[] memArrs) {
	
}

private static void inputInfo(Member[] memArrs) {
	System.out.println("회원정보입력");
	System.out.println("아이디 : ");
	System.out.println("비밀번호 : ");
	System.out.println("이메일 : ");
	System.out.println("주소: ");
}


	private static int printMenu() {
		// TODO Auto-generated method stub
		//회원관리 프로그램
				//1. 회원 정보 입력
				//3. 프로그램 종료
				//4. 메뉴 입력:
				
				Scanner sc = new Scanner(System.in);
				System.out.println("회원관리프로그램");
				System.out.println("1. 회원정보입력");
				System.out.println("2. 회원정보출력");
				System.out.println("3. 프로그램 종료");
				System.out.print("메뉴 입력 : ");
				int choice = sc.nextInt();
				return choice;
	}

}
