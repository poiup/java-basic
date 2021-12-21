package final1;

public class FinalMain01P278 {
	public static void main(String[] args) {
		// 상수를 선언할때는 자료형 왼쪽에 final키워드를 붙인다
		final int a = 90;
		// 상수를 조회하는데에는 제약이 없다
		System.out.println(a);
		// 값을 변경하려고 하면 에러가 난다
		// a = 500;
		
		//사ㅏㅇ수 변수는 선언만 하고 초기화를 동시에 하지않으면
		// 내부에 값이 없는상태로 박제되어버린다
		// 따라서, 반드시 선언과 동시에 초기화를 해야한다
		final int b;
		b = 50;
		System.out.println(b);
		
	}
		
	
}
