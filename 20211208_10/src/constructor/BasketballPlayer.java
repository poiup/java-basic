package constructor;

public class BasketballPlayer {
	// 농구선수를 표현하려고 하는ㄷ데
	// 키는 height, 점프력은 jumpHeight으로 만들어주세요.
	
	// 값은 생성자로 처리하도록 해 주시고,
	// 생성자로 생성헀을때 "생성된 선수 키 : XX, 점프력 : YY" 이라는 문장을 콘솔에 찍도록 해 주세요.
	
	// 메서드 dunkShoot()을 정의해주세요.
	// 이 메서드는 height + jumpHeight이 300을 초과하면
	// " 덩크슛에 성공했습니다", 그렇지 않으면
	// " 골대에 닿지않았습니다" 라는 문장을 콘솔에 찍습니다.
	
	
	// 변수는 첫단어 첫글자는 소문자, 이후 단어첫글자는 대문자 나머지는 소문자로 작성 (camel case)
	public double height;
	public double jumpHeight;
	
	public BasketballPlayer(double h, double jh) {
		height = h;
		jumpHeight = jh;
		System.out.println("생성된 선수의 키 : "+ height + ", 점프력 : "+ jumpHeight);
	}
	
	public void dunkShoot() {
		if (height + jumpHeight > 300) {
			System.out.println("덩크슛에 성공했습니다.");
		} else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	}
}
