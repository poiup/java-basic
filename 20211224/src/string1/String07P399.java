package string1;

public class String07P399 {
	public static void main(String[] args) {
		// toUpperCase()는 문자열 전체를 대문자로 바꿉니다
		// 대문자엿던것은 대문자 유지, 소문자였던것은 소문자 유지를 합니다.
		
		String hello = "Hello Java";
		System.out.println(hello.toUpperCase());
		System.out.println(hello.toLowerCase());
		
		// toUpperCase() 나 toLowerCase()를 사용한다고해서 가지고있던 데이터가
		// 수정이 되지 않습니다.
		System.out.println(hello);
	}
}
