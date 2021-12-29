package map;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {
	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> menu = new HashMap<>();
		
		menu.put("떡볶이", 3000);
		menu.put("순대", 4000);
		menu.put("튀김" , 500);
		menu.put("치킨", 15000);
		menu.put("콜라", 1000);
		
		System.out.println(menu.get("콜라"));
		System.out.println(menu.get("순대"));
		System.out.println(menu.get("튀김"));
		
	}
}
