package casting;

public class Main01 {
	public static void main(String[] args) {
		// Animal타입은 어떤 자료형이건 받을수 있다.
		// Cat, Dog, Animal을 하나씩 만들어주세요.
		// Animal c1 ,d1 ,a1 으로 받아주세요.
		Animal d1 = new Dog("멍멍이", 4);
		Animal c1 = new Cat("고양이", 2);
		Animal a1 = new Animal("동물", 3);
		
		// c1, d1, a1에 .sit()을 각각 호출해보세요.
		c1.sit();
		d1.sit(); // Animal, Dog에 동시에 있는자원은 접근 가능
		// d1.bark(); // Dog에만 있는 자원에는 접근이 불가
		a1.sit();
		
		// 각 자료형에 맞는 변수로 바꿔서 대입하겠습니다.
		Cat cat = (Cat)c1; // c1은 Animal타입이지만 힙에 저장된 데이터가 Cat이므로 Cat으로 변환가능
		cat.jump();
		
		Dog dog = (Dog)d1;
		dog.bark();
	}
}
