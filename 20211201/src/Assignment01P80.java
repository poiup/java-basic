
public class Assignment01P80 {
	public static void main(String[] args) {
		// 대입 연산자란 특정 변수 값을 연산자 우측에 해당하는 값을 이용해
		// 연산한 결과값으로 계산해 저장하는 기능을 수행합니다.
		// 단순 연산자인 = 이 있으며, 추가로 확장된
		// 복합대입연산자로 +=, -=, /=, *=, %=등이 있습니다.
		// 대입 연산자를 사용하는 경우 코드 실행방향이 오른쪽에서 왼쪽입니다.
		int a = 10;
		System.out.println(a+=10);
		// a = a+10 == a += 10 
		System.out.println(a);
		// a = 20
		System.out.println(a-=5);
		// a = a-5 == a -= 5
		System.out.println(a);
		// a = 15
		System.out.println(a*=3);
		// a = a * 3 == a *= 3
		System.out.println(a);
		// a = 45
		System.out.println(a/=4);
		// a = a / 4 == a /= 4
		System.out.println(a);
		// a == 11
		System.out.println(a%=12);
		// a = a % 12 == a %= 12
		System.out.println(a);
		//a = 11
	}
}
