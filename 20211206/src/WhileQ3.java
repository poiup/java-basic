import java.util.Scanner;

public class WhileQ3 {
	public static void main(String[] args) {
		// forQ5p118을 while을 사용하는 로직으로 고쳐보세요.
		// i, j변수, 조건식, 증감식 부분을 신경써서 옮겨주세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 정해주세요");
		int size = scan.nextInt();
		scan.close();
		int y = 0;
		while (y < size) {
			int x= 0;
			while(x < size) {
				System.out.print("*");
				x+=1;
			}
			System.out.println();
			y +=1;
		}
	}
}
