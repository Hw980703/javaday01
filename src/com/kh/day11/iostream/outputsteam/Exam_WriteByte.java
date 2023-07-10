package com.kh.day11.iostream.outputsteam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutputStream os2 = null;
		
		try {
			os2 = new FileOutputStream("src/com/kh/day11/iostream/outputting3.txt");
			byte[] data = "리얼 갹갹 입출력 갹갹".getBytes();
				os2.write(data);

			os2.flush(); // 버퍼 비우기
			System.out.println("실행 완료!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				os2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
