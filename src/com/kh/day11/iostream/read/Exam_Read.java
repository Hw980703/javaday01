package com.kh.day11.iostream.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;
		// Cannot instantiate the type Reader 쓰지 마라 추상클래스
		// 임시로 null로 초기화를 한다.
		try {
			// 요런 것들을 Checked Exception 이라고 함 ㅇㅇ
			// Unhandled exception type FileNotFoundException
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");


				int readData = reader.read();
				System.out.println((char) readData);
		

			// Unhandled exception type IOException
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Unhandled exception type FileNotFoundException
		// try / catch 로 감싸줘야한다.
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				reader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
