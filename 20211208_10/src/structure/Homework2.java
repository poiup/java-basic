package structure;

public class Homework2 {
	public static void getInfo (HPerson p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.address);
	}
	public static void main(String[] args) {
		
		HPerson a = new HPerson();
		a.name = "OOO";
		a.age = 25;
		a.pNum = "010-0101-1010";
		a.address = "부산";
		
		HPerson b = new HPerson();
		b.name = "ㅇㅇㅇ";
		b.age = 20;
		b.pNum = "000-0000-0000";
		b.address = "seoul";
		getInfo(a);
		getInfo(b);
	}
}
