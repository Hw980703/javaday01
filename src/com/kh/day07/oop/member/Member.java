package com.kh.day07.oop.member;

public class Member {
	//입력받을거 3개 정도 만들고
	// 캡슐화의 원칙 적용해서 구성
	
	private String memberId;
	private String memberPw;
	private String memberEmail;
	private String memberAddress;
	
	
	//이름이 같고 타입이 다르고 갯수가 다르면 오버로딩, 생성자
	
	public Member() {
		
	}
	
	public Member(String memberID, String memberPw, String memberEmail,String memberAddress) {
		
			this.memberId = memberID;
			this.memberPw = memberPw;
			this.memberEmail = memberEmail;
			this.memberAddress = memberAddress;
	}
	
	//getter 메소드
	public String getMemberId() {
		return this.memberId;
	}
	
	public String getMemberPw() {
		return this.memberPw;
	}
	
	public String getMemberEmail() {
		return this.memberEmail;
	}
	public String getMemberAddress() {
		return this.memberAddress;
	}
	
	
	
	
	//setter 메소드
	public void setMemberId(String memberID) {
			this.memberId = memberID;
	}
	
	public void setMemberPw(String memberPw){
		this.memberPw = memberPw;
	}
	
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public void setMemberAddress(String memberAdrress) {
		this.memberAddress = memberAdrress;
	}
}
