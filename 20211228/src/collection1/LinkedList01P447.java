package collection1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01P447 {
	public static void main(String[] args) {
		// LinkedList는 자료의 변경이 빈번할때 사용하면 성능 향상이 있습니다.
		// 일반적인 상황에서는 ArrayList를 더 많이 쓰고
		// 결과적으로는 양 자료형간 사용법 차이는 없고 로직만 다릅니다.
		List<String> list1 = new LinkedList<>();
		
		// ArrayList : 데이터를 타이트하게 가져갈수있다 // 데이터량이 많아질수록 수정시 처리할
		// 이동이 많아진다
		
		// LinkedList :  자료의 변경이 빈번할때 사용하면 성능 향상이 있습니다. 
		// 데이터를 많이먹음, 자료가 아무리많아도 처리할 이동은 그대로다
		
		list1.add("자바");
		list1.add("jsp");
		list1.add("스프링");
		list1.add("스프링부트");
		System.out.println(list1);
		
		// .remove()는 두 유형이 있습니다.
		// .remove(번호)를 넣으면 해당 인덱스의 자료가 삭제되고
		// .remove(자료)를 넣으면 번호와 상관없이 자료를 삭제합니다.
		list1.remove(0);
		System.out.println(list1);

		list1.remove("스프링");
		System.out.println(list1);
		
		// 리스트를 전체적으로 비우고 싶을때는 .clear()를 사용합니다.
		list1.clear();
		System.out.println(list1);
		
		
		list1.add("사과");
		list1.add("딸기");
		list1.add("망고");
		list1.add("블루베리");
		list1.add("파인애플");
		
		// 자료 정렬은 Collections.sort(정렬대상) 입니다.
		Collections.sort(list1);
		
		// 가나다순으로 정렬됬음
		System.out.println(list1);
	}
}
