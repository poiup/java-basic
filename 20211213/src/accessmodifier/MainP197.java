package accessmodifier;

public class MainP197 {
	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 하세요
		Warrior w1 = new Warrior("w1");
		// w1.hp = 10000000;// private 요소를 이용해서 막아줘야함
		w1.hunt();
		w1.hunt();
		w1.hunt();
		
		w1.status();
	}
}