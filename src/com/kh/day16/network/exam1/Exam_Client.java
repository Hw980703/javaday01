package com.kh.day16.network.exam1;

import java.io.IOException;
import java.net.Socket;

public class Exam_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("실행 테스트2");
		Socket socket = null;
		
		try {
			System.out.println("연결 요청중!!");
			socket = new Socket("127.0.0.1",4885);
			System.out.println("연결 수락 됨!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
