package stringbuilder1;

public class Builder05P408 {
	public static void main(String[] args) {
		// 디음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요.
		
		// 문자열은 "abcdefghijklmnopqrstuvwxyz" 입니다.
		StringBuilder str = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		for(int i = 0; i < str.length(); i+=3 ) {
			str.deleteCharAt(i);
		}
		System.out.println(str);
	}
}
