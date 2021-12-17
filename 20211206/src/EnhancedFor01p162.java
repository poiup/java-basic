import java.util.Arrays;

public class EnhancedFor01p162 {
	public static void main(String[] args) {
		// 향상된 반복문 진행시 타겟으로 배열을 넣스비낟.
		// 이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼입니다.
		int[] arr1 = {100,211,339,475,591,600,700};
		// arr1[순번]을 입력해서 내부 요소를 하나만 꺼낼수 있음(순번은 0부터 시작)
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[3]);
		// for (하나씩 받을변수 : 배열){
		// 실행문들.........;
		// }
		
		for(int item : arr1) {
			System.out.println(item);
		}
		///////////향상된 for문 이전////////////
		// for (int i = 0; i < 7; i++) {
		//System.out.println(arr1[i]);
		//}
		// 배열에 수정이 들어갔을경우 for문 반복횟수를 매번 수정해줘야됨
	}
}
