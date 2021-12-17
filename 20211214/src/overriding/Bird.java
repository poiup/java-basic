package overriding;

public class Bird extends Animal {
	public boolean fly;
	
	// 오버라이딩 요건
	// 이름과 리턴자료형 등이
	// 같은 부모쪽 메서드를
	// 중복해서 작성함
	public void howl() {
		System.out.println("쨱짹");
	}
	public void getInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 식성 : " + food + ", 날수 있나요? : " + fly);
	}
}
