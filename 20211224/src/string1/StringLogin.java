package string1;

import java.util.Scanner;

public class StringLogin {
	 Scanner scan = new Scanner(System.in);
	private String id = "hello";
	private String pw = "java";
	
	// 로그인 매서드
	public void login(String uId, String uPw) {
		if(id.equals(uId) && pw.equals(uPw)) {
			System.out.println(id + "님이 로그인하셧습니다");
		} else if (id.equals(uId)){
			System.out.println("비밀번호가 틀렷습니다");
			// 패스워드 재입력
			rePw(uId, uPw);
		} else {
			System.out.println("그런 아이디는 없습니다");
		}
	}
	
	// 패스워드 재입력 매서드
	public void rePw(String uId, String uPw) {
		System.out.println("비밀번호를 다시 입력해주세요");
		uPw = scan.nextLine();
		login(uId, uPw);
	}
}
