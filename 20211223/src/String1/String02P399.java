package String1;

public class String02P399 {
	public static void main(String[] args) {
		
		// indexOf()는 특정 문자열의 시작 인덱스 값을 반환합니다.
		// 만약 특정 문자열이 포함되어 있지 않다면 -1을 리턴합니다
		String tomato = "tomatomatomatomato";
		int get = tomato.indexOf("to");
		
		// 첫번째 to 단어는 0번째부터 시작
		System.out.println(get);
		
		// 중복문자 집계
		get = tomato.indexOf("to", 1);
		System.out.println(get);
		
		// while 을 이용한 중복문자 총 집계
		get = 0;
		while(true) {
			get = tomato.indexOf("to", get);
			if(get < 0) {
				break;
			}
			System.out.println(get);
			get ++;
		}
	}
}
