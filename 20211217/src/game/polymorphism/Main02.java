package game.polymorphism;

public class Main02 {
	public static void main(String[] args) {
		
		Commoner c1 = new Commoner("모험가");
		Monster slime1 = new Slime();
		Monster rabbit1 = new Rabbit();
		Monster bear1 = new Bear();
		
		c1.hunt(slime1);
		c1.hunt(slime1);
		c1.hunt(slime1);
		c1.hunt(slime1);
		c1.hunt(slime1);
		
		c1.hunt(bear1);
		c1.hunt(bear1);
		c1.hunt(bear1);
		
		c1.hunt(rabbit1);
	}
	
}
