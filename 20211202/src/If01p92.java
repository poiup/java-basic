
public class If01p92 {
	public static void main(String[] args) {
		// 아래와 같이 작성하며
		// if (조건식){
		//		실행구문;
		//		실행구문.......
		//  }
		// 조건식이 참인경우는 {} 사이에 들어간 실행구문을 실행하지만
		// 거짓인경우는 무시하고 넘어갑니다.
		int a = 3;
		
		if (a > 4) {
			// if문 중괄호 내부 영역에 있어서 조건식의 영향을 받는 구문.
			System.out.println("a는 4보다 큽니다.");
		} else {
			System.out.println("a는 4보다 작습니다");
		}
		// if문의 중괄호 영역 안쪽이 아닌 바깥쪽에 위치하므로 영향을 받지 않는 구문
		System.out.println("이건 실행됩니다");
	}
}
