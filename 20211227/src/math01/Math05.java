package math01;

public class Math05 {
	public static void main(String[] args) {
		// 주사위 게임을 만들어주세요.
		// 주사위게임은 내 값은 myValue변수에
		// 컴퓨터값은 comValue 변수에 겂을 난수발생으로 1~6을 부여한뒤
		// 값이 같다면 무승부, 아니면 나, 혹은 컴퓨터중 승자가 누구인지 알려주는 방식입니다.
		
		int myValue = (int)(Math.random() * 6) + 1;
		int comValue = (int)(Math.random() * 6) + 1;
		
		System.out.println("나의 주사위값 : " + myValue);
		System.out.println("컴퓨터의 주사위값 : " + comValue);
		if(myValue > comValue) {
			System.out.println("나의 승리입니다.");
		} else if(myValue < comValue) {
			System.out.println("컴퓨터의 승리입니다.");
		} else { 
			System.out.println("무승부입니다.");
		}
		
	}
}
