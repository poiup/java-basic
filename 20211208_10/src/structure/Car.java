package structure;

public class Car {
	// Car는 내부요소로 변수는 model,price,owner을 가집니다.
	//매서드는 getInfo()를 가져서 위 정보를 콘솔창에 "XXX의 차 정보입니다."
	// "모델명: AAA, 가격 : BBB" 라고 출력합니다.
	
	// 그리고 ClassMain020p196.java을 실행부로 해서 차 2대 생성 후 정보를 콘솔에 찍는
	// 코드를 만들고 main지역이 사라지기 직전 메모리 구조를 그림으로 그려서 제출해주세요.
	
	// 맴버 변수
	// 맴버변수는 어떤 특정한 사물이나 객체의 "정보 혹은 상태"를 나타냅니다.
	public String model;
	public int price;
	public String owner;
	
	// 맴버 메서드
	// 맴버 메서드는 어떤 특정한 사물이나 객체의 "동작"을 나타냅니다
	public void getInfo() {
		System.out.println(owner + "의 차 정보입니다.");
		System.out.println("모델명 : " + model + ", 가격 : " + price);
	}
}
