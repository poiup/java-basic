package game.intercation;

public class Main04 {
	public static void main(String[] args) {
		
		Archer a1 = new Archer();
		Magician m1 = new Magician();
		Warrior w1 = new Warrior();
		Golem g1 = new Golem();
		Golem g2 = new Golem();
		Golem g3 = new Golem();
		
		a1.huntGolem(g1);
		a1.huntGolem(g1);
		a1.huntGolem(g1);
		a1.huntGolem(g1);
		a1.huntGolem(g1);
		
		m1.huntGolem(g2);
		m1.huntGolem(g2);
		m1.huntGolem(g2);
		
		w1.huntGolem(g3);
		w1.huntGolem(g3);
		w1.huntGolem(g3);
		w1.huntGolem(g3);
	}
	
	
}
