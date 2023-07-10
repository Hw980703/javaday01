package com.kh.day11.iostream.bufferdstream;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//성능향상 보조 스트림, BufferedStream

public class Exam_BufferedStream {

	public static void main(String[] args) {

		// 버퍼 크기를 5로 하고 표준 출력 스트림 (System.out)과 연결한
		// 버퍼 출력 스트림을 생성하라.

		FileReader fir = null;
		int readCount;

		BufferedOutputStream bout = new BufferedOutputStream(System.out);

		Scanner sc = new Scanner(System.in);
		// System.out.prinltn("전달값");

		try {
			fir = new FileReader("src/com/kh/day11/iostream/exercise/Exam_MemoPad.java");

			while ((readCount = fir.read()) != -1) {

				bout.write(readCount);
			}

			bout.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
