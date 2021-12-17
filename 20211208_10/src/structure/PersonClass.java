package structure;

public class PersonClass {
	// 사람정보를 Person에서 만들었던것 처럼 만들어주시되
	// 여러분들이 추가하고 싶은 특성을 하나 더 추가해서 만들어주세요
	public String name; // 이름
	public int age; 	// 나이
	public String pNum;	// 연락처
	public int uNum;	// 번호
	public boolean glasses;// 안경여부
	
	// 추가로 아까의 조회 매세드를 내부에 생성해주세요
	// 클래스 내부에 생성할때는 static을 적지 않습니다.
	// 클래스는 자기와 같은 지역에 있는 요소를 소속명시 없이 조회 가능합니다.
	public void getInfo() {
		System.out.println(name + "의 정보를 조회합니다.");
		System.out.println("이름 : " + name +
				", 나이 : " + age +
				", 전화번호 : " + pNum +
				", 번호 : "+ uNum+
				", 안경여부 : "+ glasses);
		System.out.println("=====================================");
	}
}
