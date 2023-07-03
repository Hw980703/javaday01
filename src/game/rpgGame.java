package game;

import java.util.Random;
import java.util.Scanner;

import game.info.gameInfo;
import game.info.gameInfoBack;

public class rpgGame {

	static gameInfo gameUser = new gameInfo();
	static gameInfoBack gameBack;
	static String nameback;
	static int ageback;
	static int levelback;
	static int moneyback;
	static int strback;
	static int hpback;
	static String jobback;
	static String equipSwordback;
	static String equipprotecback;

	public static void main(String[] args) {

		for (;;) {
			finish1: System.out.println("====== 황수환의 모험 RPG ======");
			System.out.println("1.게임시작");
			System.out.println("2.캐릭터 생성");
			System.out.println("3.캐릭터 삭제");
			System.out.println("4.캐릭터 정보");
			System.out.println("5.불러오기");
			System.out.println("6.저장하기");

			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();

			switch (select) {
			case 1:
				gameStart();
				break;
			case 2:
				userCreate(gameUser);
				break;
			case 3:
				userSet(gameUser);
				break;
			case 4:
				userInfo(gameUser);
				break;
			case 5:
				userDataLoad(gameUser);
				break;
			case 6:
				userDataSave(gameUser);
				break;
			}

		}
	}

	///////// 1번 게임 시작
	public static void gameStart() {

		Scanner sc = new Scanner(System.in);
		finish: for (;;) {
			System.out.println("1.던전입장하기");
			System.out.println("2.캐릭터 정보");
			System.out.println("3.내 장비 확인");
			System.out.println("4.소지품 확인");
			System.out.println("5.상점");
			System.out.println("6.스텟");
			System.out.println("7.전직");
			System.out.println("8.스킬 확인");
			System.out.println("9.뒤로가기");
			System.out.println("10.저장하기");

			int gameSelect = sc.nextInt();

			switch (gameSelect) {
			case 1:
				gameinput();
				break;

			case 9:
				break finish;
			}
		}

	}
	// --------1번-1번 던전입장

	public static void gameinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("던전에 입장하셨습니다.");
		System.out.println("========== 초심자의 마을 ==========");

