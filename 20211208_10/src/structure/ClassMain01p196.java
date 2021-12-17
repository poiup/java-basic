package structure;

public class ClassMain01p196 {
	// PersonClass의 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass내부에 만들어 둿기 때문입니다
	public static void main(String[] args) {
		// 사람을 두명 만들어 보세요.
		PersonClass k = new PersonClass();
		
		k.name = "김씨";
		k.age = 30;
		k.pNum = "010-0001-0001";
		k.uNum = 1;
		k.glasses = true;
				
		PersonClass p = new PersonClass();
		
		p.name = "박씨";
		p.age = 25;
		p.pNum = "010-0002-0002";
		p.uNum = 2;
		p.glasses = false;
		
		// 만든 사람 두명의 정보를 콘솔에 찍어보세요
		
		k.getInfo();
		p.getInfo();
	}
}
