package com.kh.day11.iostream.fileio.exercise;

import java.io.File;

public class Exam_ShowFileList {
	public static void main(String[] args) {
		
		String window = "C:\\Windows";
		
		File file = new File(window+"\\");
		File [] subFiles = file.listFiles();
		
		
		System.out.println(window +", " +window);
		System.out.println("----- "+window+"의 서브 리스트 입니다. -----");
			for ( int i=0; i< subFiles.length; i++) {
				File fOne = subFiles[i];
				long time = fOne.lastModified();
				System.out.printf("%-35s",fOne.getName());
				System.out.print("파일 크기 : "+ fOne.length()+"\t");
				// %tb 는 현재의 날짜를 영문 약자 (월)로 출력(한글은 숫자 + 월 출력)
				// %td 는 현재의 날짜를 01~31일(일) 형식으로 출력
				// %ta 는 현재의 날짜를 요일 영문 약자 형식으로 출력(한글 월/화/수)
				// %tT 는 현재의 시간을 몇시 몇분 몇초로 나타냄. 몇시 : 몇분 : 몇초
				
				System.out.printf("수정한 시간 : %tb %tb %ta %tT \n",
						time
						,time
						,time
						,time);
			}
	
		
	}
}
