import java.util.Scanner;

public class Elseif01p97 {
	public static void main(String[] args) {
		// else if 는 추가적인 조건을 달때 사용합니다.
		// if문 다음에 작성하며, else문 이전에 작성합니다.
		// else if는 else와는 달리 조건식을 기입해야합니다.
		// else if문은 몇개라도 작성할수 있습니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		int num = scan.nextInt();
		scan.close();
		if(num > 0) {
			System.out.println("양수입니다.");
		} else if (num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다");
		}
		
	}
}
