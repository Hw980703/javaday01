package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket sk = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		try {

			System.out.println("연결 요청중");
			// 설정된 IP, PORT에 연결 요청함.
			sk = new Socket("127.0.0.1", 6666);
			// 연결 된 후에는 소켓 객체 생성
			System.out.println("연결 성공!!");
			

				// 데이터 보내기
				os = sk.getOutputStream();
				is = sk.getInputStream();
				while(true) {
					
					//== 보내기
				System.out.print("메세지 입력(클라이언트) : ");
				String message = sc.nextLine();
				byte[] bytes = message.getBytes();
				os.write(bytes);
				os.flush();
				
				//== 보내기 완료!!
				is = sk.getInputStream();
				bytes = new byte[1024];
				int readByteNo = is.read(bytes);
				
				message = new String(bytes, 0, readByteNo);
				//==받기 완료~~
				}
				
//				System.out.println("전송 성공");

				// 데이터 받기

//				System.out.printf("클라 데이터 받기 성공 : %s \n", message);

			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
