package string1;

public class String09P399 {
	public static void main(String[] args) {
		// 기본적으로 문자열은 참조형 변수이기 때문에
		// 비교를 할 때 주소값 비교가 일어납니다.
		
		String a = new String("테스트");
		String b = new String("테스트");
		System.out.println(a);
		System.out.println(b);
		// 문자열 비교가 아닌 주소값의 비교로 들어가기때문에 false가 나오게된다
		System.out.println(a == b);
		
		String c = "테스트";
		String d = "테스트";
		// 문자열과 문자열의 비교일 경우는 true가 나온다
		System.out.println(c == d);
		
		// 하지만 a와 b로 문자열 비교가 하고싶을수 있다
		// 그 경우에는 equals를 사용하면된다.
		System.out.println(a.equals(b));
	}
}
