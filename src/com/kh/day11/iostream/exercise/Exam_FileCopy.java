package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// C드라이브에 있는 파일을 E드라이브로 복사
		// 입력 스트림
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Users\\user1\\Pictures\\폴더정리채점.PNG");
			os = new FileOutputStream("G:\\samsung\\Pictures.PNG");
			byte [] readBytes = new byte[1024];
			int readByteCount;
			// 파일 복사 -> 읽어 들인 후 원하는 경로에 출력하기
			
			while 
				((readByteCount = is.read(readBytes)) != -1) {
				
					os.write(readBytes , 0, readByteCount);
				
				};
			
			
			
			System.out.println("복사가 완료 되었습니다!@!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 출력 스트림
		
	}

}
