package overloading;

public class Main02 {
	// 알바생 둘을 만들어주세요.
	// 하나는 시급을 15000원으로 해 주시고
	// 다른하나는 입력없이 생성해주세요.
	
	public static void main(String[] args) {
		Parttimer p1 = new Parttimer(true, 15000, "맛집", "김알바");
		Parttimer p2 = new Parttimer(false, "맛집", "최알바");
		Parttimer p3 = new Parttimer(true, -1000, "맛집", "이알바");
	}
}
