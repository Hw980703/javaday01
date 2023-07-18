package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 클라이언트 소켓을 생성하였습니다. /127.0.0.1 게임 준비 완료 --> 4 2 1 0스트라이크 0볼 --> 1 2 3 0스트라이크
		 * 1볼 --> 2 3 4 1스트라이크 0볼 --> 5 3 8 2스트라이크 0볼 --> 5 3 7 1스트라이크 1볼 --> 7 3 8
		 * 3스트라이크 0볼 축하합니다. 아웃입니다!
		 */

		Socket sk = null;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream is = null;
		DataInputStream dis = null;

		try {
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			sk = new Socket("127.0.0.1", 8888);
			System.out.println("게임 준비 완료");

			while (true) {
				System.out.print("--> ");
				String balls = sc.nextLine();

				os = sk.getOutputStream();
				dos = new DataOutputStream(os);
				dos.writeUTF(balls);
				dos.flush();

				is = sk.getInputStream();
				dis = new DataInputStream(is);
				String msg = dis.readUTF();
				System.out.println(msg);
				if (msg.equals("축하합니다! 아웃입니다!!")) {
					System.out.printf("내 말 들으랬지(갓수환)!\r\n"
							+ "　　 _, ,_　 ∩\r\n"
							+ "　（　‘д‘）彡\r\n"
							+ "　 ((⊂彡☆∩)) _, ,_ 　_, ,_\r\n"
							+ "　　((⊂((⌒⌒ ((Д´ ≡｀Д))\r\n"
							+ "　　　　　　｀ヽ_つ ⊂ノ");
					dos.writeUTF("아웃! 게임 종료!");
					break;
				}
				
				//startsWith("3");
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
