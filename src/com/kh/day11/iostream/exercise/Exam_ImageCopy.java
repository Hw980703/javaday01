package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 바이트 스트림을 이용하여 바이너리 파일을 복사하는 프로그램을 작성하라
		// c:\Windows\Web\Wallpaper\Theme1\img1.jpg를 c:\Temp\copyimg.jpg로 복사하였습니다.
		
		InputStream is = null;
		OutputStream os = null;
		byte [] by = new byte[11000];
		int count;
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Theme2\\img10.jpg");
			os = new FileOutputStream("C:\\Temp\\ff2f.jpg");
			while((count = is.read(by)) != -1) {
				os.write(by,0,count);
				
			}
			
				
			System.out.println("파일 옮기기 성공!!");
			is.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
