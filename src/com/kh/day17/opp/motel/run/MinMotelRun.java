package com.kh.day17.opp.motel.run;

import java.util.Scanner;

import com.kh.day17.opp.motel.controller.controller;
import com.kh.day17.opp.motel.view.view;

public class MinMotelRun {

	public static void main(String[] args) throws Exception {
		
		view mv = new view();
		controller co = new controller();
		Scanner sc = new Scanner(System.in);
		boolean [] rooms = new boolean[10];
		end : 
		while(true) {
		
			int choice = mv.printMenu();
			int chosenRoom = 0;
			switch(choice) {
			case 1 : 
			
				chosenRoom = mv.inputRoomNumber("입실");
				co.checkin(chosenRoom);
				Thread.sleep(500);
				break;
			case 2 : 
				
				chosenRoom = mv.inputRoomNumber("퇴실");
				co.checkOut(chosenRoom);
			
				break;
			case 3 : 
				co.printAllRoom();
				break;
			case 4 : 
				System.out.println("프로그램을 종료합니다.");
				break end;
			}
		}
	}

}
