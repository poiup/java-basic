package interface1;

public class Train implements Vehicle{
	// 이 클래스는 Vehicle를 구현하는 클래스입니다.
	// 속도, 연료량, 기관사명을 가집니다
	// 생성자로 기관사명만 초기화하고 연료는 최대치, 속도는 0으로 스타트합니다.
	// 속도제한은 300이며 가속할경우 50씩 증가합니다.
	// 연료는 7씩 잡아먹습니다.
	// 감속도 50씩 이뤄집니다.
	// 연료는 70씩 채웁니다.
	// 만들고 Main02P320에 생성해서 명령을 최소 7회이상 내려주세요.
	
	private int speed;
	private int fuel;
	private String conductor;
	private static final int minSpeed = 0;
	private static final int maxSpeed = 300;
	private static final int accelSpeed = 50;
	private static final int breakSpeed = 50;
	private static final int addFuel = 70;
	private static final int useFuel = 7;
	
	public Train(String name) {
		speed = minSpeed;
		fuel = MAX_GAS;
		conductor = name;
	}

	@Override
	public void accel() {
		speed += accelSpeed;
		if(speed > maxSpeed ) {
			speed = maxSpeed;
		}
		fuel -= useFuel;
	}

	@Override
	public void breakSpeed() {
		speed -= breakSpeed;
		if(speed < minSpeed) {
			speed = minSpeed;
		}
		
	}

	@Override
	public void reFuel() {
		fuel += addFuel;
		if(fuel > MAX_GAS) {
			fuel = MAX_GAS;
		}
		
	}

	@Override
	public void showstatus() {
		System.out.println("속도 : " + speed);
		System.out.println("연료량 : " + fuel);
		System.out.println("기관사 : " + conductor);
		System.out.println("--------------------------");
		
	}
}
