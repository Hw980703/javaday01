package com.kh.day11.iostream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class Exam_TextFileCopy {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
//		문자 스트림 FileReader와 FileWriter를 이용하여 
//		c:\windows\system.ini를 c:\Temp\system.txt 파일로 복사하는 프로그램을 작성하라.

		FileReader is = null;
		OutputStream os = null;
		Writer writer= null;
		char [] byby = new char [1000];
		
		int count;
		try {
			writer = new FileWriter("c:\\Temp\\system.txt");
		
			is = new FileReader("c:\\windows\\system.ini");
		while((count= is.read(byby)) != -1) {
			
			
			writer.write(byby,0,count);
			writer.flush();
			System.out.println("복사 성공!");
			System.out.println(count);
		}
	
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
