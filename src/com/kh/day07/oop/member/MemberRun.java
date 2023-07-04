
package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberRun {
	static int index = 0;

	public static void main(String[] args) {
		
		MemberFunction mF = new MemberFunction();
		Member[] memArrs = new Member[3];

		finish: while (true) {
			int choice = mF.printMenu();
			switch (choice) {
			case 1:
				mF.inputInfo();
				break;
			case 2:
				mF.printInfo();
				break;
			case 3:
				checkPass(memArrs);
				break;
			case 4:
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			default:
				System.out.println("해당 메뉴는 존재하지 않습니다.");
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

//	private static void printInfo(Member[] memArrs) {
//		System.out.println("===== 회원 정보 출력 ======");
//		for (int i = 0; i < 3; i++) {
//			System.out.printf("%s님의 비밀번호는 %s이고, 이메일은 %s이며, 주소는 %s입니다.", memArrs[i].getMemberId(),
//					memArrs[i].getMemberPw(), memArrs[i].getMemberEmail(), memArrs[i].getMemberAddress());
//		}
//
//	}

//private static void inputInfo(Member[] memArrs) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("회원정보입력");
//	System.out.println("아이디 : ");
//	String memberId = sc.next();
//	System.out.println("비밀번호 : ");
//	String memberPw = sc.next();
//	System.out.println("이메일 : ");
//	String email = sc.next();
//	System.out.println("주소: ");
//	sc.nextLine();
//	String address = sc.nextLine();
////	memArrs[0] = new Member();
////	memArrs[0].setMemberId(memberId);
////	memArrs[0].setMemberPw(memberPw);
////	memArrs[0].setMemberEmail(email);
////	memArrs[0].setMemberAddress(address);
//	
//	memArrs[0] = new Member(memberId, memberPw, email, address);
//			
//		
//	
//	
//}

//	private static int printMenu() {
//		// TODO Auto-generated method stub
//		//회원관리 프로그램
//				//1. 회원 정보 입력
//				//3. 프로그램 종료
//				//4. 메뉴 입력:
//				
//				Scanner sc = new Scanner(System.in);
//				System.out.println("회원관리프로그램");
//				System.out.println("1. 회원정보입력");
//				System.out.println("2. 회원정보출력");
//				System.out.println("3. 프로그램 종료");
//				System.out.print("메뉴 입력 : ");
//				int choice = sc.nextInt();
//				return choice;
//	}

}
