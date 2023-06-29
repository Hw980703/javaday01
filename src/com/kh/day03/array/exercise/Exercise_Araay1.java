package com.kh.day03.array.exercise;

import java.util.*;

public class Exercise_Araay1 {

	public void exercise1() {
		System.out.println("실행 테스트");
		// 양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[5];
		for (int i = 0; i < nums.length; i++) {
			System.out.print("숫자를 입력 하세요:");
			nums[i] = sc.nextInt();
			System.out.println("nums" + "[" + i + "]" + "값은:" + nums[i] + "입니다.");
			System.out.println();
		}
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		System.out.println("nums 배열의 가장 큰 값은:" + max + "입니다.");
	}

	public void exercise2() {
		System.out.println("실행 테스트");
		Scanner sc = new Scanner(System.in);

		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고
		// 평균을 구하는 프로그램을 작성 하라.

		int numAraay[] = new int[5];
		double sum = 0;

		for (int i = 0; i < numAraay.length; i++) {
			System.out.print("숫자를 입력하세요:");
			numAraay[i] = sc.nextInt();
			sum += numAraay[i];
			System.out.println();
		}
		sum = sum / numAraay.length;
		System.out.println("배열의 평균은" + sum + "입니다.");
	}

	public void arryCopyExercise() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오.
		// 230515-1234567 - 230515-1******
		// -포함 14 크기의 배열이어야함.

		char[] origin = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요:");
		String num = sc.next();

		for (int i = 0; i < origin.length; i++) {

			origin[i] = num.charAt(i);

		}
		for (int i = 8; i < origin.length; i++) {
			origin[i] = '*';
		}
		System.out.println(origin);
	}

	public void arryGame() {
		// 가위 바위 보 게임
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 가위 바위 보 게임 =====");
		System.out.println("숫자를 선택하세요(1.가위/2.바위/3.보)");
		int game = sc.nextInt();

		if (game >= 1 && game <= 3) {

			Random rand = new Random();
			int com = rand.nextInt(3) + 1;
			String gameSet = "";
			String comGame = "";
			System.out.println("====== 결과 ======");
			switch (game) {
			case 1:
				gameSet = "가위";
				break;
			case 2:
				gameSet = "바위";
				break;
			case 3:
				gameSet = "보";
				break;
			}
			switch (com) {
			case 1:
				comGame = "가위";
				break;
			case 2:
				comGame = "바위";
				break;
			case 3:
				comGame = "보";
				break;
			}

			System.out.println("당신은 " + gameSet + "를 냈습니다.");
			System.out.println("컴퓨터는 " + comGame + "를 냈습니다");

			if (gameSet == "가위" && comGame == "보") {
				System.out.println("===========");
				System.out.println("당신이 이겼습니다!!!");
			} else if (gameSet == "가위" && comGame == "가위") {
				System.out.println("===========");
				System.out.println("비겼습니다!!!!");
			} else if (gameSet == "가위" && comGame == "바위") {
				System.out.println("===========");
				System.out.println("졌습니다 ㅠㅠ!!!!");
			}

			if (gameSet == "바위") {
				if (comGame == "가위") {
					System.out.println("===========");
					System.out.println("이겼습니다ㅜ!!!");
				} else if (comGame == "바위") {
					System.out.println("===========");
					System.out.println("비겼습니다!!!!");
				} else if (comGame == "보") {
					System.out.println("===========");
					System.out.println("졌습니다 !!!");
				}
			}

			if (gameSet == "보") {
				if (comGame == "가위") {
					System.out.println("===========");
					System.out.println("졌습니다 ㅜ!!!");
				} else if (comGame == "바위") {
					System.out.println("===========");
					System.out.println("이겼습니다!!!!");
				} else if (comGame == "보") {
					System.out.println("===========");
					System.out.println("비겼습니다~~!!!");
				}
			}
		} else {
			System.out.println("1에서 3사이 숫자를 입력하세요!");
		}

	}

	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		
		
		int lottoNums[] = new int[6];
		Random rand = new Random();
		
		
		int count=1;
