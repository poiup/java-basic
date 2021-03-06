package superclass;

public class Airplane {
	// 비행기는 속도를 가집니다.
	protected int speed;
	// 생성자는 속도를 입력한 값으로 맞춰줍니다.
	
	public Airplane(int speed) {
		if (speed > 900) {
			speed = 900;
		} else if(speed < 0) {
			speed =0;
		} else {
			this.speed = speed;
		}
	}
	// fly()메서드를 정의하는데 속도가 500씩 증가합니다.
	// 단 , 일반비행기는 속도가 900 초과일수 없습니다.
	public void fly() {		
		if((speed + 500) > 900) {
			speed = 900;
			System.out.println("일반 비행기는 속도가 900을 초과할수 없습니다.");
		} else {
			speed += 500;
		}
		System.out.println("현재속도 : " + speed + "/h" );
		System.out.println();
	}
	// breakSpeed() 메서드를 수행하면 속도가 100씩 감속합니다.
	// 단, 브레이크 구동의 최저 속도는 0입니다.
	public void breakSpeed() {
		if((speed -100) <= 0) {
			speed = 0;
			System.out.println("비행기가 멈춰있습니다.");
		} else {
			speed -= 100;
		}
		System.out.println("현재속도 : " + speed + "/h" );
		System.out.println();
	}
}
