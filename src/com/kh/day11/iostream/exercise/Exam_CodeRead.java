package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_CodeRead {

	public static void main(String[] args) {
			
			// Exam_FileCopy.java 파일을 읽어서 콘솔에 출려갷보세요.
			
			InputStream is = null;
			byte[] readByte = new byte[3000];
			int readCount;
			String result =  "";
				try {
					is = new FileInputStream("src/com/kh/day11/iostream/exercise/Exam_FileCopy.java");
					while ((readCount =  is.read(readByte,0,3000)) != -1) {
						
						result = new String(readByte,0,readCount);
						
					}
					System.out.println(result);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						is.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
		}

}
