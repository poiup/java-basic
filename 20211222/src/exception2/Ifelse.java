package exception2;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		// int a,b 에 스캐너로 각각 정수를 입력받아주세요.
		// a / b의 결과를 콘솔에 띄워주시되
		// a/b를 실행하기 전에
		// b가 0인짖 검사해서 0인경우는
		// a/b 를 하지 말고 0으로 숫자를 나눌수 없습니다.
		// 라는 경고만 띄우도록 만들어주세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a를 입력해주세요");
		int a = scan.nextInt();
		System.out.println("b를 입력해주세요");
		int b = scan.nextInt();
		
		if(b == 0) {
			System.out.println("0으로 숫자를 나눌수 없습니다");
		} else {
			System.out.println("a / b : " + a/b );
		}
		
	}
}
