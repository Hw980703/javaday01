package com.kh.day18.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.member.model.dao.MemberDAO;
import com.kh.day18.member.model.vo.Member;
import com.kh.day18.member.view.MemberView;

public class MemberController_prev {
	private List<Member> mList;
	private MemberView view;
	MemberDAO memberDao = new MemberDAO();

	public MemberController_prev() {
//		view = new MemberView();
//		mList = new ArrayList<Member>();
	}

	
	
	/**
	 * 이름으로 인덱스 찾기
	 * @param name
	 * @return
	 */

	public int findIndexByName(String name) {
		int index = memberDao.findIndexByName(name);
		return index;
	}
	
	
	public void modifyMember(int index, Member mOne) {
		memberDao.modifyMember(index, mOne);
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

		return memberDao.findOneByName(name);
	}
	
	
	
	/**
	 * 회원정보 전체 출력
	 * @return
	 */
	public List<Member> allMemberList() {
		return memberDao.allMemberList();
	}
	
	/**
	 * 회원정보 등록
	 * @param member
	 */
	public void addMember(Member member) {
	memberDao.addMember(member);
	}
	
	
	
	/**
	 * 회원정보 삭제
	 * @param index
	 */
	
	public void subMember (int index ) {
	memberDao.subMember(index);
	}

}
