package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Writer writer = null;
			
			try {
				writer = new FileWriter ("src/com/kh/day11/iostream/writing4.txt");
//				char[] cbuf = "Wang Gui"
				writer.write("Wang Gui");
				writer.flush();
				System.out.println("실행 완료");
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}

}
