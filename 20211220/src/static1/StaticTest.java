package static1;

public class StaticTest {
	// static이 안 붙은 변수는 객체가 개별적으로 가지는 변수입니다.
	public int num1;
	// static(정적)변수는 모든 객체가 공유하는 하나의 변수입니다.
	// static변수는 객체를(new 키워드로 자료를) 생성하기 전부터 존재합니다.
	// 메인보다도 빨리 생성되있음
	public static int num2 = 0;
	
	public StaticTest() {
		this.num1 = 5;
		num2 +=1;
		System.out.println("num1 변수는 변하지 않습니다. : " + num1);
		System.out.println("현재 가입자수 : " + num2 + "명.");
	}
	
	public static void check() {
		System.out.println("공용 메서드 체크 완료");
		
		// static 메서드 내부에서는 non-static맴버를 선언할수 없다
		// 두 멤버의 생성 시기가 다르기때문에 오류가 나온다
		//System.out.println("공용 메서드 체크 완료" + num1);
	}
}

