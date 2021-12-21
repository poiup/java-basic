package interface1;

// 인터페이스 구현(상속이 아님!) 하기위해서는
// extends 대신에 implements를 사용합니다
// 인터페이스 내부의 추상메서드는 무조건 전부 구현해야합니다.
public class Car implements Vehicle{
	// 자동차라면 가져야 하는 변수 설정
	// 현재속도, 현재 연료량, 차주
	private int speed;
	private int gas;
	private String owner;
	private static final int minSpeed = 0;
	private static final int maxSpeed = 200;
	private static final int accelSpeed = 10;
	private static final int breakSpeed = 10;
	private static final int addGas = 30;
	
	
	
	// 생성자를 만들어주세요. 차주만 입력받고
	// 나머지 요소는 현재 속도 0, 연료량 100을 자동으로 대입해주세요.
	public Car(String owner) {
		this.owner = owner;
		this.gas = MAX_GAS;
		this.speed = minSpeed;
	}
	
	@Override
	public void accel() {
		
		if(speed + accelSpeed > maxSpeed) {
			speed = maxSpeed;
		} else {
			speed += accelSpeed;
		}
		// 가속 로직을 전부 확인한 다음
		gas --;
		
	}

	@Override
	public void breakSpeed() {
		// 한번 감속할때마다 속도가 10씩 줄도록 해주세요.
		// 단, 속도가 0 미만이 될수 없습니다.
		if(speed - breakSpeed < minSpeed) {
			speed = minSpeed;
		} else {
			speed -= breakSpeed;
		}
		
	}

	@Override
	public void reFuel() {
		// 연료는 다시 채울때마다 30씩 채워줍니다.
		// 단, 연료 최대값은 상수 MAX_GAS를 이용해서 측정해주세요.
		if(gas + addGas > MAX_GAS) {
			gas = MAX_GAS;
		} else {
			gas += addGas;
		}
		
	}

	@Override
	public void showstatus() {
		System.out.println("Speed : " + speed);
		System.out.println("gas : "+ gas);
		System.out.println("owner : "  + owner);
		System.out.println("---------------------");
		
	}
	
}
