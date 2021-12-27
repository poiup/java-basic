package arrays1;

import java.util.Arrays;

public class Arrays06 {
	public static void main(String[] args) {
		// 유니코드를 활용하는 모든 문자
		String[] arr = {"안재영", "靑安","🤣","ダウンロ", "apple"};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(String i : arr) {
			
			int num = Integer.parseInt(i);
			System.out.println(i);
		}
	}
}
