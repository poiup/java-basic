package structure;

public class Structure03p190 {
	// Cat.java를 생성해주세요
	// Cat.java에는 고양이가 가질 수 있는 특성을
	// 최소 3개 (이름 등...) 을 정의해주세요
	
	// Structure03p190.java를 실행부로 삼아서
	// Cat을 2마리 이상 생성하시고
	// getInfo 메서드를 선언해서
	// <고양이이름>의 정보입니다.
	// 이름 : <고양이이름>, 정보:<고양이정보>... 처럼 출력되게 만들고, 실행그림(getInfo
	// 지역의 Cat c가 2중 하나에 연결된 시점의 메모리 구조를 그려서 보내주세요.)
	public static void getInfo(Cat c){
		System.out.println(c.name + "의 정보입니다");
		System.out.println("이름 : " + c.name + ", 나이 : " + c.age + ", 품종 : " + c.kind);
	}
	public static void main(String[] args) {
		Cat c1 = new Cat();
		
		c1.name = "야옹이";
		c1.age = 5;
		c1.kind = "페르시안";
		
		Cat c2 = new Cat();
		
		c2.name = "벵골이";
		c2.age = 3;
		c2.kind = "벵골";
		
		getInfo(c1);
		getInfo(c2);
	}
}
