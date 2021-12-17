package game.intercation;

public class Golem {
	private int hp;
	private int atk;
	private int def;
	
	public Golem () {
		hp = 20;
		atk = 3;
		def = 8;
	}
	
	public void doBattle(int uAtk) {
		this.hp = this.hp - (uAtk - this.def);
		System.out.println("골렘의 남은체력 : " +this.hp);
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

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}
