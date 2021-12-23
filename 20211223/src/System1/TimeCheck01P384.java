package System1;

public class TimeCheck01P384 {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : " + start);
		
		long all = 0;
		
		for (int i = 0; i <= 2000000000; i++) {
			all += i;
		}
		System.out.println("1 부터 20억까지 다 더하면 : " + all);
		
		// 끝나는 시점
		long end = System.currentTimeMillis();
		System.out.println("끝난시간 : " + end);
		System.out.println("소요시간 : " + (end - start)/1000.0 + "초");
	}
}
