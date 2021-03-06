package constructor;

public class Car {
	
	
	// 자동차의 상태(속성)를 나타내는 변수들
	public int gas;
	public int speed;
	public String owner;
	
	// 자동차 생성자(new키워드로 생성시 실행될 메서드)
	// 리턴 타입은 기입하지 않습니다.
	// 클래스 이름이 Car로 메서드명이 고정됩니다.
	// 생성시 자동으로 호출되기 때문에 무시하고 넘어갈수 없습니다.
	public Car(int g, int s, String o) {
		gas = g;
		speed = s;
		owner = o;
		System.out.println("자동차 생성 완료!");
		System.out.println("연료 : " +gas+ ", 속도 : " + speed + ", 주인 : " + owner);
	}
	
	// 자동차 동작 추가하기
	public void getInfo() {
		System.out.println(gas);
		System.out.println(speed);
		System.out.println(owner);
		System.out.println("------------------");
	}
	
	// 운전 기능 추가하기(가속하기)
	public void accelSpeed () {
		gas -= 2;
		speed += 10;
	}
	
	// 브레이크 기능 추가하기(감속하기)
	public void breakSpeed() {
		speed -= 10;
	}
	
	// 주유기능을 추가해주세요.
	// 메서드명은 putGas() 입니다
	// 한번 주유시 개솔린은 10씩 주유됩니다.
	// 만들고 main쪽에서도 주유도 해 보세요.
	public void putGas() {
		speed = 0;
		gas += 10;
	}
	
}
