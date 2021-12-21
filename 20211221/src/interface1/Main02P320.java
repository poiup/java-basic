package interface1;

public class Main02P320 {
	public static void main(String[] args) {
		Vehicle t1 = new Train("기차장");
		
		t1.accel();
		t1.accel();
		t1.accel();
		t1.showstatus();
		t1.breakSpeed();
		t1.breakSpeed();
		t1.breakSpeed();
		t1.showstatus();
		t1.reFuel();
		t1.reFuel();
		t1.showstatus();
	}
}
