import java.util.Scanner;

public class ContinueQ1p123 {
	public static void main(String[] args) {
		// 1부터 n까지 총합을 구하되 홀수끼리만 더한
		// 총합을 구하는 구문을 작성해주세요
		// continue문을 반드시 사용하는 로직으로 작성해주세요.
		// n은 스캐너로 입력받습니다.
		
		// 1. 정수 입력받기
		
		// 2. 반복문 만들기
		System.out.println("목표 정수를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 0,oddTotal = 0;
		
		while(oddTotal < n) {
			count ++;
			if(count%2 == 0) {
				continue;
			}
			oddTotal += count;
			System.out.println("현재 1부터 " + count + "까지 더했습니다" );
			System.out.println("총합은 : " + oddTotal + "입니다");
		}
	}
}
