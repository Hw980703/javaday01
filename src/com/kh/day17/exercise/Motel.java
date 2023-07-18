package com.kh.day17.exercise;

import java.util.Scanner;

public class Motel {
	public static void main(String[] args) throws Exception {
		boolean[] rooms = new boolean[10];

		System.out.println("모텔 관리 프로그램 v1.0");
		end : 
		while(true) {
		System.out.print("1.입실\t 2.퇴실\t 3.방보기\t 4.종료\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			for ( int i=0; i<rooms.length; i++) {
				if ( !rooms[i])
				System.out.println((i+1)+"번 방이 현재 비어 있습니다.");
				else
					System.out.println((i+1)+"번 방에는 현재 손님이 있습니다.");
			}
			System.out.println();
			System.out.println("몇번 방에 입실 하시겠습니까??");
			int choseRoom = sc.nextInt();
			if ( choseRoom>=1)
			rooms[choseRoom -1] = true;
			break;
		case 2: 
			for ( int i=0; i<rooms.length; i++) {
				if ( !rooms[i])
				System.out.println((i+1)+"번 방이 현재 비어 있습니다.");
				else
					System.out.println((i+1)+"번 방에는 현재 손님이 있습니다.");
			}
			System.out.println();
			System.out.println("몇번 방에에서 퇴실 하시겠습니까?");
			int exitRoom = sc.nextInt();
			if ( exitRoom>=1)
			rooms[exitRoom -1] = false;
			break;
		case 3:
			
			for ( int i=0; i<rooms.length; i++) {
				if ( !rooms[i])
				System.out.println((i+1)+"번 방이 현재 비어 있습니다.");
				else
					System.out.println((i+1)+"번 방에는 현재 손님이 있습니다.");
			}
			Thread.sleep(2000);
			break;
		case 4:
			System.out.println("프로그램을 종료 합니다.");
			break end;

		}
		}
	}
}
