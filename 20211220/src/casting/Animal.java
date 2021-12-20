package casting;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void sit() {
		System.out.println(name + " 이(가) 앉습니다.");
	}
}
