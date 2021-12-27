package arrays1;

import java.util.Arrays;

public class Arrays01 {
	public static void main(String[] args) {
		// 이진 탐색(binary search)은 탐색 알고리즘중
		// 상위권의 성능을 보여주는 알고리즘입니다.
		// 다만, 실행에 앞선 전제조건으로
		// 1. 배열 내부에 중복되는 값이 없을것
		// 2. 배열이 오름차순(작은 숫자일수록 0번 인덱스에 가깝게)이어야 함
		
		// 정렬이 안된 상태의 배열 내부를 탐색할때는 찾지 못함
		int[] arr1 = {5, 7, 6, 1, 3, 9, 0, 12};
		
		// 이진탐색 수행 명령어 : Arrays.binarysearch(배열명. 찾는값);
		// 이진 탐색 반으로 나눠서 low middle high를 확인후 middle보다 
		// 낮거나 높으면 다시 반으로 잘라 다시 확인을 해가며 찾음 한번의 비교로 배열의 절반씩 확인하기때문에
		// 굉장히 효율적임 하지만 크기순으로 정렬되지 않으면 찾지못함
		int a = Arrays.binarySearch(arr1, 0);
		System.out.println(a);
		
		// 정렬된 상태의 배열을 탐색하는경우
		int[] arr2 = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		
		int b = Arrays.binarySearch(arr2, 14);
		System.out.println(b);
	}
}
