package string1;

import java.util.Scanner;

public class String10P399 {
	
	
	public static void main(String[] args) {
		// 로그인 로직을 만들어보겠습니다
		// 먼저 String id에 여러분이 설정한 임의의 아이디를
		// String pw에 여러분이 설정한 임의의 비밀번호를 저장해주세요
		// 다음 사용자에게 Scanner를 이용해
		// uId 변수에는 아이디 uPw 변수에는 비밀번호를 받아서
		// 조건문을 이용해서 기존 id와 pw가 일치하면
		// "xx님이 로그인하셧습니다"
		// id는 일치하나 비밀번호가 틀리면 "비밀번호가 틀렷습니다."
		// id가 일치하지않으면 "그런 아이디는 없습니다"
		// 라고 출력되도록 코드를 작성해주세요
		Scanner scan = new Scanner(System.in);
		
		String id = "hello";
		String pw = "java";
		
		System.out.println("아이디를 입력해주세요");
		String uId = scan.nextLine();
		// 아이디 확인
		if(id.equals(uId)) {
			// 비밀번호 입력 & id 일치
			System.out.println("비밀번호를 입력해주세요");
			String uPw = scan.nextLine();
			// 비밀번호 확인
			if (pw.equals(uPw)){
				// 비밀번호 일치
				System.out.println(id + "님이 로그인하셧습니다");
			} else {
				// 비밀번호 불일치
				System.out.println("비밀번호가 틀렷습니다");
			}
		} else {
			// 아이디 불일치
			System.out.println("그런 아이디는 없습니다");
		}
		scan.close();
		
	}
}
