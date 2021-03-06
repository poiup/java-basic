package game.accessmodifier;

public class Magician extends Commoner {
	private int mDam;
	public Magician(String name) {
		super(name);
	}

	
	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		// hp -= 2; 를 직접 실행할수 없으므로
		// public 인 setter을 이용합니다.
		// setHp(5) 인 경우, 기존의 값 대신 hp변수를 5로 교체해달라는 요청임
		// 현재 원하는것은, 현 hp값에서 사냥할때마다 2씩 체력이 깎이는것입니다.
		setHp(getHp()-2);
		// 경험치도 마찬가지로 setExp();
		// 현재 원하는것은, 현 exp에서 10씩 올라가는것입니다.
		setExp(getExp()+10);
	}
	// fireball 메서드를 생성해주세요.
	// 마나가 3줄고, 경험치는 20증가합니다.
	public void fireball() {
		setMp(getMp()-3);
		setExp(getExp()+20);
		System.out.println("파이어볼을 사용합니다");
	}
	// heal메서드를 생성해주세요.
	// 마나가 2줄고 체력이 10 회복합니다.
	public void heal() {
		setMp(getMp()-2);
		setHp(getHp()+10);
	}
	
	
	public void getInfo() {
		System.out.println("닉네임 : " +getName());
		// 심지어 private요소는 수정이 아닌 조회도 불가능합니다.
		System.out.println("현제 체력 : " +getHp());
		// 체력 뿐만 아니라 나머지 요소들도 조회할수있도록 코드를 추가해주세요.
		System.out.println("현재 마나 : " + getMp());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println();
	}
}
