package execption3;

public class Exception03P355 {
	public static void main(String[] args) {
		// 다중 catch는 블럭 내부에서 여러가지 유형의 예외가 발생할수 있을때
		// 각각 예외유형을 다르게 처리할때 사용합니다
		// 이때 catch구문을 여러번 사용할수 있습니다.
		int[] number = {1,2,3,4,5,0};
		
		// 예외가 발생할지도 모르는 코드부터 try블럭에 넣습니다.
		try {
			for(int i = 0; i < 6; i++) { // ArrayOutofBoundsExecption
				System.out.println(number[i]);
			}
			System.out.println("0으로 나누기를 시도해보겠습니다");
			System.out.println(number[4]/ number[5]); //ArithmeticException
		}
		catch(ArithmeticException am) {
			System.out.println("0으로 나눌수 없습니다");
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다.");
		}
		catch(Exception e) {
			// Exception e 는 만능처리구문으로 어떤 예외도 다 일괄적으로 처리해줍니다.
			// 모든예외를 다 처리하기때문에 아래쪽에 다른 예외를 처리하는 구문을 넣어도
			// 작동하지 않기때문에 오류로 처리된다
			System.out.println("예외가 발생했습니다");
		}
		
		//AritmeticException도 특별처리를 해주세요
		// 0으로 나눌수 없습니다 라고 메세지가 나오게해주세요
	}
}
