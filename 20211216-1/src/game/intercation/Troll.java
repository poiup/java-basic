package game.intercation;

public class Troll {
	private int hp;
	private int atk;
	private int def;
	
	public Troll() {
		hp = 30;
		atk = 10;
		def = 3;
	}
	
	public void doBattle(int uAtk) {
		this.hp = hp - (uAtk - this.def);
		if(this.hp <= 0) {
			this.hp = 0;
			return;
		}
		System.out.println("트롤의 남은체력 : " + this.hp);
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
