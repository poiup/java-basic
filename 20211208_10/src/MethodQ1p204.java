import java.util.Scanner;

public class MethodQ1p204 {
	// 지역이 다르면 같은 이름의 함수가 존재가 가능하다
	public static double FToC(double F) {
		return (F - 32) / 1.8;
	}
	
	public static double CToF(double C) {
		return (C * 1.8) + 32;
	}
	
	public static void main(String[] args) {
		// 화씨온도를 입력하면 섭씨온도로 바꿔주는 메서드를 작성해보겠습니다.
		// 메서드 이름은 CToF이고, double을 리턴합니다.
		// 리턴받은 결과값은 main메서드에서 System.out.printlin()으로 출력해주세요.
		// 화씨 = (섭씨 X 1.8) + 32
		// 1. 양변에 32를 뺍니다 ( 변경된 식 => 화씨 - 32 = 섭씨 * 1.8)
		// 2. 양변을 1.8로 나눕니다. (변경된 식 => (화씨 - 32) / 1.8 = 섭씨
		// 위와 같이 섭시 온도를 유도해낼수 있습니다.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("화씨를 섭시로 바꾸시려면 1번 섭씨를 화씨로 바꾸시려면 2번을 적어주세요");
		int choice = scan.nextInt();
		double answer = 0;
		if (choice == 1) {
			System.out.println("화씨온도를 적어주세요");
			double F = scan.nextDouble();
			answer = FToC(F);
		} else if(choice == 2) {
			System.out.println("섭씨온도를 적어주세요");
			double C = scan.nextDouble();
			answer = CToF(C);
		} else {
			System.out.println("잘못입력하셧습니다");
		}
		
		System.out.println(answer);
	}
}
