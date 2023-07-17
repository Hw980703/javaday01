package com.kh.day16.network.exam1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("실행 테스트1");
		ServerSocket server = null;
		
		
		try {
			System.out.println("연결 대기중!!");
			server = new ServerSocket(4885);
			while(true){
			Socket serverSocket = server.accept();
			System.out.println("연결 수락 됨!!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
