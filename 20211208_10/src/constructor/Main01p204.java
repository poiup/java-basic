package constructor;

public class Main01p204 {
	public static void main(String[] args) {
		// 자동차 한대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로 만들어주세요.
		
		Car c = new Car(100,0,"안");
		
		//		c.gas = 100;
		//		c.speed = 0;
		//		c.owner = "안재영";
		
		// 차를 뽑자마자 먼저 상태확인
		c.getInfo();
		// 엑셀을 두번 밟아주세요.
		c.accelSpeed();
		c.accelSpeed();
		
		// 상태 다시확인
		c.getInfo();
		
		// 브레이크를 밟아주세요
		c.breakSpeed();
		// 상태 다시확인
		c.getInfo();
		
		// 주유
		c.putGas();
		// 상태확인
		c.getInfo();
	}
}
