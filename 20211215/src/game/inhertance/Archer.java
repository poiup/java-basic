package game.inhertance;

public class Archer extends Commoner {
	private int rDam;
	
	public Archer(String name) {
		super(name);
		rDam = 10;	
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + lv);
		System.out.println("체력 : " + hp+ "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + mp);
		System.out.println("원거리데미지 : " + rDam);
		System.out.println();
	}
}
