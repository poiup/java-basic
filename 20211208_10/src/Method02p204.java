
public class Method02p204 {
	public static int add2(int a) {
		// 리턴구문에 int 자료를 입력해야 에러가 나지않음
		return a + 1;
	}
	public static void main(String[] args) {
		// 반환 자료가 void가 아닌경우 호출 위치에 
		// return문 오른쪽 자료를 그래도 갖다놓습니다.
		// 자료를 반환하는것은 console창에 표시한다 라는 알고리즘을 만들어봅시다
		int b = add2(10);
		System.out.println(b);
	}
}
