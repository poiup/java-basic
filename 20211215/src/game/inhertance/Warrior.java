package game.inhertance;

public class Warrior extends Commoner {
	private int pDam;
	
	public Warrior(String name) {
		super(name); // 생성자 내부에서 다른 코드에 앞서서 무조건 1순위로 들어와야함
		pDam = 20;	// 물리데미지 설정하기
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + lv);
		System.out.println("체력 : " + hp+ "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + mp);
		System.out.println("물리데미지 : " + pDam);
		System.out.println();
	}
}
