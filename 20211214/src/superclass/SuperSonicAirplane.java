package superclass;

// 초음속 비행기는 비행기를 상속합니다.
public class SuperSonicAirplane extends Airplane{
	// 초음속 비행기도 일반 비행기처럼 속도값만 가집니다.
	// 따라서 변수는 추가로 정의 하지않습니다.
	public SuperSonicAirplane(int speed) {
		// 부모의 생성자는 상속되지 않습니다.
		// 따라서 자식쪽에서 부모쪽 생성자에 전달할 값까지
		// 모두 처리해야합니다.
		// 부모 생성자는 super(); 로 이름이 고정입니다.
		// 부모 생성자가 모조건 1순위로 호출되어야 합니다.
		super(speed); 
		System.out.println("초음속 비행기 속도는 " + this.speed);
	}
	
	// 초음속 비행기는 속도가 900이상, 1300 이하인 경우 호출됩니다.
	// 현재 SuperSonicAprlane 내부이기 때문에
	// public void fly() 작성시 , 오버라이딩이 일어나게 되는데
	// 그럼에도 불구하고 일반 비행을 하게 되는 구간인 경우 super.fly()를 호출하면 됩니다.
	public void fly() {
		if ((speed + 500) <= 900) {
			super.fly();// 부모쪽 fly를 호출함
		} else {
			if((speed + 500) > 1300) {
				speed = 1300;
				System.out.println("최대속도입니다");
			} else {
				speed += 500;
			}
			System.out.println("초음속 비행중입니다 : " +speed+ "km/s");
		} 
		System.out.println();
	}
	
	
	public void breakSpeed() {
		if ((speed - 100) <= 900) {
			super.breakSpeed();// 부모쪽 fly를 호출함
		} else {
			speed -= 200;
			System.out.println("초음속 비행중입니다 : " +speed+ "km/s");
		} 
		System.out.println();
	}
}
