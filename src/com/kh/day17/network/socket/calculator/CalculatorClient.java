package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {

	public static void main(String[] args) {

		// 서버와 연결 되었습니다.
		// 계산식 (빈칸으로 띄어 입력, 예 24 + 42) >> 23
		// 잘못 입력하였어요
		// 계산 결과 : 66 이다!!
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			Socket sk = new Socket("127.0.0.1", 8888);
			System.out.println("서버와 연결 되었습니다.");
		
			for (;;) {
				is = sk.getInputStream();
				
				dis = new DataInputStream(is);
				os = sk.getOutputStream();
				dos = new DataOutputStream(os);
				System.out.print("계산식 (빈칸으로 띄어 입력, 예) 24 + 42)");
				String cal = sc.nextLine();
				dos.writeUTF(cal);
				if ( cal.equalsIgnoreCase("end")) {
					System.out.println("종료하였습니다.");
					break;
				}
				dos.flush();

				String re = dis.readUTF();
				
				if (re.equalsIgnoreCase("end") ) {
					
					System.out.println("잘못 입력하셨습니다~~ 다시 입력해");
					continue;
				}
				
				
				
				System.out.printf("계산 결과 : %s \n", re);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
