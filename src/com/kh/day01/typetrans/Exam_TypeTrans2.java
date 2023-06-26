package com.kh.day01.typetrans;

public class Exam_TypeTrans2 {
	public static void main(String[] args) {

		byte bNum=127;
		int iNum =100;
		int iNum2 = 10;
		double dNum = 4.0;
		
		
		//자동 형변환
		System.out.println(bNum + iNum);
		//byte 가 int 로 자동형변환이 됨
		
		System.out.println(iNum2 / dNum);
		//int 가 double 로 바뀜
		
		//강제 형변환
		
		System.out.println((byte)(bNum + iNum));
		System.out.println((int)2.9 + 1.8);
		// double -> int 강제 형변환임
		// 양수 작은거부터 INT 음수 큰거로는 DOUBLE 자동으로 바뀜
		System.out.println((int)(2.9+1.8));
			
	}

}
