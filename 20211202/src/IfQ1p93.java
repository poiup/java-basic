import java.util.Scanner;

public class IfQ1p93 {
	public static void main(String[] args) {
		// 주어진 변수 a에 스캐너로 정수값을 입력받도록 만들어주세요.
		// 입력받은 정수가 0 이상이면 "0보다 크거나 같습니다." 를 콘솔창에
		// 그렇지않다면 "0보다 작습니다." 를 콘솔창에 출력하는 코드를
		// if 블럭(if문) 2개를 이용해 구현해주세요
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a = scan.nextInt();
		scan.close();
		if(a >= 0) {
			System.out.println("0보다 크거나 같습니다");
		}
		if (a < 0) {
			System.out.println("0보다 작습니다");
		}
		
	}
}
