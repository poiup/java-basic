
public class EnhancedFor02p162 {
	public static void main(String[] args) {
		// 다음 학생들의 과목별 성적입니다.
		// math = 96,23,52,82,72,31,58
		// eng =  62,42,68,31,80,77,45
		// com =  10,28,39,74,65,90,98
		// 위 3개의 병칭으로 array를 만들어 담아주신다음
		// 과목별 평균점수를 enhanced for 문을 이용해 구한다음
		// 콘솔창에 출력해주세요
		// 힌트 : arr1.length 배열의 길이

		int math[] = {96,23,52,82,72,31,58};
		int eng[] = {62,42,68,31,80,77,45};
		int com[] = {10,28,39,74,65,90,98};
		int mathtotal =0,engtotal =0,comtotal =0;
		
		// 수학평균
		for(int sum : math) {
			mathtotal +=sum;
		}
		System.out.println("수학평균 : " + mathtotal/math.length);
		
		// 영어평균 일반for문으로 제작
		for(int i =0; i< eng.length; i++) {
			engtotal += eng[i];
		}
		System.out.println("영어평균 : " + engtotal/eng.length);
		
		// 컴퓨터평균
		for(int sum : com) {
			comtotal +=sum;
		}
		System.out.println("컴퓨터평균 : " + comtotal/com.length);
		
	}	
}
