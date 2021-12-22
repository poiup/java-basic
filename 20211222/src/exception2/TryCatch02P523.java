package exception2;

import java.util.Scanner;

public class TryCatch02P523 {
	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 예외 유형중
		// 하나를 골라서 예외가 발생할수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch블록을 활용합니다.
		// / by zero(0으로 나누기)에 대한 처리는 제외합니다.
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("받고싶은 배열의 순번을 적어주세요");
		int a = scan.nextInt();
		
		try {			
			System.out.println(arr[a]); 
		} catch(Exception e){
			System.out.println("존재하지 않는 번호로 조회해서 예외 발생합니다.");
		} finally {
			System.out.println("코드를 종료합니다");
		}
		scan.close();
	}
}
