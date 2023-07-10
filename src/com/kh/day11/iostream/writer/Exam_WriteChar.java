package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {
	public static void main(String[] args) {
		
		Writer  writer = null;
		
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writing2.txt");
			char [] cbuf = "I/O Stram Good".toCharArray();
			writer.write(cbuf);
			writer.flush();
			System.out.println("write(char[]) 동작 완료");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		try {
			writer.close(); //버퍼를 비우지 않아도 스트림 종료하면 버퍼 비워짐
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}
