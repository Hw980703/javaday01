package com.kh.day16.network.exam3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Exam_ChattingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "127.0.0.1";
		int port = 7777;
		OutputStream os = null;
		InputStream is = null;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("연결 요청 중...");
			Socket socket = new Socket(address, port);
			System.out.println("연결 성공!!");
			// 1. 데이터 보내기!!!

			os = socket.getOutputStream();
			String message = sc.nextLine();
			byte[] bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터 전송 성공!");
			// ===== 보내기 완료

			is = socket.getInputStream();
			bytes = new byte[1024];

			int readByteNo = is.read(bytes);
			message
			=new String(bytes,0,readByteNo);
			System.out.println("데이터 받았음 ㅋㅋ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
