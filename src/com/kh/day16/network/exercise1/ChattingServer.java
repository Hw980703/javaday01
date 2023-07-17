package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss = null;

		Socket sk = null;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		try {
			//포트번호 설정 후 연결대기
			ss = new ServerSocket(6666);
			System.out.println("시스템 연결 대기중..");
			sk = ss.accept();
			// 연결 된 후에는 소켓 객체 생성
			System.out.println("시스템 연결 성공");

			// 데이터 받기
			
				is = sk.getInputStream();
				os = sk.getOutputStream();
				while(true) {
				byte[] bytes = new byte[1024];
				int readByteNo = is.read(bytes);

				String message = new String(bytes, 0, readByteNo);

				System.out.printf("서버 데이터 받기 성공 : %s \n", message);
				
			//===== 받기 완료우~~~
				
				System.out.print("메세지 입력(서버) : ");
				message = sc.nextLine();
				bytes = message.getBytes();
				os.write(bytes);
				os.flush();
				///=- 보내기 완료우~
				}
				
				// 데이터 보내기
			
//				System.out.println("전송 성공");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
