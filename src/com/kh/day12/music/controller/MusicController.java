package com.kh.day12.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day12.music.model.vo.Music;

public class MusicController {

	List<Music> mList;

	public MusicController() {
		mList = new ArrayList<Music>();

	}

	/**
	 * 마지막 위치에 곡 추가 자바독 주소, 문서로 만들어줌 첫 위치에 곡 추가
	 */
	public void addAtLast(Music music) {
		mList.add(music);
	}

	/**
	 * 첫 위치에 추가
	 * 
	 * @param music
	 */

	public void addAtZero(Music music) {
		// TODO Auto-generated method stub
		mList.add(0, music);
	}

	public void updateMusic(int index, Music music) {
		// TODO Auto-generated method stub
		mList.set(index, music);
	}

	/**
	 * 음악 전체 출력
	 * 
	 * @return mList
	 */
	public List<Music> printMusicList() {
		return mList;
	}

	public List<Music> searchMusicsByName(String title) {

		// 찾은 음악을 넣을 리스트
		List<Music> findList = new ArrayList<Music>();

		// 기존 음악이 있는 mLisㅅ 에서 찾기
		for (Music mOne : mList) {

			// 입력한 값이 같으면
			if (mOne.getTitle().equals(title)) {
				findList.add(mOne);
				// findList에 추가를 하여라.
			}
		}
		//다 찾았으면 리턴하기
		return findList;
		// TODO Auto-generated method stub

	}
	
	public int  searchOneByTitle(String title) {
		for (int i=0; i< mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				return i;
			}
	}
		return -1;
	}
	
	public void setTitle(List<Music> searchName) {
		mList.removeAll(searchName);
	}
	
	public void sortByTitleASC() {
//		int [] nums; -> mList로 변경 필요
		for (int i=0; i<mList.size() -1; i++) {
			for ( int j=0; j<mList.size()-1-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				
				//결과값이 0이면 동일함
				//양수 값이면 왼쪽이 더 순서가 높음
				//음수값이면 왼쪽이 순서가 적음
				
				if (mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j,mTwo);
					mList.set(j+1,temp);
				}
			
			}
		}
	
	}
	
	
	public void sortByTitleDESC() {
//		int [] nums; -> mList로 변경 필요
		for (int i=0; i<mList.size() -1; i++) {
			for ( int j=0; j<mList.size()-1-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				
				//결과값이 0이면 동일함
				//양수 값이면 왼쪽이 더 순서가 높음
				//음수값이면 왼쪽이 순서가 적음
				
				if (mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
					Music temp = mOne;
					mList.set(j,mTwo);
					mList.set(j+1,temp);
				}
			
			}
		}
	
	}
	
	public void sortBySingerASC() {
//		int [] nums; -> mList로 변경 필요
		for (int i=0; i<mList.size() -1; i++) {
			for ( int j=0; j<mList.size()-1-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				
				//결과값이 0이면 동일함
				//양수 값이면 왼쪽이 더 순서가 높음
				//음수값이면 왼쪽이 순서가 적음
				
				if (mOne.getSinger().compareTo(mTwo.getSinger()) > 0) {
					Music temp = mOne;
					mList.set(j,mTwo);
					mList.set(j+1,temp);
				}
			
			}
		}
	}
		
		public void sortBySingerDESC() {
//			int [] nums; -> mList로 변경 필요
			for (int i=0; i<mList.size() -1; i++) {
				for ( int j=0; j<mList.size()-1-i; j++) {
					Music mOne = mList.get(j);
					Music mTwo = mList.get(j+1);
					
					//결과값이 0이면 동일함
					//양수 값이면 왼쪽이 더 순서가 높음
					//음수값이면 왼쪽이 순서가 적음
					
					if (mOne.getSinger().compareTo(mTwo.getSinger()) < 0) {
						Music temp = mOne;
						mList.set(j,mTwo);
						mList.set(j+1,temp);
					}
				
				}
			}
	
	}

}
