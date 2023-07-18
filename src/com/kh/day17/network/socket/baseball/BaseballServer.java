package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class BaseballServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 서버소켓을 생성하였습니다. 2023-07-18 12:04:56:15 클라이언트의 접속을 기다립니다. 클라이언트가 접속했습니다. 서버 숫자
		 * -> 7 3 8 서버 준비 완료 받기 : 4 2 1 0스트라이크 0볼 받기 : 1 2 3 0스트라이크 1볼 받기 : 2 3 4 1스트라이크
		 * 0볼 받기 : 5 3 8 2스트라이크 0볼 받기 : 5 3 7 1스트라이크 1볼 받기 : 7 3 8 3스트라이크 0볼 아웃! 게임종료
		 * 
		 * 
		 */

		Random rand = new Random();
		ServerSocket ss = null;
		Socket sk = null;
		String[] balls = new String[3];
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;

//		for (int i = 0; i < balls.length; i++) {
//			balls[i] = Integer.toString(rand.nextInt(5) + 1);
//		}

		try {

			System.out.println("서버소켓을 생성하였습니다.");
			ss = new ServerSocket(8888);
			System.out.println("클라이언트의 접속을 기다립니다.");
			sk = ss.accept();
			System.out.println("클라이언트가 접속했습니다.");

			System.out.print("서버 숫자 : ");
			for (int i = 0; i < 3; i++) {
				balls[i] = Integer.toString(rand.nextInt(9) + 1);
				for ( int j = 0; j < i; j++) {
					if ( balls[i] == balls[j]) {
						i--;
					}
				}
				
				
				// 중복 제거
				
				
			}
			for ( int i=0; i< balls.length; i++) {
				System.out.print(balls[i] + " ");
			}
			System.out.println();
			System.out.println("서버 준비 완료");
			while (true) {
				int strike = 0;
				int ball = 0;
				is = sk.getInputStream();
				dis = new DataInputStream(is);
				String msg = dis.readUTF();
				System.out.printf("받기 : %s \n", msg);
				int[] ballArrs = new int[3];

				String[] strarr = msg.split(" ");
				ballArrs[0] = Integer.parseInt(strarr[0]);
				ballArrs[1] = Integer.parseInt(strarr[1]);
				ballArrs[2] = Integer.parseInt(strarr[2]);

				for (int i = 0; i < ballArrs.length; i++) {
					if (Integer.parseInt(balls[i]) == (ballArrs[i])) {
						strike += 1;

					}
				}
				for (int k = 0; k < ballArrs.length; k++) {
					for (int j = 0; j < ballArrs.length; j++) {

						if (Integer.parseInt(balls[k]) == ballArrs[j]) {
							if (Integer.parseInt(balls[k]) != ballArrs[k]) {

								ball += 1;
							}
						}
					}
				}

				os = sk.getOutputStream();
				dos = new DataOutputStream(os);

				if (strike == 3) {
					dos.writeUTF("축하합니다! 아웃입니다!!");
					System.out.println(dis.readUTF());

					break;
				} else {
					dos.writeUTF(strike + "스트라이크 ," + ball + "볼 \n");
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
