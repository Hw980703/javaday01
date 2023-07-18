package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {

	public static void main(String[] args) {
		// 서버 구동중입니다.
		// 클라이언트의 연결을 기다리고 있습니다..
		// 클라이언트와 연결 되었습니다.

		ServerSocket ss = null;
		Socket sk = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);

			System.out.println("서버 구동중입니다.");
//			for (int i=1; i<=100; i++) {
//				Thread.sleep(150);
//				System.out.println(i+"%");
//			}

			ss = new ServerSocket(8888);
			System.out.println("클라이언트의 연결을 기다리고 있습니다.");

			sk = ss.accept();
			System.out.println("클라이언트와 연결 되었습니다.");
			is = sk.getInputStream();

			os = sk.getOutputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);

			while (true) {
				String msg = dis.readUTF();
				
				if ( msg.equalsIgnoreCase("end")) {
					System.out.println ("클라이언트가 종료하였습니다.");
					break ;
				}
				
				System.out.printf("받은 메시지 : %s \n", msg);
				
				
				String[] str = msg.split(" ");
				if ( str.length != 3) {
					String err = "end";
					dos.writeUTF(err);
					continue;
				}
				int num1 = Integer.parseInt(str[0]);
				String Cal = str[1];
				int num2 = Integer.parseInt(str[2]);
				int result = 0;

				switch (Cal) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;

				}

				dos.writeUTF(Integer.toString(result));
				//Integer.toString 도 있지만
				// String.valueOf 도 있고
				// num1 + num2 + ""; 도 있다.
				
				dos.flush();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
