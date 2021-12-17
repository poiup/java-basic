import java.util.Scanner;

public class ElseifQ1p97 {
	public static void main(String[] args) {
		// 성적 판독기를 만들어보겟습니다.
		// if ~ else if ~ else 구문을 사용해서 만들어주세요
		// 성적기준 95이상 A+, 90이상 A0, 85이상 B+, 80이상 B0
		// 75이상 C+, 70이상 C0, 65이상 D+, 60이상 D0
		// 60미만 F로 프린트구문으로 출력해주세요
		// 스캐너로 int score 변수에 성적을 입력받습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력해주세요");
		int score = scan.nextInt();
		scan.close();
		
		if (score >= 95) {
			System.out.println("성적은 A+입니다");
		} else if (score >= 90) {
			System.out.println("성적은 A0입니다");
		} else if (score >= 85) {
			System.out.println("성적은 B+입니다");
		} else if (score >= 80) {
			System.out.println("성적은 B0입니다");
		} else if (score >= 75) {
			System.out.println("성적은 C+입니다");
		} else if (score >= 70) {
			System.out.println("성적은 C0입니다");
		} else if (score >= 65) {
			System.out.println("성적은 D+입니다");
		} else if (score >= 60) {
			System.out.println("성적은 D0입니다");
		} else {
			System.out.println("성적은 F입니다");
		}
	}
}
