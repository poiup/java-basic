
public class Datainteger {
	public static void main(String[] args) {
		// 정수형을 나타낼 수 있는 자료는 크게 4가지입니다.
		// byte(1byte), short(2byte), int(4byte), long(8byte)입니다
		// 변수 선언시 자료형을 위의 키워드로 써주면 됩니다.
		// byte 형 자료 생성 및 초기화(변수 만들고 바로 값 넣기)
		byte a = 127; //8bit (0 ~ 2의 8승 -1) 255
		short b = 32000; // 16bit (0 ~ 2의 16승 -1 )
		int c = 2147483647; // 32bit (0 ~ 2의 32승 -1)
		long d = 2009812840; // 64bit (0 ~ 2으 64승 -1)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
