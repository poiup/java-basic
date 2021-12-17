
public class ForQ7p118 {
	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을수 있도록 코드를 작성해주세요.
		// **** 
		// ***
		// **
		// *
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요
		
		for(int i = 4; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* while 버전
		int a = 4,b;
		while(a > 0) {
			b=0;
			while(b < a) {
				System.out.print("*");
				b +=1;
			}
			System.out.println();
			a-=1;
		}
		 */
	}
}
