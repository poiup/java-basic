package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01P447 {
	public static void main(String[] args) {
		// List는 생성자료형으로 ArrayList, LinkedList를 받을수 있고
		// 기본적으로는 ArrayList를 쓰게됩니다.
		// java.util의 LIst나 ArrayList를 사용할수 있습니다.
		
		// List는 생성시 List<자료형> 을 적어넣어 해당 자료형을 
		// 가변 길이 배열형태로 받아줄수 있습니다.
		// <>사이에는 기본형자료(int, double, boolean 등)은 올수 없습니다.
		
		// 정수 자료를  받을수 있는 리스트 생성(길이는 가변적)
		List<Integer> list1 = new ArrayList<>();
		
		// 가변자료형이므로 추가하고 싶은만큼 자료 추가 가능
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(1, 100); // 변경이 아닌 추가 1번 인덱스부터 뒤로 한칸씩 밀어준뒤 빈공간에 넣음
		System.out.println(list1);
		list1.set(1, 99); // set은 추가가 아닌 교체가 들어갑니다.
		System.out.println(list1);
		
		Collections.sort(list1);
		
		
	}
}
