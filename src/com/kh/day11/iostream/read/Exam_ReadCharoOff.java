package com.kh.day11.iostream.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharoOff {
	public static void main(String[] args) {

		Reader reader = null;

		try {
			reader = new FileReader("");
			char[] cBuf = new char[3];
			int readCharCount;
			String result = "";
			while (true) {
				readCharCount = reader.read(cBuf, 0, 3);
				if (readCharCount == -1)
					break;
				result += new String(cBuf, 0, readCharCount);

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
				reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}
}
