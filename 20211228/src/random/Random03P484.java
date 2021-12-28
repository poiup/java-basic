package random;

import java.util.Random;

public class Random03P484 {
	public static void main(String[] args) {
		// Random 클래스의 nextInt()는 나올 숫자 법위를 지정할수 있습니다.
		// 바로 정수로 나오기때문에 코드가 좀더 간결합니다.
		Random random = new Random();
		
		// 범위입력을 안하는경우 아무 정수나 나옴
		int result = random.nextInt();
		System.out.println(result);
		
		// 따라서 정수 숫자 하나(n)를 파라미터로 넣어줘야 0<= 결과값 < n 이 나옴
		int result2 = random.nextInt(10);
		System.out.println(result2);
		
	}
}
