
public class ForQ4p117 {
	public static void main(String[] args) {
		// 2~9단까지 모두를 출력하는 코드를 작성해주세요
		// 구구단은 2~9단까지 출력하면 됩니다.
		// 중첩 반복문을 사용해서 작성해 주세요
		// 바깥쪽 반복문은 (int i)2~9까지 반복하게 해 주시고
		// 안쪽 반복문은 (int j)1~9까지 반복하게 해서
		// i * j 를 출력하게 하면 됩니다.
		
		for(int i = 2; i < 20; i++) {
			for(int j = 1; j < 20; j++) {
				System.out.println(i + " * "+ j + " = "+ i*j);
			}
			System.out.println("=================");
		}
		
		/* while 버전
		int a = 2, b = 1;
		while (a < 20) {
			b = 1;
			while(b < 20) {
				System.out.println(a + " * "+ b + " = "+ a*b);
				b +=1;
			}
			a++;
			System.out.println("============");
		}
		*/
	}
}
