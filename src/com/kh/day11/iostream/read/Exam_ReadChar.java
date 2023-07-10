package com.kh.day11.iostream.read;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reader reader = null;

		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			int readCharCount;
			char[] cBuf = new char[3];
			int i = 0;

			String result = "";

			while (true) {

				readCharCount = reader.read(cBuf);
				if (readCharCount == -1)
					break;
				result += new String(cBuf, 0, readCharCount);
			}
			System.out.println(result);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
