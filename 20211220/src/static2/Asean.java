package static2;

public class Asean {
	// 출석(check), 중간고사(midTerm), 기말고사(finalTerm)을 변수로 설정해주세요
	// 위 변수들은 개별 객체가 따로따로 관리하는 변수들입니다.
	private int check;
	private int midTerm;
	private int finalTerm;
	// 공용 발표점수인 presentationScore를 Static으로 만들어주세요.
	private static int presentationScore = 19;
	// 이 점수는 19점 입니다.
	// public 으로 설정하면 바로 System.out.println()으로 조회 가능하고
	// private인 경우는 오로지 static메서드를 통해서만 조회할수 있습니다.
	
	public Asean(int check, int midTerm, int finalTerm) {
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;		
	}
	// 생성자는 객체 생성시 출석 중간 기말 점수만 받아서 초기화합니다.

	public void showAseanInfo() {
		System.out.println("출결 점수 : " + check);
		System.out.println("중간고사 점수 : " + midTerm);
		System.out.println("기말고사 점수 : " + finalTerm);
		System.out.println("발표 점수 : " + presentationScore);
		System.out.println();
	}
	// 일반 메서드로 showAseanInfo()를 생성해주시되 성적 전체를 콘솔에 조회하게 해주세요.
	// 중간고사 : xx점, 기말고사 : YY점 .....
	
	// private static은 같은 static영억에서 접근할수
	public static int getPresentationScore () {
		return presentationScore;
	}
	
	public static void showPre() {
		System.out.println("Asean 조 발표 점수는 : " + presentationScore);
	}
	// 위 요소 정의후 Main01P276.java를 생성해서 구성원 4명을 만들어서 활용해보세요.
	
}