		System.out.println("1.초보자 던전 : 0레벨 ~ 11레벨");
		System.out.print("던전을 선택하세요:");
		int dgNum = sc.nextInt();
		switch (dgNum) {
		case 1:
			levelOne();
			break;
		}

	}

	// -------------------1번 던전 초보자던전
	public static void levelOne() {
		for (;;) {

			System.out.println("초보자 던전에 입장하였습니다.");
			System.out.println();
			Random rand = new Random();
			Scanner sc = new Scanner(System.in);
			int monster = rand.nextInt(10) + 1;

			int fightSe = sc.nextInt();
			switch (fightSe) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				level1Fhight();
				break;

			}
		}
	}

	// 초보자던전 싸움
	public static void level1Fhight() {
		Scanner sc = new Scanner(System.in);
		int HP = 100;
		Random rand = new Random();
		int radom = rand.nextInt(4)+1;
		System.out.println("레벨:" +radom  + "슬라임이 나타났다!!");
		while (HP >= 0) {

		

			System.out.println();
		

			System.out.println("1.공격");
			System.out.println("2.스킬");
			System.out.println("3.가방");
			System.out.println("4.도망치기");
			System.out.print("선택:");
			int fightSe = sc.nextInt();
			System.out.println();
			System.out.println("슬라임을 공격했다!");
			int dmage = rand.nextInt(10) + 10;
			HP -= dmage;

			System.out.println("데미지:" + dmage + "  슬라임 남은 HP:" + HP);
			System.out.println();

		}
		if (radom == 1 && HP <= 0) {
			System.out.println("슬라임을 잡았다!!");

			System.out.println("경험치가 10EXP 올랐습니다.");
			

		} else if (radom == 2 && HP <= 0) {
			System.out.println("슬라임을 잡았다!!");

			System.out.println("경험치가 15EXP 올랐습니다.");
			

		}
		else if (radom == 3 && HP <= 0) {
			System.out.println("슬라임을 잡았다!!");

			System.out.println("경험치가 20EXP 올랐습니다.");
			

		}
		else if (radom == 4 && HP <= 0) {
			System.out.println("슬라임을 잡았다!!");

			System.out.println("경험치가 25EXP 올랐습니다.");
			

		}
		else if (radom == 5 && HP <= 0) {
			System.out.println("슬라임을 잡았다!!");

			System.out.println("경험치가 30EXP 올랐습니다.");
			System.out.println();
			

		}
		System.out.println();
		System.out.println("전리품을 얻었습니다!");
		System.out.println();
		int randG = rand.nextInt(10)+1;
		
		if(randG >=1 && randG<=6) {
		System.out.println("획득 : 슬라임의 액체");
		System.out.println();}
		else if (randG >=7 && randG<=9) {
			System.out.println("획득 : 체력포션");
			System.out.println();
		}else if (randG ==10) {
			System.out.println("획득 : 초심자의 무기");
			System.out.println();
		}

	}

	////// 1-2 캐릭터 정보 확인
	public static void gameSelf() {

	}

	/////////// 2번 캐릭터 생성
	public static void userCreate(gameInfo gameUser) {
		Scanner sc = new Scanner(System.in);
		System.out.println("캐릭터 생성 창 입니다.");
		System.out.println("유저 닉네임을 설정해주세요.");
		gameUser.name = sc.next();
		System.out.println("유저 나이를 입력해주세요.");
		gameUser.age = sc.nextInt();
		System.out.println("캐릭터가 생성 되었습니다!");
	}

	/////////// 3번 캐릭터 삭제
	public static void userSet(gameInfo gameUser) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정말 삭제하시겠습니까?");
		System.out.println("현재 내 캐릭터 상태");
		gameUser.myInfo();

		System.out.println("1:YES 2:NO");

		int setYN = sc.nextInt();
		if (setYN == 1) {
			gameUser.infoLoad();
			System.out.println("캐릭터가 초기화 되었습니다.");

		} else if (setYN == 2) {
			System.out.println("취소하셨습니다.");

		} else {
			System.out.println("용사여 1번과 2번 중 하나를 고르시오.");
		}
	}

	///////// 4번 내 캐릭터 정보
	public static void userInfo(gameInfo gameUser) {
		gameUser.mySelf();
	}

	//////// 5번 불러오기
	public static void userDataLoad(gameInfo gameUser) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이전 데이터를 불러오시겠습니까?");
		System.out.println("***주의*** 최근 저장한 데이터를 불러옵니다.");
		System.out.println("YES : 1" + " " + "NO : 2");
		int loadSelect = sc.nextInt();

		switch (loadSelect) {
		case 1:
			gameUser.name = nameback;
			gameUser.age = ageback;
			gameUser.level = levelback;
			gameUser.money = moneyback;
			gameUser.str = strback;
			gameUser.hp = hpback;
			gameUser.job = jobback;
			gameUser.equipSword = equipSwordback;
			gameUser.equipprotec = equipprotecback;
			System.out.println("데이터를 성공적으로 불러왔습니다.");
			break;
		case 2:
			System.out.println("취소하셨습니다.");
			break;
		}
	}

	//////// 6번 저장하기
	public static void userDataSave(gameInfo gameUser) {
		Scanner sc = new Scanner(System.in);

		System.out.println("현재 데이터를 저장하시겠습니까?");
		System.out.println("***주의*** 현재 데이터로 저장됩니다.");
		System.out.println("YES : 1" + " " + "NO : 2");
		int loadSelect = sc.nextInt();

		switch (loadSelect) {
		case 1:

			nameback = gameUser.name;
			ageback = gameUser.age;
			levelback = gameUser.level;
			moneyback = gameUser.money;
			strback = gameUser.str;
			hpback = gameUser.hp;
			jobback = gameUser.job;
			equipSwordback = gameUser.equipSword;
			equipprotecback = gameUser.equipprotec;
			System.out.println("데이터를 성공적으로 저장했습니다.");
			break;
		case 2:
			System.out.println("취소하셨습니다.");
			break;
		}

	}
}
