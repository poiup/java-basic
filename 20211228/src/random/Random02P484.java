package random;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {
	public static void main(String[] args) {
		// Random객체를 생성한 다음 nextBoolean()기능을 이용해서
		// 동전던지기 카운팅 프로그램을 만들어주세요.
		// n회 던졌을때 true가 나오면 앞면, false가 나오면 뒷면으로 간주해서
		// 프로그램이 다 끝낫을때 앞면 몇회, 뒷면 몇회인지
		// 콘솔에 출력해주세요.
		// 실행 횟수 n회는 스캐너로 입력받습니다.
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("동전을 던질 횟수를 입력해주세요");
		int tryCount = scan.nextInt();
		scan.close();
		int frontCount = 0;
		int backCount = 0;
		
		for(int i = 0; i < tryCount; i ++) {
			if(random.nextBoolean()) {
				frontCount ++;
			} else {
				backCount ++;
			}
		}
		
		System.out.println("동전을 " + tryCount + "번 던졌습니다.");
		System.out.println("앞면이 나온횟수 : " + frontCount);
		System.out.println("뒷면이 나온횟수 : " + backCount);
	}
}
