package com.kh.day11.iostream.exercise;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {
	public static void main(String[] args) {

		// 저장 할 파일명 입력 : khpad.txt
		// 종료는 exit
		// 1 : 1111
		// 2 : text input
		/// .....

		Scanner sc = new Scanner(System.in);
		Writer is = null;

		System.out.print("저장 할 파일명 입력 : ");
		String title = sc.nextLine();
		System.out.println(title + "파일에 저장 될 내용 입력");
		System.out.println("종료는 exit");
		String write;

		end:

		try {

			is = new FileWriter("src/com/kh/day11/iostream/" + title);
			for (int i = 1; i < 99; i++) {
				write = sc.nextLine();

				if (write.equals("exit")) {
					break end;
				} else {

					System.out.println(i + " : " + write);
					is.write(i + " : " + write + "\n");
					is.flush();

				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
