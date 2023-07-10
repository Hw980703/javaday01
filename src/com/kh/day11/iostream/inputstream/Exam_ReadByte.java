package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is = null;

		try {

			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByteCount;
			byte[] readBytes = new byte[3];
			String result = "";
			while (	(readByteCount = is.read(readBytes)) != -1) {

//				readByteCount = is.read(readBytes);
//				if (readByteCount == -1)
//					break;
				result += new String(readBytes, 0, readByteCount);

//					for ( byte rByte : readBytes) {
//						System.out.print((char)rByte);
//					}
			}
			System.out.print(result);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				is.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
