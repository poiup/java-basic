package arrays1;

import java.util.Arrays;

public class Arrays03 {
	public static void main(String[] args) {
		// Arrays.copyOfRange()는 copyOf()와 유사하지만
		// 시작이 0번인덱스로 고정되는 copyOf()와 달리
		// copyOfRange(복사할 배열, 시작번호, 끝번호+1);
		// 와 같이 시작지점과 끝지점을 둘다 정해줄수있습니다.
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
		
		int[] arrCopy = Arrays.copyOfRange(arr, 3, 7);
		System.out.println(Arrays.toString(arrCopy));
		
		int[] arrCopy2 = Arrays.copyOfRange(arr, 5, 15);
		System.out.println(Arrays.toString(arrCopy2));
	}
}
