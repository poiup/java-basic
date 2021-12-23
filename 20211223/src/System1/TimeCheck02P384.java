package System1;

public class TimeCheck02P384 {
	public static void main(String[] args) {
		// try ~ catch구문의 소요시간을 구해주세요.
		// 내부에는 여러분들이 원하는 속성의 예외를 발생시키세요
		// throw로 발생시키면 됩니다
		int sum = 0;
		// 시작시간
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : "+start);
		try { 
			for(int i = 0; i < 1000000000; i++) {
				sum += i;
			}
			throw new Exception();
		} catch(Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("종료시간 : "+end);
		System.out.println("소요시간 : " + (end - start));
	}
}
