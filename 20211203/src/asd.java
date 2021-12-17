import java.util.Scanner;

public class asd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("피라미드 높이를 입력해주세요");
		int height = scan.nextInt();
		scan.close();
		/* 누운 피라미드
		for (int i =0; i < height; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		for(int i = height; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		*/
		for(int i = 0; i < height; i++) {
			for (int k = 0; k < height-i; k++) {
				System.out.print("  ");
			}
			for(int j = 0; j < i;j++ ) {
				System.out.print(" *");
			}
			System.out.print(" *");
			for(int j = 0; j < i;j++ ) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i = height; i >= 0; i--) {
			for (int k = 0; k < height-i; k++) {
				System.out.print("  ");
			}
			for(int j = 0; j < i;j++ ) {
				System.out.print(" *");
			}
			System.out.print(" *");
			for(int j = 0; j < i;j++ ) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
