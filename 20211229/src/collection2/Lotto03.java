package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Lotto03 {
	static Random random = new Random();
	
	// 번호뽑기 메서드
	public static void lottoLogic(List<Integer> lotto) {
		int result = random.nextInt(45) + 1;
		while(lotto.size() < 6) {
			if(lotto.contains(result)) {
				// 같은번호일시 다시뽑기
				result = random.nextInt(45) +1 ;
			} else {
				// 다른번호일시 리스트에 추가
				lotto.add(result);
			}
		}
		// 로또비교를 위한 정렬
		Collections.sort(lotto);
	}
	
	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복회수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사.
		List<Integer> lotto = new ArrayList<>();
		List<Integer> myLotto = new ArrayList<>();
		long trycount = 1;
		
		lottoLogic(lotto);
		lottoLogic(myLotto);
		
		// 로또번호와 내번호가 같으면 while 탈출
		while(lotto.equals(myLotto) != true) {
			// 반복횟수 증가
			trycount ++;
			// 기존 리스트 삭제
			myLotto.removeAll(myLotto);
			// 로또번호 다시뽑기
			lottoLogic(myLotto);
			System.out.println("로또 당첨번호 : " + lotto);
			System.out.println("내 로또번호 : " + myLotto);
			System.out.println();
		}
		System.out.println("당첨되었습니다");
		System.out.println("총 " + trycount + "회 로또를 구매했으며, " + trycount * 5000 + "원 어치 로또입니다.");
	}
}
