package com.kh.day18.member.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.member.model.vo.Member;

public class MemberDAO {
	private List<Member> mList;
	
	public MemberDAO() {
		mList = new ArrayList<Member>();
	}
	
	public int findIndexByName(String name) {
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getMemberName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public List<Member> allMemberList() {
		return mList;
	}
	
	public void modifyMember(int index, Member mOne) {
		// TODO Auto-generated method stub
		mList.set(index, mOne);
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
