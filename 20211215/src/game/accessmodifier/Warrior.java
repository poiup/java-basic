package game.accessmodifier;

public class Warrior extends Commoner {
	public Warrior(String name) {
		super(name);
	}
	
	public void doubleAttack() {
		System.out.println("전사가 더블어택을 사용합니다.");
		setExp(getExp()+25);
		setHp(getHp()-4);
		dead();
	}
	
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp()-2);
		setExp(getExp()+10);
		dead();
	}
	
	public void getInfo() {
		System.out.println("닉네임 : " +getName());
		System.out.println("현제 체력 : " +getHp());
		System.out.println("현재 마나 : " + getMp());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println();
	}
	
	
}
