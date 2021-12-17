package game.inhertance;

public class Magician extends Commoner {
	
	private int mDam;
	
	public Magician(String name) {
		super(name); 
		mDam = 20;
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + lv);
		System.out.println("체력 : " + hp+ "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + mp);
		System.out.println("마법데미지 : " + mDam);
		System.out.println();
	}
}
