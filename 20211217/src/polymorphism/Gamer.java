package polymorphism;

public class Gamer extends Person {
	// rank
	private int rank;
	
	public Gamer(String name, int age, int rank) {
		super(name, age);
		this.rank = rank;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("rank : " + rank);
	}
	
	
}
