
public class UnaryQ1P65 {
	public static void main(String[] args) {
		// int a 에 15를 담은 다음 전위 후위 --를 unary01처럼 사용해서
		// 1씩 차감하고 콘솔에 찍는것을 반복해주세요
		// 단, 실행 로직은 unary01에서 그랬듯 주석으로 하단에 풀어서 작성까지 해주세요 
		
		int a =15;
		System.out.println(a--);
		// 1. 콘솔에 a(15)값을 찍는다
		// 2. a(15) = a(15) - 1 후 저장
		
		System.out.println(a);
		
		System.out.println(--a);
		// 1. a(14) = a(14) - 1 후 저장
		// 2. a(13)값을 콘솔에 찍는다
		
		System.out.println(a);
	}
}
