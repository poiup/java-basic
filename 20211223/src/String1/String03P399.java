package String1;

import java.util.Scanner;

public class String03P399 {
	public static void main(String[] args) {
		// scanner를 통해서 전체 문장을 입력받으세요.
		// 다음으로 문장내에서 찾고싶은 단어를 추가로 입력받으세요.
		// 문장 내에 있는 단어들의 인덱스 번호와, 몇개가 검출되었는지
		// 출력해주는 코드를 작성해보세요
		
		Scanner scan = new Scanner(System.in);
		
		// 전체문장
		System.out.println("전체 문장을 입력해주세요");
		String sentence = scan.nextLine();
		// 검색할 단어
		System.out.println("문장 내에서 카운팅할 단어를 입력해주세요");
		String searchVoca = scan.nextLine();
		
		// 검색시작할 단어의 인덱스
		int wordCount = 0;
		// 검색한 단어 개수
		int count = 0;
		while(true) {
			wordCount = sentence.indexOf(searchVoca,wordCount);
			// 더이상 찾는 단어가 없을시
			if(wordCount < 0) {
				// 반복문 탈출
				break;
			} else {			
				// 몇번째 찾았는지 카운트
				count ++;
				System.out.println(wordCount + "번 인덱스에서 " + count+"번째 " + searchVoca + "이(가) 검출되었습니다.");
				// 같은 인덱스값을 다시 찾는것을 방지
				wordCount ++;
			}
		}
		System.out.println();
		System.out.println("문장내 " + searchVoca + " 는 " + count + " 개 있습니다.");
	}
}
