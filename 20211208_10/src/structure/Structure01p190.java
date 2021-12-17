package structure;
	

public class Structure01p190 {
	public static void info(Person p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.uNum);
		
	}
	// 현실세계에서 일어나는일을 컴퓨터로 묘사하기위해 사용
	public static void main(String[] args) {
		// 이제부터는 실행코드와 정의 코드를 분리합니다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른 .java파일에 저장합니다.
		
		// 커스텀 디자인 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		Person p1 = new Person(); // 힙에 person p1의 자료형을 만듬
		// p1내부에 정의한 변수를
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name = "안재영";
		p1.age = 11;
		p1.pNum = "010-1111-1111";
		p1.uNum = 001;
		info(p1);
		
		// 또 다른사람을 하나 만들어봅니다.
		Person p2 = new Person();
		
		p2.name = "안재영2";
		p2.age = 22;
		p2.pNum = "010-1211-2111";
		p2.uNum = 002;
		info(p2);
		
		Person p3 = new Person();
		
		p3.name = "안재영3";
		p3.age = 33;
		p3.pNum = "010-1311-3111";
		p3.uNum = 003;
		info(p3);
				
	}
}
