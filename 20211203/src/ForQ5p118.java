import java.util.Scanner;

public class ForQ5p118 {
	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해 주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요.
		//ex) 3입력시
		// ***
		// ***
		// ***
		// 과 같이 출력
		// 가로줄 출력시 System.out.print()
		// 다음줄로 내릴때만 System.out.println() 을 씁니다
		
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 정해주세요");
		int size = scan.nextInt();
		scan.close();
		// for 버전
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* while 버전
		int y = 0,x;
		while (y < size) {
			x= 0;
			while(x < size) {
				System.out.print("*");
				x+=1;
			}
			System.out.println();
			y +=1;
		}
		 */
	}
}
