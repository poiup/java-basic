
public class Casting46P {
	public static void main(String[] args) {
		// 원래는 서로 다른 자료형간에는 연산이 불가능하지만
		// 편의상 컴퓨터가 자돌으로 자료형을 보정해주는 경ㅇ우가 있는데
		// 이르르 가리켜 자료형 변환이라고 합니다.
		// 자동 형 변환인 Promotion과 강제 형 변환인 Casting이 있습니다.
		// 자동 형 변환은 작은 데이터를 큰 데이터로 바꿀때 주로 발생하고
		// 강제 형 변환은 큰 데이터를 작은 데이터로 바꿀때 주로 사용합니다.
		int a = 5;
		double b = 7.12;
		System.out.println(a+b); //  자동 형 변환, int -> double
		// 강제형변환은 변환을 하고 싶은 자료 왼쪽에 (바꿀자료형)자료
		System.out.println(a+(int)b);
		
	}
}
