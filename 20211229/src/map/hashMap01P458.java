package map;

import java.util.HashMap;
import java.util.Map;

public class hashMap01P458 {
	public static void main(String[] args) {
		// Map인터페이스의 대표 구현체는 HashMap입니다.
		// 제너릭 내부에는 <key자료형 , value자료형>으로 작성합니다.
		Map<String, String> map = new HashMap<>();
		map.put("안재영", "자바");
		map.put("코로나", "백신");
		map.put("김개발", "JSP");
		System.out.println(map);
		
		// 자료 조회시는 .get(key값)으로 조회합니다.
		// map은 키로 벨류를 조회하는건 가능하지만 역으로 벨류로 키를 조회하는건 불가능합니다.
		// 없는 키값으로 조회하면 null이 나온다.
		// 인덱스번호도 없습니다.
		System.out.println(map.get("안재영"));
		System.out.println(map.get("자바"));

		// remove는 key를 이용해서 key = value 전체를 삭제합니다.		
		map.remove("코로나");
		System.out.println(map);
		
		// .size()는 크기를 알려줍니다. 정수로 몇개의 key = value쌍이
		// 저장되어있는지 알려줍니다.
		System.out.println(map.size());
	}
}
