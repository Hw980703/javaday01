package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 채팅서버를 구동 중입니다...
		// 채팅서버를 구동하였습니다..
		// 클라이언트의 접속을 기다리고 있습니다.
		// 클라이언트가 접속하였습니다.
		// 채팅이 시작되었습니다.
		// 서버(나) : 하이
		// 클라이언트(상대) : 네네

		ServerSocket ss = null;
		;
		int port = 8888;
		Socket sk = null;
		OutputStream os = null;
		InputStream is = null;
		DataInputStream dis = null; // 보조스트림, 기본 데이터 타입 입출력 도와줌
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		

		try {
			// 서버 구동
			System.out.println("채팅서버를 구동 중입니다...");
			ss = new ServerSocket(port);
			System.out.println("채팅서버를 구동 하였습니다..");
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			sk = ss.accept();
			System.out.println("클라이언트가 접속하였습니다.");

			// 채팅 준비
			is = sk.getInputStream();
			os = sk.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("채팅이 시작 되었습니다.");
			while(true) {
			System.out.print("서버(나) : ");
			String sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg); //보내기
			dos.flush(); //털기
			
			String reMSg = dis.readUTF();
			System.out.printf("클라이언트 (상대) : %s \n" , reMSg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
