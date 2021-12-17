package polymorphism;

public class Main02P302 {
	public static void main(String[] args) {
		
		// Student 이외에 Person을 상솓받은 직군을 2개 더 만들어주세요
		Person p1 = new Person("김사람", 10);
		Person g1 = new Gamer("김게임", 18, 3);
		Person s1 = new Streamer("김방송", 23, 3000);
		// Main02에 만들어진 신규 자료형을 부모타입 하나로 받아서 처리해주세요.
		
		p1.showPerson();
		g1.showPerson();
		s1.showPerson();
	}
}
