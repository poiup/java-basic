package game.inhertance;

public class Commoner {
	// 레벨 체력 아이디 마나수치를 변수로 가집니다
	// 정보은닉이 적용되어 private 접근 제한자를 가지며
	// 레벨은 1, 체력은 20, 마나는 10이 기본값이며 아이디만 그때그때 입력 받습니다.
	
	//생성자로 데이터를 초기화 할수 있고, getInfo()를 이용해 현재 상태를 콘솔에 출력합니다.
	
	protected int lv;
	protected int hp;
	protected int maxHp;
	protected int mp;
	protected int maxMp;
	protected String name;
	
	public Commoner(String name) {
		// 생성자 내부에서 맴버변수를 초기화할때는 this를 붙이는경우가 많습니다.
		this.lv = 1;
		this.hp = 20;
		this.maxHp = 20;
		this.mp = 10;
		this.maxMp = 10;
		this.name = name;
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + lv);
		System.out.println("체력 : " + hp+ "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + mp);
		System.out.println();
	}
}
