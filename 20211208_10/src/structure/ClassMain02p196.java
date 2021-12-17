package structure;

public class ClassMain02p196 {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		c1.owner = "김00";
		c1.model = "빨간차";
		c1.price = 10000000;
		
		Car c2 = new Car();
		
		c2.owner = "박00";
		c2.model = "파란차";
		c2.price = 320000000;
		
		c1.getInfo();
		c2.getInfo();
	}
}
