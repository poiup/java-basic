
package game.intercation;

public class Warrior {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	private int lv;
	
	public Warrior () {
		hp = 130;
		mp = 30;
		atk = 14;
		def = 2;
		exp = 0;
		lv = 9;
	}
	// 교전을 할 경우 상호간에 수치값이 교환되어야 합니다.
	// Warrior 쪽에서 Orc의 수치를 깎아주고
	// Orc쪽에서 Warrior쪽을 깎아줘야합니다.
	public void huntOrc(Orc orc) {
		// 전사가 오크를 떄리기 위해서 먼저 Orc의 doBattle을 호출합니다.
		orc.doBattle(this.atk);
		this.hp = this.hp - (orc.getAtk() - this.def);
		System.out.println("전사의 남은체력 : " + this.hp);
	}
	
	public void huntTroll(Troll Troll) {
		Troll.doBattle(atk);
		if(Troll.getHp() <= 0) {
			System.out.println("트롤은 죽어서 움직이지않습니다");
			Troll.setHp(0);
			return;
		} else {
			this.hp = this.hp - (Troll.getAtk() - this.def);			
		}
		System.out.println("전사의 남은체력 : " + this.hp);
		System.out.println();
	}
	
	public void huntGolem (Golem golem) {
		golem.doBattle(atk);
		if(golem.getHp() <= 0) {
			System.out.println("골렘은 죽어서 움직이지않습니다");
			golem.setHp(0);
			return;
		} else {
			this.hp = this.hp - (golem.getAtk() - this.def);			
		}
		System.out.println("전사의 남은체력 : " + this.hp);
		System.out.println();
	}
	
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}
}
