package polymorphism;

public class Main01P302 {
	public static void main(String[] args) {
		// 부모타입인 Person으로 자식인 Student까지 받을수 있음
		Person p1 = new Person("나사람", 10);
		Person s1 = new Student("나학생", 20, 100);
		
		p1.showPerson();
		s1.showPerson();
		
		//s1은 Person타입이기 떄문에 오버라이딩 되지않고 Student쪽에만 적힌 메서드를
		// 호출할수 없다.
		//	s1.showStudent();
		//	p1.showStudent();
	}
	
	
}
