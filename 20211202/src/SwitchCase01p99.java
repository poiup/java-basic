
public class SwitchCase01p99 {
	public static void main(String[] args) {
		// switch ~ case 구문은 변수에 들어있는 자료가 case문에 제시된
		// 자료와 일치하는지 여부로 논리식을 실행합니다.
		// switch(변수) {
		// case 값1 :
		// 		실행문;
		// case 값2 :.............
		// }
		// 와 같이 작성합니다.
		// 마지막에는 default문을 작성시 if~eles문의 else처럼 가능합니다.
		
		int a = 3;
		switch(a) {
		case 1:
			System.out.println("one");
			break; // 각 케이스 종료시마다 break를 작성해야 줄줄이 실행되지않음
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default : 
			System.out.println("1~5가 아니네요.");
			break; // default 에는 필요없지만 가독성을위해 작성하기도함
		}
	}
}
