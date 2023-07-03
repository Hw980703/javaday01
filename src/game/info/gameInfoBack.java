package game.info;

public class gameInfoBack {
	gameInfo load = new gameInfo();
	
	public String nameback;
	public int ageback;
	public int levelback;
	public int moneyback;
	public int strback;
	public int hpback;
	public String jobback;
	public String equipSwordback;
	public String equipprotecback;
	
	public  gameInfoBack() {
	
	}
	
	public void gameLoda() {
		load.name = nameback;
		load.age = ageback;
		load.level  = levelback;
		load.money = moneyback;
		load.str = strback;
		load.hp = hpback;
		load.job = jobback;
		load.equipSword = equipSwordback;
		load.equipprotec = equipprotecback;
		 System.out.println("데이터를 성공적으로 불러왔습니다.");
		
	}
}
