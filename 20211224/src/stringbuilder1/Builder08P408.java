package stringbuilder1;

public class Builder08P408 {
	public static void main(String[] args) {
		// reverse()는 문자열을 인덱스 순으로 따졋을때 
		// 역순으로 나열해줍니다
		
		StringBuilder str = new StringBuilder("안녕하세요");
		
		System.out.println(str);
		// 뒤집어서 저장합니다.
		str.reverse();
		System.out.println(str);
	}
}
