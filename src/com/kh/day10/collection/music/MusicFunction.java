package com.kh.day10.collection.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicFunction {
	public static String musicName;
	public static String musicianName;
	
	List<Music>mList;
	
	public MusicFunction() {
		mList = new ArrayList<Music>();
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.println("메뉴 선택 >>");
		
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title,singer);
		mList.add(music);
	}
	
		
	//1번
//	public MusicFunction(String music, String musician) {
//		musicName = music;
//		musicianName = musician;
//		System.out.println("곡명 : "+musicName);
//		System.out.println("가수명 : "+musicianName);
//		
//		
//	}
	public String toString() {
		return "곡명 : " + this.musicName +", 가수명 : "+this.musicianName ;
				
	}
	//2번
	
	public static void twoSelect(String music , String musician) {
		musicName = music;
		musicianName = musician;
		
	}
	public static String allMusic() {
		
		
		return musicName + musicianName; 
	}
	
	//3번
	public static void Select3() {
		System.out.println();
		System.out.println("====== 전체 곡 목록 출력 ======");
		System.out.println("1번째 노래 -> 곡명 : " +musicName );
		System.out.println("가수명 : " + musicianName);
		System.out.println("[서비스 성공]: 조회 성공!");
		System.out.println();
	}

	public void inputMusicAtFirst() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title,singer);
		mList.add(0,music);
		
	}
	
	//음악 전체 출력
	public void printAllMusics() {
		for (int i=0; i< mList.size(); i++) {
			Music music = mList.get(i);
			System.out.printf("%d번째 노래 -> 곡명 : %s, 가수명 : %s\n",(i+1),music.getTitle( ),music.getSinger());
			
		}
		
	}
	
	//곡명으로 음악 검색하기
	public void printOneByTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 곡 입력 : ");
		String title = sc.nextLine();
		
		for (Music music : mList) {
			if(music.getTitle().equals(title)) {
				System.out.printf("%d번째 노래 -> 곡명 : %s, 가수명 : %s\n",1,music.getTitle( ),music.getSinger());
		
			break; //찾았으면 그만 나와
			}
		
			
		}
		
		//곡명으로 음악 삭제하기
		
	
		
	}
	
	public void removeMusicByTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 곡 입력 : ");
		String title = sc.nextLine();
		
		for (int i=0; i< mList.size(); i++) {
			Music music = mList.get(i);
			if (music.getTitle().equals(title)) {
				mList.remove(i);
				break;
		
//		for (Music music : mList) {
//			if (music.getTitle().equals(title)) {
//				break;
				
				
			}
		}
		
		
	
		
		
	}	public void modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 곡 입력 : ");
		String title = sc.nextLine();
		System.out.println("수정할 정보 입력(곡명) : ");
		String modTitle = sc.nextLine();
		System.out.println("수정할 정보 입력(가수명) : ");
		String modTSinger = sc.nextLine();
		Music modMusic = new Music(modTitle, modTSinger);
		for (int i=0; i<mList.size(); i++) {
			Music music = mList.get(i);
			if (music.getTitle().equals(title)) {
				mList.set(i, modMusic);
				
			}
		}
	
	}
	
}