//		int check=1;
		//중복없이 1 ~ 45 사이 랜덤한 숫자 뽑기
		for (int i=0; i<6; i++) {
			lottoNums[i] = rand.nextInt(45)+1;
			for (int j=0; j<i; j++) {
				if (lottoNums[j] == lottoNums[i]) {
					i--;
					break;
				}
			}count++ ;
//			check++;
		}
		
		
		//버블정렬
		for (int i=0; i< lottoNums.length; i++) {
			for (int j=0; j< lottoNums.length-1; j++) {
				if (lottoNums[j] > lottoNums[j+1]) {
					int temp = lottoNums[j];
							lottoNums[j] = lottoNums[j+1];
					lottoNums[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<lottoNums.length; i++) {
			System.out.print(lottoNums[i] + " ");
		}
		
		
	}

	int gameScore = 0;

	public void upDown() {
		// UP & DOWN 만들기

		for (;;) {
			System.out.println();
			Scanner sc = new Scanner(System.in);
			Random rand = new Random();
			System.out.println("==== Up & Down Game 1~99사이 숫자를 맞춰라! ====");
			System.out.println("게임을 시작하시겠습니까? 숫자를 입력하세요");
			System.out.println("1.GAME START");
			System.out.println("2.GAME Score");
			System.out.println("3.End Game");

			int num = sc.nextInt();
			int random = rand.nextInt(99) + 1;

			if (num >= 1 && num <= 3) {
				switch (num) {
				case 1:
					System.out.println("게임을 시작합니다.");
					System.out.println("<<Game Start>>");
					System.out.println("1~99사이 숫자를 입력하세요!!");
					break;
				case 3:
					System.out.println("게임을 종료합니다");
					break;
				}

				if (num == 3) {
					break;
				}

				if (num == 1) {
					for (;;) {
						if (num == 1) {

							int num2 = sc.nextInt();

							if (num2 >= 1 && num2 <= 99) {
								if (num2 > random) {
									System.out.println("=============<< DOWN >>");
								} else if (num2 < random) {
									System.out.println("=============<< UP >>");
								} else if (num2 == random) {
									System.out.println("=============<< 정답 >>");
									gameScore += 100;
									System.out.println("점수 100점 획득 !");
									System.out.println("게임을 종료합니다.");
									System.out.println();
									break;
								}

							} else {
								System.out.println("1~99사이 숫자를 입력하세요!!");
							}
						}

					}
				}

				if (num == 2) {

					System.out.println("-------------현재 총점수는" + gameScore + "입니다!!-------------------");
				}

			}
		}
	}

	public void bakin31() {
		Scanner sc = new Scanner(System.in);

		System.out.println("베스킨라빈스 게임에 참가하시겠습니까?");
		System.out.println("1.Game Start");
		System.out.println("2.Game Score");
		System.out.println("3.End Game");
		int num = sc.nextInt();
		int sum = 0;
		int user1 = 0;
		int user2 = 0;

		if (num == 1) {
			System.out.println("게임이 시작됩니다!");
			System.out.println("=== 게임 룰 설명 ===");
			System.out.println("1부터 시작해서 먼저 31을 외치는 사람이 패배!");
			System.out.println("한번에 숫자 3개까지만 말할 수 있음!");
			System.out.println("100을 입력하면 턴 끝!");

			for (;;) {

				int count1 = 0;
				int count2 = 0;

				System.out.println("user1 : 1부터 숫자를 입력하세요!");

				for (int i = 0; i < 999999; i++) {
					int gameN1 = sc.nextInt();
					count1++;
					sum = gameN1;
					if (gameN1 == 100 || count1 == 3 && sum != 31) {
						System.out.println("user2 : 다음 숫자를 입력하세요!");

						int gameN2 = sc.nextInt();
						sum = gameN2;
						count2++;
						if (gameN2 == 100 || count2 == 3 && sum != 31) {
							System.out.println("user1 : 다음 숫자를 입력하세요!");

							gameN1 = sc.nextInt();
							if (gameN1 < sum) {
								System.out.println("이전 숫자보다 적게 입력할 수 없습니다.");
							} else {
								sum = gameN1;
								count1++;
							}

						} else if (sum == 31) {
							System.out.println("user2의 패배입니다");
						}

					} else if (sum == 31) {
						System.out.println("user1의 패배입니다");
					}
				}

				sum = user1;
				sum = user2;

				if (sum == user1) {
					System.out.println("user1 은 패배하였습니다.");
					break;
				} else if (sum == user2) {
					System.out.println("user2 은 패배하였습니다.");
					break;
				}
			}

		}

	}

	public void practice1() {
		int num[] = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public void practice2() {
		int num[] = new int[10];

		for (int i = 0; i < num.length; i++) {
			for (int j = 10; j >= 10 - i; j--) {
				num[i] = j;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세용!");
		int num = sc.nextInt();
		int nums[];
		nums = new int[num];
		if (num >= 1) {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = i + 1;
			}

		} else {
			System.out.println("1이상 정수를 입력하세요!");
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public void practice4() {
		String nums[] = new String[5];

		nums[0] = "사과";
		nums[1] = "귤";
		nums[2] = "포도";
		nums[3] = "복숭아";
		nums[4] = "참외";

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == "귤") {
				System.out.println(nums[i]);
				break;
			}
		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요!");

		String str = sc.next();
		String str2[] = new String[str.length()];
		String str3[] = str.split("");
		int sum = 0;
		int[] location = new int[10];

		for (int i = 0; i < str2.length; i++) {
			str2[i] = str3[i];
		}
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i]);
		}

		System.out.println("찾을 문자를 입력하세요.");
		String searchStr = sc.next();

		for (int i = 0; i < str2.length; i++) {
			if (searchStr == str2[i]) {
				sum++;
				location[i] = i;

			}
		}
		System.out.println(searchStr + "의 개수:" + sum);
		System.out.print(str + "에" + searchStr + "가 존재하는 위치(인덱스):");
		for (int i = 0; i < location.length; i++) {
			System.out.print(location[i]);
		}

//		for (int i=0; i<str.length(); i++) {
//			str2[i] = str.charAt(i);
//		}

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String Str[] = new String[7];
		Str[0] = "월";
		Str[1] = "화";
		Str[2] = "수";
		Str[3] = "목";
		Str[4] = "금";
		Str[5] = "토";
		Str[6] = "일";

		System.out.println("찾을 요일 숫자를 입력하세요.");
		System.out.println("범위 0~6");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.println(Str[num]);
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

	}

	// part1 1번 문제
	public void part1_01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	// part1 2번문제
	public void part1_02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	// part1 3번문제

	public void part1_03() {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		System.out.println(sum);
	}

	// part1 4번문제

	public void part1_04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		if (num1 >= 1 && num2 >= 1) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력하세요.");
		}

	}

	// part1 5번문제

	public void part1_05() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num1 = sc.nextInt();

		System.out.println(num1 + "단 구구단을 시작합니다.");
		for (int i = num1; i <= num1; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

	}

	// part1 6번문제

	public void part1_06() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num1 = sc.nextInt();

		if (num1 <= 9) {

			for (int i = num1; i < 10; i++) {
				System.out.println();
				System.out.println(i + "단 구구단을 시작합니다.");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + i * j);
				}
			}
		} else {
			System.out.println("9 이하의 숫자를 입력하세요.");
		}
	}

	// part2 1번문제

	public void part2_01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num = sc.nextInt();
		int sum = 0;

		if (num >= 1) {
			System.out.println("2와 3의 배수:");
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0 || i % 3 == 0) {
					System.out.print(i + " ");
				}
				if (i % 2 == 0 && i % 3 == 0) {
					sum += 1;
				}
			}
			System.out.println();
		} else {
			System.out.println("1이상 숫자를 입력하세요");
		}
		System.out.println();
		System.out.println("2와 3의 공배수 개수:" + sum);

	}
	
	// part2 2번째 문제
	
	public void part2_02() {
		
		
		
	}

	public static void main(String[] args) {
	}
}
