package structure;

public class Structure02p190 {
	
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 핸드폰 번호 : " + p.pNum + ", 번호 : " + p.uNum);
	}
	public static void main(String[] args) {
		Person a = new Person();
		
		a.name = "a씨";
		a.age = 20;
		a.pNum = "111-1111-1111";
		a.uNum = 004;
		
		Person b = new Person();
		
		b.name = "b씨";
		b.age = 21;
		b.pNum = "222-2222-2222";
		b.uNum = 005;
		
		getInfo(a);
		getInfo(b);
	}
}
