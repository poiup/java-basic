package exception1;

public class Exception02P348 {
	public static void main(String[] args) {
		// 예외 발생 케이스 2.
		// 실행 예외는 실행하기 전까지는 예외를 인지할수 없는 예외입니다.
		// 대표적인 예시로 특정숫자를 0으로 나누는것입니다.
		
		int a = 1;
		int b = 0;
		System.out.println(a/b);
	}
}
