package overriding;

public class Main01P265 {
	public static void main(String[] args) {
		// 말과 돼지를 생성해보겟습니다.
		Bird b1 = new Bird();
		b1.name = "짹짹이";
		b1.age = 2;
		b1.food = "잡식성";
		b1.fly = true;
		b1.howl();
		b1.getInfo();
		
		
		Dog d1 = new Dog();
		d1.name = "멍멍이";
		d1.age = 5;
		d1.food = "잡식성";
		d1.nametag = true;
		d1.howl();
		d1.getInfo();
	}
}
