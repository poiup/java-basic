package overriding;

public class Dog extends Animal {
	public boolean nametag;
	
	public void howl() {
		System.out.println("멍멍");
	}
	public void getInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 식성 : " + food + ", 이름표가 있나요? : " + nametag);
	}
}
