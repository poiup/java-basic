package heapmemory;

public class Stringcomperison {
	public static void main(String[] args) {
		// 문자열은 같은 문자 저장시 같은 주소값을 공유합니다..
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hallo";
		// 일반 변수의 배정값 조회시 .hashCode()를 씁니다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		// 문자열은 일부분만 변경이 불가능함.
		// str1[0] = "Q"; <= 오류
		// 뉴 키워드로 생성시 내용이 같은 문자열도
		// 별개의 공간을 새로 배정해 만듭니다.
		System.out.println(new String("Hello"));
		System.out.println(str1 == new String("Hello"));
		System.out.println(str1 == "Hello");
		
		// 문자열간 비교는 (주소가 아닌 내용물간 비교 ) .equals()로 진행합니다.
		System.out.println(str1.equals(new String("Hello")));
	}
}
