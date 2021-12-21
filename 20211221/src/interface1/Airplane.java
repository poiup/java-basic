package interface1;

public class Airplane implements Vehicle{
	private int speed;
	private static final int minSpeed = 0;
	private static final int maxSpeed = 900;
	private static final int accelSpeed = 400;
	private static final int breakSpeed = 300;
	private int fuel;
	private static final int minFuel = 0;
	private static final int maxFuel = 1000;
	private static final int useFuel = 150;
	private static final int reFuel = 500;
	private String captain;
	
	
	public Airplane (String name) {
		speed = minSpeed;
		fuel = minFuel;
		captain = name;
	}
	
	@Override
	public void accel() {
		speed += accelSpeed;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
		fuel = useFuel;
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
		fuel += reFuel;
		if(fuel > maxFuel) {
			fuel = maxFuel;
		}
		
	}
	@Override
	public void showstatus() {
		System.out.println("현재 속도 : " + speed);
		System.out.println("연료량 : " + fuel);
		System.out.println("기장 : " + captain);
		System.out.println("----------------------");
	}
}
