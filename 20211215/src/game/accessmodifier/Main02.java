package game.accessmodifier;

public class Main02 {
	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사1");
		w1.getInfo();
		
		w1.hunt();
		w1.hunt();
		w1.hunt();
		
		w1.getInfo();
		
		w1.doubleAttack();
		w1.doubleAttack();
		w1.doubleAttack();
		w1.doubleAttack();
		
		w1.getInfo();
	}
}
