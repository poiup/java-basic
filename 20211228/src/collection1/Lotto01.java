package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto01 {
	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1~45범위에서 겹치는 숫자없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
		// ArrayList의 정렬은 .sort() 대신
		// Collections.sort(ArrayList)를 사용합니다.
		Random random = new Random();
		// 1등번호
		List<Integer> Lotto = new ArrayList<>();
		// 2등번호
		int result = random.nextInt(45)+1;
		// 당첨번호 추첨
		for(int i = 0; i < 6; i++) {
			result = random.nextInt(45)+1;
			// 번호 중복여부 확인
			if(Lotto.contains(result)) {
				// 중복시 다시
				i--;
			} else {
				// 번호 확정
				Lotto.add(result);
			}
		}
		// 2등번호 뽑기
		while(Lotto.contains(result)) {
			result = random.nextInt(45)+1;
		}
		// 작은수부터 정렬
		Collections.sort(Lotto);
		// 콘솔에 찍기
		System.out.println("추첨된 번호 : " + Lotto);
		System.out.println("추첨된 2등 번호 : " + result);
		
	}
}
