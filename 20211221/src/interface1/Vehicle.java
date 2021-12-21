package interface1;

// 인터페이스는 interface 선언ㄴ을 사용합니다.
// 내부에는 상수인 값과 추상메서드만 선언할수 있습니다.
// 에초에 구현(implements)를 전제로 설계되기 때문에
// 일반 변수, 메서드는 내부에 선언할수 없습니다.
// 다형성에서는 부모클래스의 역활을 합니다.
public interface Vehicle {
	// 최대 연료량
	// 바로 상수로 잡힙니다.
	int MAX_GAS = 100;
	
	// 탈 것이라면 가지고 있을 공통적 기능을 전부 추상메서드로 작성
	//{
	//	 실행문 ......
	//}
	// 와 같은 실행문 부분(메서드의 body) 없이 선언만 해주세요.
	
	public void accel(); //가속
	public void breakSpeed(); // 감속
	public void reFuel(); // 주유
	public void showstatus(); //계기판 조회
	
}
