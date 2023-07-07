package com.kh.day10.collection.music;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MusicRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,MusicFunction> MapArrs = new HashMap<String,MusicFunction>();
		MusicFunction mFunc = new MusicFunction();
		
		while(true) {
			
		int select = mFunc.printMenu();
		switch(select) {
		
		case 1 :
			mFunc.inputMusicInfo();
			break;
		case 2 :
			mFunc.inputMusicAtFirst();
			break;
		case 3 :
			mFunc.printAllMusics();
			break;
		case 4 :
			mFunc.printOneByTitle();
			break;
		case 5 :
			mFunc.removeMusicByTitle();
			break;
			
		case 6 : mFunc.modifyMusicInfo();
		break;
			
//		case 3 : MapArrs.get("lastmusic"); break;
	
		}
		}
	}
	
	

}
