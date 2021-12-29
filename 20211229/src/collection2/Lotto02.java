package collection2;

import java.util.ArrayList;
import java.util.List;

public class Lotto02 {
	public static void main(String[] args) {
		// Lsit 역시 참조형 변수이기 때문에 비교시 주소값끼리 비교합니다.
		// 따라서 단순 == 비교가 아닌 리스트1.equals(리스트2)
		// 를 이용해 주소값이 아닌 실제 힙에 저장된 데이터 비교를 해줘야
		// 로또복권 리스트 내부 숫자가 일치하는지 비교할수 있습니다.
		// equals 내부 요소의 순서까지 같이 비교합ㅂ니다.
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		 System.out.println("주소값 비교 : " + (l1 == l2));
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		System.out.println("리스트 비교 : " + (l1.equals(l2)));
	}
}
