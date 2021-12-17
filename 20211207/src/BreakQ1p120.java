import java.util.Scanner;

public class BreakQ1p120 {
	public static void main(String[] args) {
		// Scanner로 정수를 입력받으세요.
		// 1~n까지 차곡차곡 순서대로 더해나갔을떄
		// 1부터 몇까지 더해야 입력된 정수를 초과하는지 계산해주는
		// 프로그램을 작성해주세요.
		
		// 변수는 총 3개( 몇 바퀴째인지 카운트, 총합, 목표값)
		// 무한루프(while(true))를 사용합니다.
		// 총합에 값을 누적한 다음, if문에 총합이 목표값보다 크다면
		// break를 실행하도록 짜 주시면 됩니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수의 총 합이 몇 이상이 되면 종료하시겠습니까?");
		int sum = scan.nextInt();
		int total = 0;
		int count = 0;
		
		while(true) {
			if (total > sum) {
				System.out.println("목표값 : " + sum);
				System.out.println("총 합 : " + total);
				System.out.println("몇 까지 더했나? : " + count);
				break;
			}
			count++;
			total += count;
			System.out.println("1부터 " + count + "까지의 총합은 : "+ total + "입니다");
		}
		
	}
}
