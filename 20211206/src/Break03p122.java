
public class Break03p122 {
	public static void main(String[] args) {
		// 만약 break구문으로 안쪽이 아닌 상위 반복문을 끝내는 경우
		// break lebel명; 으로 호풀하면
		// lebel명 : for(int ....) 로 선언되어있는
		// 반복문에 바로 접근해 종료시킬수 있습니다.
		
		// 바깥쪽 (상위)반복문에 outter라는 이름을 붙여줌
		outter : for(int i = 2; i <= 9; i ++) {
			System.out.println(i + "단 출력");
			for(int j = 1; j <= 9; j++) {
				if(j > 4) {
					System.out.println("5이상은 직접 알아보기");
					break outter;
				}
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println("=====================");
		}
	}
}
