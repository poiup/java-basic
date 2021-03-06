package game.intercation;

public class Archer {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	private int lv;
	private int arrow;
	
	public Archer() {
		hp = 20;
		mp = 0;
		atk = 12;
		def = 1;
		exp = 0;
		lv = 1;
		arrow = 3;
	}
	
	public void huntOrc(Orc orc) {
		System.out.println();
		orc.doBattle(atk);
		if(this.arrow > 0) {
			arrow --;
			System.out.println("궁수가 화살을 사용합니다.");
			System.out.println("남은 화살 개수 : " + arrow);
			if(orc.getHp() <= 0) {
				System.out.println("오크은 죽어서 움직이지않습니다");
				orc.setHp(0);
				return;
			}
		} else {
			System.out.println("화살을 전부 사용하였습니다.");
			this.hp = this.hp - (orc.getAtk() - this.def);
			if(orc.getHp() <= 0) {
				System.out.println("트롤은 죽어서 움직이지않습니다");
				orc.setHp(0);
				return;
			}
		}

		System.out.println("궁수의 남은 체력: " + this.hp);
	}
	
	public void huntTroll(Troll Troll) {
		System.out.println();
		Troll.doBattle(atk);
		if(this.arrow > 0) {
			arrow --;
			System.out.println("궁수가 화살을 사용합니다.");
			System.out.println("남은 화살 개수 : " + arrow);
			if(Troll.getHp() <= 0) {
				System.out.println("트롤은 죽어서 움직이지않습니다");
				Troll.setHp(0);
				return;
			}
		} else {
			System.out.println("화살을 전부 사용하였습니다.");
			this.hp = this.hp - (Troll.getAtk() - this.def);
			if(Troll.getHp() <= 0) {
				System.out.println("트롤은 죽어서 움직이지않습니다");
				Troll.setHp(0);
				return;
			}
		}

		System.out.println("궁수의 남은 체력: " + this.hp);
	}
	
	public void huntGolem(Golem golem) {
		System.out.println();
		golem.doBattle(atk);
		if(this.arrow > 0) {
			arrow --;
			System.out.println("궁수가 화살을 사용합니다.");
			System.out.println("남은 화살 개수 : " + arrow);
			if(golem.getHp() <= 0) {
				System.out.println("골렘은 죽어서 움직이지않습니다");
				golem.setHp(0);
				return;
			}
		} else {
			System.out.println("화살을 전부 사용하였습니다.");
			this.hp = this.hp - (golem.getAtk() - this.def);
			if(golem.getHp() <= 0) {
				System.out.println("골렘은 죽어서 움직이지않습니다");
				golem.setHp(0);
				return;
			}
		}

		System.out.println("궁수의 남은 체력: " + this.hp);
	}
}
