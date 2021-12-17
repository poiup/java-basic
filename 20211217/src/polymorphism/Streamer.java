package polymorphism;

public class Streamer extends Person{
	// viewer
	private int viewer;
	
	public Streamer(String name, int age, int viewer) {
		super(name, age);
		this.viewer = viewer;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("시청자수 : " + viewer);
	}
}
