package string1;

public class String06P399 {
	public static void main(String[] args) {
		String str = "hello i'm java String";
		
		// substring()은 인덱스 기준으로 앞 문자열을 삭제합니다.
		// 인덱스 번호를 두개 주면 처음 인덱스 번호 ~ 두 번째 인덱스 번호 사이만 남겨줍니다.
		
		System.out.println(str.substring(10));
		System.out.println(str.substring(10, 14));
	}
}
