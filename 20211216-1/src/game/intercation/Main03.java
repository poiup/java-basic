package game.intercation;

public class Main03 {
	public static void main(String[] args) {
		Magician m1 = new Magician();
		Archer a1 = new Archer();
		Orc o1 = new Orc();
		Troll t1 = new Troll();
		
		Orc o2 = new Orc();
		Troll t2 = new Troll();
		
		m1.huntOrc(o1);
		m1.huntTroll(t1);
		m1.huntTroll(t1);
		
		a1.huntOrc(o2);
		a1.huntTroll(t2);
		a1.huntTroll(t2);
		a1.huntTroll(t2);
		a1.huntTroll(t2);
	}
}
