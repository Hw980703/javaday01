package com.kh.day18.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.member.model.vo.Member;
import com.kh.day18.member.view.MemberView;

public class MemberController {
	private List<Member> mList;
	private MemberView view;

	public MemberController() {
		view = new MemberView();
		mList = new ArrayList<Member>();
	}

	public void startMemberProgram() {
		Member mOne = null;
		String name = "";
		finish: while (true) {

			int choice = view.printMenu();
			switch (choice) {
			case 1:
				mOne = view.inputMember();
				addMember(mOne);
				break;
			case 2:
				name = view.inputMemberName();
				int index = findIndexByName(name);
				mOne = findOneByName(name);
				if ( index !=-1) {
					mOne =	view.modifyMember(mOne);
				}
				modifyMember(index, mOne);
				
				break;
			case 3:
				name = view.inputMemberName();
				 index = findIndexByName(name);
				subMember(index);
				break;
			case 4:
				name = view.inputMemberName();
				mOne = findOneByName(name);
				view.printOneMember(mOne);

				break;
			case 5:
				view.printAllMembers(allMemberList());
				break;
			case 6:
				break finish;

			}

			// 회원관리 프로그램
			// 1. 회원 정보 등록
			// 2. 회원 정보 수정
			// 3. 회원 정보 삭제
			// 4. 회원 정보 출력(이름)
			// 5. 회원 전체 정보 출력

		}

	}
	
	public void modifyMember(int index, Member mOne) {
		// TODO Auto-generated method stub
		mList.set(index, mOne);
	}

	/**
	 * 이름으로 인덱스 찾기
	 * @param name
	 * @return
	 */

	public int findIndexByName(String name) {
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getMemberName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 이름으로 회원 정보 찾기
	 * @param name
	 * @return
	 */
	public Member indexMember(int index) {
	
		
		
		return mList.get(index);
	}
	

	public Member findOneByName(String name) {

		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getMemberName().equals(name)) {
				return mList.get(i);

//				mList.get(i).toString();
			}
		}
		return null;
	}
	
	/**
	 * 회원정보 전체 출력
	 * @return
	 */
	public List<Member> allMemberList() {
		return mList;
	}
	
	/**
	 * 회원정보 등록
	 * @param member
	 */
	public void addMember(Member member) {
		mList.add(member);
	}
	
	/**
	 * 회원정보 삭제
	 * @param index
	 */
	
	public void subMember (int index ) {
		mList.remove(index);
	}

}
