package com.kh.day16.network.exam2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Exam_DataClient {

	public static void main(String[] args) {
		
		
		OutputStream os = null; 
		InputStream is = null;
		String idAddrss = "127.0.0.1";
		int port = 4885;
		
		try {
			System.out.println("연결 요청");
			Socket socket = new Socket(idAddrss,port);
			System.out.println("연결 성공!");
			
			
			// ==== 데이터 보내기 ====
			os = socket.getOutputStream();
			String message = "Hello Server!";
			byte[] buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료!!");
			// ====
			// ==== 데이터 받기
			is = socket.getInputStream();
			byte[] bytes = new byte[1024];
			int readyByteNo = is.read(bytes);
			String message2
			= new String(bytes,0,readyByteNo);
			System.out.printf("데이터 받았음! : %s" , message2);
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
