package math01;

public class Math06 {
	// 뭘냇는지 받아오기
//	public static void rockPaperScissors(int value){
//		if(value == SCISSORS) {
//			System.out.println("가위");
//		} else if (value == ROCK) {
//			System.out.println("바위");
//		} else {
//			System.out.println("보");
//		}
//	}
	

	
	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math,random()을 이용해 1/3확률로 가위,바위,보를 부여받으며
		// 가위 > 보, 바위 > 가위, 보 > 가위의 상성을 가집니다.
		// 가위 바위 보를 뽑는 부분부터 작성해주세요.
		// 0 = 가위, 1 = 바위, 2 = 보
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		 
		int myValue = (int)(Math.random() * 3);
		int comValue = (int)(Math.random() * 3);
		
//		System.out.print("내가 낸 것 : ");
//		rockPaperScissors(myValue);
//		System.out.print("컴퓨터가 낸 것 : ");
//		rockPaperScissors(comValue);
		
		// 누가 뭘냇는지 문자열 배열을 만들어 처리
		String[] items = {"가위", "바위", "보"};
		System.out.println("내가 낸 것 :" + items[myValue]);
		System.out.println("컴퓨터가 낸 것 :" + items[comValue]);
		
		// 내가 이기는 상황을 if문하나에 전부넣어 코드 수를 줄임
		if(myValue == comValue) {
			System.out.println("무승부입니다.");
		}
		else if ((myValue == SCISSORS && comValue == PAPER) || 
				(myValue == PAPER && comValue == ROCK) || 
				(myValue == ROCK && comValue == SCISSORS)){
			System.out.println("내가 이겼습니다.");
		} else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
//		if (myValue == comValue) {
//			System.out.println("비겼습니다.");
//		} else if(myValue == SCISSORS && comValue == PAPER) {
//			System.out.println("이겼습니다.");
//		} else if (myValue - comValue == 1) {
//			System.out.println("이겼습니다.");
//		} else {
//			System.out.println("졌습니다.");
//		}
		
		
		
		
//		if(myValue == comValue) {
//			System.out.println("비겼습니다");
//		} else if(myValue == SCISSORS && comValue == 2) {
//			System.out.println("이겼습니다.");
//		} else if (myValue == 1 && comValue == 0) {
//			System.out.println("이겼습니다");
//		} else if (myValue == 2 && comValue == 1) {
//			System.out.println("이겼습니다.");
//		} else {
//			System.out.println("졌습니다.");
//		}
	}
}
