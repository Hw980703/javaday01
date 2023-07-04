package game.info;

public class gameInfo {
//	gameInfoBack back = new gameInfoBack();
	public String name;
	public int age;
	public int level;
	public int money;
	public int str;
	public int hp;
	public int exp;
	public String job;
	public String equipSword;
	public String equipprotec;
	
	
	
	public String backupName;
	public int backupAge;

	public gameInfo() {
		name ="미생성";
		age = 0;
		equipSword ="초보자의 검";
		equipprotec="초보자의 방어구";
		str = 10;
		hp =100;
		level=1;
	}

	public void ifnoSet() {
		name ="없음";
		age = 0;
		equipSword ="없음";
		equipprotec="없음";
	}

	public void infoLoad() {
		name = backupName;
		age = backupAge;
	}
	public void myInfo() {
		System.out.println("닉네임:"+name + " 나이:"+age+" 레벨:"+level+" 장착중인 무기:"+equipSword+" 장착중인 방어구:"+equipprotec);
	}
	public void mySelf() {
		System.out.println("닉네임:"+name + " 나이:"+age+" 레벨:"+level+" 장착중인 무기:"+equipSword+" 장착중인 방어구:"+equipprotec);
	}
	
	public void dataSave() {
		
//		nameback = name;
//		ageback = age;
//		 levelback = level;
//		moneyback = money;
//		strback = str;
//		hpback = hp;
//		 jobback = job;
//		 equipSwordback = equipSword;
//		equipprotecback = equipprotec;
//		 System.out.println("데이터를 성공적으로 저장했습니다.");
		
	}
	public void dataLoad() {

//		name = nameback;
//		 age = ageback;
//		 level  = levelback;
//		 money = moneyback;
//		str = strback;
//		hp = hpback;
//		 job = jobback;
//		 equipSword = equipSwordback;
//		 equipprotec = equipprotecback;
//		 System.out.println("데이터를 성공적으로 불러왔습니다.");
//		
		
	}
}
