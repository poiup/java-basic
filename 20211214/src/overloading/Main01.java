package overloading;

public class Main01 {
	public static void main(String[] args) {
		// 1. Calculator를 생성해주세요.
		Calculator c1 = new Calculator();
		// 2. plus(int, int)를 호출해주세요. 값은 임의로 넣어주세요.
		c1.plus(3,4);
		// 3. plus(double)을 호출해주세요. 값은 임의로 넣어주세요.
		c1.plus(3.2);
		// 4. plus(String)을 Calculator에 새로 추가해주시고 호출해주세요.
		// 이 메서드는 System.out.println("문자열은 연산대상이 아닙니다.");라고 출력합니다.
		c1.plus("안녕하세요");
	}
}
