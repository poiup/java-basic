package game.polymorphism;

public class Main01 {
	public static void main(String[] args) {
		Commoner c1 = new Commoner("모험가");
		Monster orc1= new Orc();
		
		c1.hunt(orc1);
		c1.hunt(orc1);
	}
}
