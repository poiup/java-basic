
public class Overflow {
	public static void main(String[] args) {
		// 오버플로우는 표현할수 있는 최대 숫자를 넘겨서 표현하면
		// 그 자료형으로 표현할수 있는 최소값으로 초기화되는 현상을 의미합니다.
		// 아래와 같이 -128~127 사이의 범위를 표현할 수 있는  byte의 최대값인
		// 127을 넘겨버리면 최소표현값인 -128부터 다시 수가 잡히는것을 볼수 있습니다. (overflow)
		// 반대로 최소값을 넘겨버려도 최대값부터 수가 잡히는걸 볼수 있습니다. (underflow)
		byte a = 127;
		byte b = 1;
		System.out.println((byte)(a+b));
		a = -127;
		b = -2;
		System.out.println((byte)(a+b));
	}
}
