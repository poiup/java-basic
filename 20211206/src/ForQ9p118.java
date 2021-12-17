
public class ForQ9p118 {
	public static void main(String[] args) {
		// 중첩 반복문을 이용해서
		// 다음 방정식의 양의 정수
		// 해를 모두 구하세요.
		// 4x + 5y = 60;
		int x = 1,y = 1;
		for(int i = 0; i < 15; i++) {
			x+=1;
			y=1;
			for (int j = 0; j < 12; j++) {
				y+=1;
				if(4*x + 5*y == 60) {
					System.out.print( "x ="+ x + ", y =" + y);
					System.out.println();
				}
			}
		}
	}
}
