package com.kh.day17.opp.motel.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day17.opp.motel.domain.vo.Room;

public class controller {
	
		List<Boolean> rList;
		
		public controller(){
				rList = new ArrayList<Boolean>();
				for (int i=0; i<10; i++) {
					rList.add(false);
				}
				
		}
		
		public void checkin(int roomNo) {
			
			if(roomNo > 0 && roomNo <= 10) {
				Boolean romm = rList.get(roomNo-1);
				
				if(!romm) {
					rList.set(roomNo-1, true);
					System.out.println(roomNo + "번 방에 입실하셨습니다.");
				}else {
					System.out.println(roomNo + "번방은 현재 손님이 있습니다.");
				}
			}else {
				System.out.println("1번 방부터 10번방까지 준비되어 있습니다.");
			}
		}
//		public void checkOut(int roomNo) {
//			
//			if(roomNo > 0 && roomNo <= 10) {
//				Boolean romm = rList.get(roomNo-1);
//				
//				if(romm) {
//					romm = false;
//					System.out.println(roomNo + "번 방에 입실하셨습니다.");
//				}else {
//					System.out.println(roomNo + "번방은 현재 손님이 있습니다.");
//				}
//			}else {
//				System.out.println("1번 방부터 10번방까지 준비되어 있습니다.");
//			}
//		}
		
		public void printAllRoom() throws InterruptedException {
			for(int i = 0; i < rList.size(); i++) {
				if(!rList.get(i))
					System.out.println((i+1)+"번 방이 현재 비어 있습니다.");
				else
					System.out.println((i+1)+"번 방에는 현재 손님이 있습니다.");
			}
			Thread.sleep(2000);
		}
		
		public void checkOut (int chosenRoom) throws InterruptedException {
			
			if(chosenRoom > 0 && chosenRoom <= 10) {
				Boolean romm = rList.get(chosenRoom-1);
				if(romm) {
					rList.set(chosenRoom-1, false);
					System.out.println(chosenRoom + "번 방에 퇴실하셨습니다.");
				}else {
					System.out.println(chosenRoom + "번방은 현재 빈 방입니다.");
				}
				Thread.sleep(500);
			}else {
				System.out.println("1번 방부터 10번방까지 준비되어 있습니다.");
			}
		}
}
