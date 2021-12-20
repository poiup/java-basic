package static1;

public class Main02p276 {
	public static void main(String[] args) {
		
		// static변수는 생성 없이도 활용할수 있다
		System.out.println(StaticTest.num2);
		// System.out.println(StaticTest.num1); 은 실행이 안됨
		
		// 스테틱 메서드도 변수와 같다
		StaticTest.check();
		
		StaticTest s1 = new StaticTest();
		// s1 생성 후 s1을 이용해 .check()를 호출해보세요.
		s1.check();
	}
}
