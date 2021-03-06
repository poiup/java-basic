package game.intercation;

public class Magician {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	private int lv;
	
	public Magician () {
		this.hp = 15;
		this.mp = 50;
		this.atk = 15;
		this.def = 0;
		this.exp = 0;
		this.lv = 1;
	}
	public void dead() {
		System.out.println("마법사가 죽었습니다. 스텟이 초기화됩니다");
		this.hp = 15;
		this.mp = 50;
		this.atk = 10;
		this.def = 0;
		this.exp = 0;
		this.lv = 1;
	}
	
	public void huntOrc(Orc orc) {
		System.out.println();
		this.mp -= 15;
		if(this.mp <= 0) {
			this.mp = 0;
			orc.doBattle(atk-10);
		} else {
			orc.doBattle(atk);
		}
		System.out.println("마법사의 남은체력 : " + this.hp);
		System.out.println("마법사의 남은마력 : " + this.mp);
		if(orc.getHp() <= 0) {
			System.out.println("오크가 죽어서 움직이지않습니다");
			return;
			
		} else {
			this.hp = this.hp - (orc.getAtk() - this.def);			
		}
	}
	
	public void huntTroll(Troll troll) {
		System.out.println();
		this.mp -= 15;
		if(this.mp <= 0) {
			this.mp = 0;
			troll.doBattle(atk-10);
		} else {
			troll.doBattle(atk);
		}
		System.out.println("마법사의 남은체력 : " + this.hp);
		System.out.println("마법사의 남은마력 : " + this.mp);
		if(troll.getHp() <= 0) {
			System.out.println("트롤이 죽어서 움직이지않습니다");
			return;
			
		} else {
			this.hp = this.hp - (troll.getAtk() - this.def);			
		}
	}
	
	public void huntGolem(Golem golem) {
		System.out.println();
		this.mp -= 15;
		if(this.mp <= 0) {
			this.mp = 0;
			golem.doBattle(atk-10);
		} else {
			golem.doBattle(atk);
		}
		System.out.println("마법사의 남은체력 : " + this.hp);
		System.out.println("마법사의 남은마력 : " + this.mp);
		if(golem.getHp() <= 0) {
			System.out.println("골렘이 죽어서 움직이지않습니다");
			return;
			
		} else {
			this.hp = this.hp - (golem.getAtk() - this.def);			
		}
	}
}
