package math01;

public class Math01 {
	public static void main(String[] args) {
		// Math는 자바에서 이미 기본으로 제공하는 기능이라
		// import 없이 사용가능합니다.
		
		int a = -1024;
		// 0에서 얼마나 떨어져있는지 구한다(대충 -+부호 떈다고 보면됨)
		System.out.println(Math.abs(a));
		
		double b = 3.14;
		// 올림 3.14가 4.0이 된다
		System.out.println(Math.ceil(b));
		
		double c = 19.9;
		// 소수점 아래를 제거 19.9 가 19.0이된다.
		System.out.println(Math.floor(c));
	}
}
