package game.polymorphism;

// 모든 사냥감의 뼈대가 되는 클래스
public class Monster {	
	
	// name, hp, atk  
	private String name;
	private int hp;
	private int atk;
	
	public Monster(String name, int hp, int atk) {
		this.name = name;
		this.hp =hp;
		this.atk = atk;
	}
	
	// doBattle(int)를 생성해주세요
	// 사용자의 공격력만큼 몬스터의 체력이 깎입니다.
	// 0이되면 교전이 불가능하다는 메세지를 남겨줍니다.
	// 체력이 0보다 높은 경우에는 남은체력을 마지막 콘솔창에 띄워줍니다.
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		if(this.hp > 0) {
			System.out.println(name +"의 남은 체력 : " + this.hp);
		} else {
			System.out.println( this.name + "이(가) 쓰려졋습니다.");
			System.out.println("더이상 공격할 수 없습니다");
		}
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	

}
