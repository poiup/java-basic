
public class P87Q3_2 {
	public static void main(String[] args) {
		// su01이 su02보다 크면 su01에 su02값을 누적시켜서 res변수에 누적된 값을 리턴하고
		// 그렇지 않으면 su02값을 리턴하여 출력하는 코드를 밑줄을 채워 만들어주세요
		int su01 = 5;
		int su02 = 4;
				
		int res = su01 > su02 ? su01+=su02 : su02;
				
		System.out.println("res = " + res);
	}
}
